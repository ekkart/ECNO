package dk.dtu.compute.se.ecno.ide.builders;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

/**
 * @author Tobias
 */
public class Logger {

	private final Plugin plugin;
	private final String pluginId;

	public Logger(final Plugin plugin) {
		this.plugin = plugin;
		this.pluginId = plugin.getBundle().getSymbolicName();
	}


	public void info(final String message) {
		log(new Status(Status.INFO, pluginId, message));
	}

	public void warning(final String message) {
		log(new Status(Status.WARNING, pluginId, message));
	}

	public void warning(final String message, final Throwable exception) {
		log(new Status(Status.WARNING, pluginId, message, exception));
	}

	public void error(final String message) {
		log(new Status(Status.ERROR, pluginId, message));
	}

	public void error(final String message, final Throwable exception) {
		log(new Status(Status.ERROR, pluginId, message, exception));
	}

	private void log(final IStatus status) {
		plugin.getLog().log(status);
	}
}
