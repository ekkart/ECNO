package dk.dtu.imm.se.ecno.model.ecno.diagram.edit.parts.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;

/**
 * This is the decoration for the inheritance relation.
 * 
 * @generated NOT
 * @author eki
 */
public class ExtensionBaseTargetDecoration extends RectangleFigure implements RotatableDecoration {

	/**
	 * The height and width of the arrow head.
	 */
	private final double dim = 19;

	/**
	 * The points defining the arrowhead of the arrow head
	 */
	private final double[] arrowdef =  new double[] {
//			-1, 0,
			 0, 0,
			18, 7.5,
			18, -7.5 };

	public ExtensionBaseTargetDecoration() {
		super();
		this.setSize((int)(2.0d*dim), (int) (2.0d*dim));
	}

	/**
     * In order to calculate the location, we need to calculate the position from the
     * setLocation method and the setReferencePoint command. The first position is
     * stored in this attribute. 
     */
	private Point pl;

	public void setLocation (Point p){
		// just store the position
		pl = p;
	}

	/**
	 * The points of the arrowhead after transformation
	 */
	private final int[] points =  new int[arrowdef.length];

	public void setReferencePoint(Point p) {
		if (pl != null && ( pl.x != p.x || pl.y != p.y)) {
			setCenter(pl.x, pl.y);
			setAngle(pl.x, pl.y, p.x, p.y);
		} else {
			setCenter(p.x,p.y);
			// choose any angle (arrow pointing to the right)
			setAngle(1,0,0,0);
		}

		// Calculate the actual points of the arrow head
		calculatePoints();                   
		super.setLocation(getTopLeft());
	}

	@Override
	public void paintFigure(Graphics graphics) {
		graphics.setBackgroundColor(graphics.getForegroundColor());
		graphics.fillPolygon(points);
		graphics.setLineWidth(1);
		graphics.drawPolygon(points);
	}

    // Transformation parameters (set by setCenter and setAngle)
	// these could probably used for other decorations too 
    private double cx = 0.0d;
    private double cy = 0.0d;

    private double sinAlpha = 0.0d;
    private double cosAlpha = 1.0d;

    private void setCenter(double cx, double cy) {
    	this.cx = cx;
    	this.cy = cy;
    }

    private void setAngle(double lx, double ly, double rx, double ry) {
    	double dx = rx - lx;
    	double dy = ry - ly;
    	double length = Math.sqrt(dx*dx + dy*dy);

    	sinAlpha = dx / length;
    	cosAlpha = dy / length;
    }

    private void calculatePoints() {
    	for (int i = 0; i+1 < points.length; i = i + 2) {
    		points[i]   = (int) Math.round((arrowdef[i] * sinAlpha - arrowdef[i+1] * cosAlpha + cx));
    		points[i+1] = (int) Math.round((arrowdef[i] * cosAlpha + arrowdef[i+1] * sinAlpha + cy));
    	}
    }

    private Point getTopLeft() {
    	// XXX eki: should be adjusted to a non-deprecated constructor
    	return new Point(cx - dim, cy - dim);
    }

}
