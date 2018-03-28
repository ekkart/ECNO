package dk.dtu.compute.se.ecno.ide.builders.util;

import static dk.dtu.compute.se.ecno.ide.builders.Activator.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.AbstractTextEditor;

import dk.dtu.compute.se.ecno.ide.builders.Activator;
import dk.dtu.imm.se.ecno.model.generator.util.ECNO_M2JGeneratorUtil;

/**
 * 
 * @author All
 *
 */
public class Util {

	/**
	 * The string value used to mark pnml URI's in the generated Javadoc. Must
	 * be in sync with the Jet Emitters
	 */
	// TODO make the Jet emitters refer this constant
		// public static final String SEE_PNML_START = "@see-pnml-start";
		// public static final String SEE_PNML_END = "@see-pnml-end";
		// public static final String SEE_ECNOGEN = "@see-ecnogen";

	// XXX very bad idea to do this with a static variable! Actually, the way this
	//     is done, we would not need it at all
	// private static List<GeneratedBlock> listblocks = new ArrayList<GeneratedBlock>();
		

	/**
	 * Parses a java file to an AST.
	 * @param file The file to parse
	 * @return The AST
	 * 
	 * @author Tobias
	 * @author Jannik
	 */
	protected static ASTNode parse(ICompilationUnit unit) {
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(unit);
		parser.setResolveBindings(true);
		return parser.createAST(null);
	}
	
	public static ASTNode getASTNode(final IFile file) {
		final ICompilationUnit unit = JavaCore.createCompilationUnitFrom(file);

		ASTNode node = parse(unit);
		
		return node;


	}

	/**
	 * Returns the URI located in the javadoc of the method overlapping this
	 * marker's start index.
	 * <p/>
	 * If the URI can't be extracted this method returns null. Reasons includes:
	 * <ul>
	 * <li>The marker doesn't point to a java file</li>
	 * <li>The marker has no start index</li>
	 * <li>There location is not in a java method.</li>
	 * <li>There is not a valid "see" tag in the javadoc for the method.</li>
	 * </ul>
	 * 
	 * @param marker A problem marker
	 * @return The URI of the ECNO element that corresponds to this marker.
	 * 
	 * @author Tobias
	 * @author Jannik
	 */
	public static URI getEcnoUri(final IMarker marker) {
		int charStart;

		// Safely get the attribute "CHAR START"
		try {
			charStart = (Integer) marker.getAttribute(IMarker.CHAR_START);
		} catch (final ClassCastException e) {
			// This should not happen since CHAR_START should always be an
			// Integer
			log().error("Can't get CHAR_START from marker: " + marker, e);
			return null;
		} catch (final NullPointerException e) {
			// This will only happen if the marker has no CHAR_START value,
			// which is extremely unlikely.
			// We therefore don't handle it, but just return null instead.
			log().error("Can't get CHAR_START from marker: " + marker, e);
			return null;
		} catch (final CoreException e) {
			// Thrown if the actual marker doesn't exists. This is unlikely, so
			// we just log the error.
			log().error("Can't get CHAR_START from marker: " + marker, e);
			return null;
		}
		IResource resource = marker.getResource();
		return getEcnoUri(resource,charStart);
	}
	
