/**

 * 
 */
package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Saniia
 *
 */
public class Polygon extends Shape {

	List<Point> points;

	/**
	 * Konstruktor fuer Objekte der Klasse Polygon
	 */
	public Polygon() {
		points = new ArrayList<Point>();
	}

	/**
	 * Zeichnet das Polygon auf das Whiteboard.
	 */
	@Override
	public void draw() {
		getWhiteboard().removeShape(representation);
		// Parameter der draw Methode
		double[] x = new double[points.size()];
		double[] y = new double[points.size()];
		// Point in Array hinzuf�gen
		for (int i = 0; i < points.size(); i++) {
			x[i] = points.get(i).getX();
			y[i] = points.get(i).getY();

		}
		representation = getWhiteboard().drawPolygon(x, y);
	}

	/**
	 * Bewegt das Polygon um dx und dy.
	 */
	@Override
	public Polygon move(int x, int y) {
		for (Point eckPunkt : points) {
			eckPunkt.move(x, y);
		}
		return this;
	}

	/**
	 * Setzt die Eckpunkte des Polygons
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}

	/**
	 * @return nicht veraenderbare Liste der Punkte Zugriff auf die Punkte der Form.
	 */
	public ArrayList<Point> getPoints() {
		return (ArrayList<Point>) points;
	}

}
