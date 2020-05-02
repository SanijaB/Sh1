package shapes;

/**
 * @author Saniia
 *
 */
public class Circle extends Shape {

	private int radius;
	private Point center;

	/**
	 * Konstruktor fuer Objekte der Klasse Circle
	 */
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;

	}

	/**
	 * Zeichnet den Kreis auf der Zeichenflaeche
	 */
	@Override
	public void draw() {
		getWhiteboard().removeShape(representation);
		representation = getWhiteboard().drawCircle(center.getX(), center.getY(), radius);
	}

	/**
	 * @ return (Circle-Objekt) Bewegt den Kreis um dx und dy
	 */
	@Override
	public Drawable move(int x, int y) {
		center.move(x, y);
		return this;
	}

	/**
	 * @param color (Farbe des Kreises)
	 * @param solid (wenn true, dann wird die Flaeche komplett ausgefuellt) Zeichnet
	 *              den Kreis farbig, ggf. ausgefuellt, auf der Zeichenflaeche
	 */
	public void draw(java.awt.Color color, boolean solid) {
		getWhiteboard().removeShape(representation);
		representation = getWhiteboard().drawCircle(center.getX(), center.getY(), radius, color, solid);
	}

}