	public static URI getEcnoUri(IResource resource, int charStart) {

		if (resource instanceof IFile) {
			// XXX quick fix to at least clean the generated block list
			// List<GeneratedBlock> listblocks = new ArrayList<GeneratedBlock>();
			
			ICompilationUnit unit = JavaCore.createCompilationUnitFrom((IFile) resource);

			ASTNode node = parse(unit);
			CompilationUnit u = (CompilationUnit) node;
			List<?> list = u.getCommentList();

			outer: for (int i = 0; i < list.size(); i++) {
				// XXX fixed condition i < list.size()
				Object startObject = list.get(i);
				if (startObject instanceof Javadoc) {
					Javadoc startComment = (Javadoc) startObject;
					@SuppressWarnings("rawtypes")
					List startTags = startComment.tags();
					if (startTags.size() == 1) {
						Object startTagObject = startTags.get(0);
						if (startTagObject instanceof TagElement) {
							TagElement startTag = (TagElement) startTagObject;
							if (ECNO_M2JGeneratorUtil.SEE_PNML_START.equals(startTag.getTagName())) {
								int startpos = startComment.getStartPosition();
								if (charStart < startpos) {
									// we passed the position already
									break outer;
								}
								for (int j = i+1; j < list.size(); j++) {
									Object endObject = list.get(j);
									if (endObject instanceof Javadoc) {
										Javadoc endComment = (Javadoc) endObject;
										@SuppressWarnings("rawtypes")
										List endTags = endComment.tags();
										if (endTags.size() == 1) {
											Object endTagObject = endTags.get(0);
											if (endTagObject instanceof TagElement) {
												TagElement endTag = (TagElement) endTagObject;
												if (ECNO_M2JGeneratorUtil.SEE_PNML_END.equals(endTag.getTagName())) {
													int endpos = endComment.getStartPosition();
													if (charStart < endpos) {
														// found enclosing pair for position
														@SuppressWarnings("rawtypes")
														List fragments = startTag.fragments();
														if (fragments.size() == 1) {
															Object objectText = fragments.get(0);
															if (objectText instanceof TextElement) {
																// Returns null if the text element isn't an URI.
																return createUri(((TextElement) objectText).getText());
															} else {
																return null;
															}
														}
													} else {
														continue outer;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} 
		
		return null;
	}

	/**
	 * Safely creates an URI object from a string.
	 * 
	 * @param uriString The uri as a string.
	 * @return The constructed URI or null if it couldn't be created.
	 * @author Tobias
	 */
	private static URI createUri(String uriString) {
		if (uriString == null) {
			return null;
		}

		uriString = uriString.trim();

		if (uriString.isEmpty()) {
			return null;
		} else {
			try {
				return URI.createURI(uriString.trim());
			} catch (final IllegalArgumentException e) {
				// Is thrown if the string is not a real URI.
				final String msg = "Couldn't create fragmet URI from string: "
						+ uriString;
				log().error(msg, e);
				return null;
			}
		}
	}

	/**
	 * Method that finds source files that contains a class with a given name
	 * that contains a method tagged with a given URI and opens a default editor
	 * at this position.
	 * 
	 * @param objectURI
	 *            The URI to look for in JavaDocs
	 * @param className
	 *            Name of class files to look in
	 * @param projectURI
	 *            URI to the project to search in
	 * @param shell
	 *            Shell to use when opening editor
	 * @param page
	 *            Page to use when opening editor
	 *            
	 * @author Mikkel
	 * @author Andreas
	 */
	public static void findSource(final String objectURI,
			final String className, final String projectURI, final Shell shell,
			final IWorkbenchPage page) {

		// Find project name. (use regex later)

		final Map<URI, ElementLocation> elements = new HashMap<URI, ElementLocation>();
		String uri = projectURI;
		uri = uri.replace("platform:/resource/", "");
		final String projectName = uri.substring(0, uri.indexOf('/'));

		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

		try {
			project.accept(new ActionVisitor(className, objectURI, elements));
		} catch (final CoreException e) {
			// Very unlikely as our visitor doesn't throw any CoreExceptiosn
			// (see JavaDoc for accept() )
			Activator.log().error("Error when finding java files.", e);
		}

		if (elements.size() == 1) {

			final ElementLocation elementLoc = elements.values().iterator().next();
			openJavaEditor(elementLoc, page);
		} else if (elements.size() > 1) {

			Map<String, URI> strings = new HashMap<String, URI>();

			for (URI elementUri : elements.keySet()) {
				String s = elementUri.toString();
				s = s.replace("platform:/resource/", "");
				strings.put(s, elementUri);
			}
			final ListDialog dialog = new ListDialog(shell);
			dialog.setTitle("Select ECNOGen file");
			dialog.setMessage("Multiple versions has been create. Select the ECNOgen file used to generate code.");
			dialog.setContentProvider(new ArrayContentProvider());
			dialog.setLabelProvider(new LabelProvider());
			dialog.setInput(strings.keySet());
			if (dialog.open() == ListDialog.OK) {
				final Object[] dialogResult = dialog.getResult();
				if (dialogResult.length > 0) {
					final String result = (String) dialogResult[0];
					openJavaEditor(elements.get(strings.get(result)), page);
				}
			}
		} else {
			String error = "No Java file found.";
			Activator.log().error(error);
			MessageDialog.openError(shell, "Error",
					"No corresponding Java file found.");
		}
	}

	/**
	 * Method to open an ECNO nets editor based on a URI of an object in some
	 * model.
	 * 
	 * @param uri
	 *            The URI of the object that must be in the model opened in the
	 *            editor.
	 * @param page
	 *            Page the editor should be opened on.
	 *            
	 * @author Mikkel
	 * @author Tobias
	 */
	public static void openECNOEditor(final URI uri, final IWorkbenchPage page) {
		final String platformString = uri.toPlatformString(false);
		final IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		final IResource fileResource = wsRoot.findMember(platformString);
		if (fileResource instanceof IFile) {
			try {
				final IEditorPart editor = IDE.openEditor(page,
						(IFile) fileResource, true);
				gotoUri(editor, uri);
			} catch (final PartInitException e) {
				throw new IllegalArgumentException(
						"Could not open editor for file. " + fileResource, e);
			}
		} else {
			throw new IllegalArgumentException(
					"The URI does not refer to a workspace file");
		}
	}

	/**
	 * Focus an editor to show a specific item, identified by its
	 * URI.
	 * 
	 * @param editor
	 *            Editor to focus.
	 * @param uri
	 *            URI to focus editor to.
	 *            
	 * @author Andreas
	 */
	private static void gotoUri(final IEditorPart editor, final URI uri) {
		final IMarker marker = createMockMarker(uri);
		IDE.gotoMarker(editor, marker);
	}

	/**
	 * Creates a mock marker that implements IMarker, but is not handled by
	 * the Eclipse resource management.
	 * 
	 * @param uri
	 *            URI the marker should point to.
	 * @return A new MockMarker for the input URI.
	 * 
	 * @author Tobias
	 */
	private static IMarker createMockMarker(final URI uri) {
		// Since we only use this for ECNO i.e. ePNK, the type will always be
		// EValidator.MARKER
		// This type could be derived from the URI in the future.
		final String markerType = EValidator.MARKER;

		// The only attribute used by the ePNK is the URI.
		final Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put(EValidator.URI_ATTRIBUTE, uri.toString());

		return new MockMarker(markerType, attributes);
	}

	/**
	 * Opens a Java Editor on a specific page based on an
	 * ElementLocation
	 * 
	 * @param elementLoc
	 *            The location the editor should open at
	 * @param page
	 *            The page the editor should be opened in.
	 * @author Mikkel
	 * @author Tobias
	 */
	private static void openJavaEditor(final ElementLocation elementLoc,
			final IWorkbenchPage page) {
		final IFile file = elementLoc.getFile();
		final int position = elementLoc.getPosition();

		final IEditorDescriptor desc = PlatformUI.getWorkbench()
				.getEditorRegistry().getDefaultEditor(file.getName());

		try {
			final IEditorPart editor = page.openEditor(
					new FileEditorInput(file), desc.getId());
			editor.setFocus();

			if (editor instanceof AbstractTextEditor) {

				final AbstractTextEditor cu = (AbstractTextEditor) editor;
				cu.selectAndReveal(position, 0);
			}
		} catch (final PartInitException e) {
			Activator.log().error("Couldn't open editor for file: " + file, e);
		}
	}

	/**
	 * Visitor class intended to go through files in a project searching for a
	 * specific filename. Once that is found it will instantiate an ASTVisitor
	 * that looks for a javadoc containing a specific URI and if found, saves
	 * the location of this method.
	 * 
	 * @author Mikkel
	 * 
	 */
	private static class ActionVisitor implements IResourceVisitor {

		private final String className;
		private final String objectURI;
		private final Map<URI, ElementLocation> elements;

		/**
		 * Constructor that takes a classname to look for, a URI that should be
		 * searched in these classes and a map where the results should be
		 * stored
		 * 
		 * @param className
		 *            Name of the class to search for.
		 * @param objectURI
		 *            URI to search for in JavaDocs in the given classes.
		 * @param elements
		 *            A map that the results should be stored in.
		 */
		public ActionVisitor(final String className, final String objectURI,
				final Map<URI, ElementLocation> elements) {
			this.className = className;
			this.objectURI = objectURI;
			this.elements = elements;
		}
		@Override
		public boolean visit(final IResource resource) throws CoreException {
			if (resource instanceof IFile) {
				final IFile file = (IFile) resource;
				final String fileName = file.getName();
				if (fileName.equals(className + ".java")) {
					final ASTNode node = Util.getASTNode(file);

					node.accept(new ActionASTVisitor(objectURI, file, elements));
				}
			}

			return true;
		}

	}

	/**
	 * Visitor that goes through an AST for a specific class searching for
	 * JavaDoc containing a given URI and fills a map with locations where this
	 * was found.
	 * 
	 * @author Mikkel
	 * 
	 */
	private static class ActionASTVisitor extends ASTVisitor {

		private final String objectURI;
		private final IFile file;
		private URI ecnogen;
		private final Map<URI, ElementLocation> elements;

		/**
		 * Constructs a visitor that finds occurences of a specific URI in the
		 * AST and stores the location of the URI in the given map with
		 * information about which file it originated from.
		 * 
		 * @param objectURI
		 * @param file
		 * @param elements
		 */
		public ActionASTVisitor(final String objectURI, final IFile file,
				final Map<URI, ElementLocation> elements) {
			super(true);
			this.objectURI = objectURI;
			this.file = file;
			this.elements = elements;
		}

		/**
		 * Method the extracts the text element from a TagElement.
		 * 
		 * @param tag
		 *            TagElement that text should be extracted from.
		 * @return TextElement found in the TagElement
		 * 
		 * @author Andreas
		 */
		private TextElement getTextElement(final TagElement tag) {
			@SuppressWarnings("rawtypes")
			final List fragments = tag.fragments();
			if (fragments != null && fragments.size() == 1) {
				final Object objectText = fragments.get(0);
				if (objectText instanceof TextElement) {
					return (TextElement) objectText;
				}
			}
			return null;
		}

		@Override
		public boolean visit(final TagElement tag) {
			if ("@see-pnml".equals(tag.getTagName())) {
				final TextElement text = getTextElement(tag);
				if (ecnogen != null && text != null
						&& text.getText().trim().equals(objectURI)) {
					elements.put(ecnogen, new ElementLocation(file, text));
				}
			} else if ("@see-ecnogen".equals(tag.getTagName())) {
				final TextElement text = getTextElement(tag);
				ecnogen = URI.createURI(text.getText());

			}
			return false;

		}
	}

	/**
	 * Data class to store information about the locations where URI's were
	 * found in a project. Contains a file and an integer position.
	 * 
	 * @author Mikkel
	 * @author Tobias
	 */
	public static class ElementLocation {
		private final IFile file;
		private final int position;

		public ElementLocation(final IFile file, final int position) {
			this.file = file;
			this.position = position;
		}

		public ElementLocation(final IFile file, final TextElement element) {
			this.file = file;
			this.position = element.getStartPosition();
		}

		public IFile getFile() {
			return file;
		}

		public int getPosition() {
			return position;
		}

	}
}
