
package dk.dtu.imm.se.ecno.gui;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.SwingUtilities;
import javax.swing.plaf.metal.MetalToolTipUI;


@SuppressWarnings("serial")
public class MultiLineToolTip extends JToolTip {
	public MultiLineToolTip() {
		setUI(new MultiLineToolTipUI());
	}
}

/**
 * eki: the code for the MultiLineToolTip was taken from
 * http://www.java2s.com/Code/Java/Swing-JFC/MultiLineToolTipExample.htm
 * 
 */
class MultiLineToolTipUI extends MetalToolTipUI {
	private String[] strs;

	@SuppressWarnings("deprecation")
	public void paint(Graphics g, JComponent c) {
		FontMetrics metrics = Toolkit.getDefaultToolkit().getFontMetrics(
				g.getFont());
		Dimension size = c.getSize();
		g.setColor(c.getBackground());
		g.fillRect(0, 0, size.width, size.height);
		g.setColor(c.getForeground());
		if (strs != null) {
			for (int i = 0; i < strs.length; i++) {
				g.drawString(strs[i], 3, (metrics.getHeight()) * (i + 1));
			}
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public Dimension getPreferredSize(JComponent c) {
		FontMetrics metrics = Toolkit.getDefaultToolkit().getFontMetrics(
				c.getFont());
		String tipText = ((JToolTip) c).getTipText();
		if (tipText == null) {
			tipText = "";
		}
		BufferedReader br = new BufferedReader(new StringReader(tipText));
		String line;
		int maxWidth = 0;
		Vector v = new Vector();
		try {
			while ((line = br.readLine()) != null) {
				int width = SwingUtilities.computeStringWidth(metrics, line);
				maxWidth = (maxWidth < width) ? width : maxWidth;
				v.addElement(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		int lines = v.size();
		if (lines < 1) {
			strs = null;
			lines = 1;
		} else {
			strs = new String[lines];
			int i = 0;
			for (Enumeration e = v.elements(); e.hasMoreElements(); i++) {
				strs[i] = (String) e.nextElement();
			}
		}
		int height = metrics.getHeight() * lines;
		return new Dimension(maxWidth + 6, height + 4);
	}
}

