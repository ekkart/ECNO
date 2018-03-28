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
public class InheritanceTargetDecoration extends RectangleFigure implements RotatableDecoration {

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

	public InheritanceTargetDecoration() {
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
		// eki: We do not even draw the rectangle here! We do not 
		//      call the paintFigure of the super class (we just use
		//      this figure as a vehicle to use the paintFigure method
		//      to draw the flash (admittedly an abuse of the
		//      RectangleFigure)!
		//      
		//      NOTE that, if you want to add own graphics in an
		//      extension of a Shape, this would normally be done in
		//      the fillShape() and fillOutline() method. We can only
		//      use the paintFigure here, because we DO NOT propagate
		//      the call up the inheritance hierarchy. If you decide
		//      to do both, YOU ARE ON YOUR OWN! Don't say you learned
		//      that from me.

        // draw the arrow head as a filled polygon (with the current foreground colour)
		// graphics.setBackgroundColor(graphics.getForegroundColor());
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
