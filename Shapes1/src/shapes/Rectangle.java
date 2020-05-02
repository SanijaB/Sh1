/**
 * 
 */
package shapes;

/**
 * @author Saniia
 *
 */
public class Rectangle extends Polygon {

	private int lengthX;
	private int lengthY;
	private Point bottomLeft;

	/**
	 * Konstruktor fuer Objekte der Klasse Rectangle
	 */
	public Rectangle(Point bottomLeft, int lengthX, int lengthY) {
		this.lengthX = lengthX;
		this.lengthY = lengthY;
		this.bottomLeft = bottomLeft;
	}

	@Override
	public void draw() {
		getWhiteboard().removeShape(representation);
		getWhiteboard().drawRectangle(lengthX, lengthY, lengthX, lengthX);
	}

}
