/**
 * 
 */
package shapes;

/**
 * @author Saniia
 *
 */
public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		// Polygon test
//		Polygon test = new Polygon();
//		Point a = new Point(10, 15);
//		Point b = new Point(20, 30);
//		Point c = new Point(10, 40);
//		Point d = new Point(20, 35);
//		Point e = new Point(10, 30);
//		Point f = new Point(35, 5);
//		List<Point> pointOfPolygon = new ArrayList<Point>();
//		pointOfPolygon.add(a);
//		pointOfPolygon.add(b);
//		pointOfPolygon.add(c);
//		pointOfPolygon.add(d);
//		pointOfPolygon.add(e);
//		pointOfPolygon.add(f);
//		test.setPoints(pointOfPolygon);
//		test.draw();

		// Circle test
		Point pointBody1 = new Point(400, 100);
		Circle body1 = new Circle(100, pointBody1);
		body1.draw();
		Point pointBody2 = new Point(400, 280);
		Circle body2 = new Circle(80, pointBody2);
		body2.draw();
		Point pointHead = new Point(400, 420);
		Circle head = new Circle(60, pointHead);
		head.draw();
		Point pointEyeRight = new Point(380, 440);
		Circle eyeRight = new Circle(7, pointEyeRight);
		eyeRight.draw();
		Point pointEyeLeft = new Point(420, 440);
		Circle eyeLeft = new Circle(7, pointEyeLeft);
		eyeLeft.draw();
		Point pointNose = new Point(400, 420);
		Circle nose = new Circle(10, pointNose);
		nose.draw();

		Point pointButton1 = new Point(400, 40);
		Circle button1 = new Circle(5, pointButton1);
		button1.draw();

	}

}
