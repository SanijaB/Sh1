package shapes;

import java.util.ArrayList;
import java.util.List;

public class Figure implements Drawable {

	public List<Drawable> shapes;

	public Figure() {
		shapes = new ArrayList<Drawable>();
	}

	public Figure addShape(Drawable drawable) {
		shapes.add(drawable);
		return this;
	}

	@Override
	public void draw() {
		for (Drawable draw : shapes) {
			draw.draw();
		}
	}

	public List<Drawable> getShapes() {
		return shapes;
	}

	@Override
	public Drawable move(int x, int y) {
		for (Drawable drawable : shapes) {
			drawable.move(x, y);
		}
		return (Drawable) shapes;
	}

	public static Figure snowMan() {
		Figure snowMan = new Figure();

		// Head
		int r = 4;
		Point headPoint = new Point(0, 5);
		Shape head = new Circle(r, headPoint);
		snowMan.addShape(head);

		// Eyes
		int eyeR = 1;
		Point eyePointLeft = new Point(-2, 3);
		Shape eyeLeft = new Circle(eyeR, eyePointLeft);
		Point eyePointRight = new Point(2, 3);
		Shape eyeRight = new Circle(eyeR, eyePointRight);
		snowMan.addShape(eyeLeft);
		snowMan.addShape(eyeRight);

		// Nose
		int noseR = 1;
		Point nosePoint = new Point(0, 2);
		Shape nose = new Circle(noseR, nosePoint);
		snowMan.addShape(nose);
		// Body
		int bodyR = 5;
		Point bodyPoint = new Point(0, -4);
		Shape body = new Circle(r, bodyPoint);
		Point point1 = new Point(0, 1);
		Point point2 = new Point(0, -4);
		Line line = new Line(point1, point2);
		snowMan.addShape(body);
		snowMan.addShape(line);
		// Arm
		Point leftArmPoint1 = new Point(-5, -2);
		Point leftArmPoint2 = new Point(-5, 3);
		Line leftArm = new Line(leftArmPoint1, leftArmPoint2);
		Point rightArmPoint1 = new Point(5, -2);
		Point rightArmPoint2 = new Point(5, 3);
		Line rightArm = new Line(rightArmPoint1, rightArmPoint2);
		snowMan.addShape(leftArm);
		snowMan.addShape(rightArm);
		// Leg
		int legR = 6;
		Point legPoint = new Point(0, -15);
		Shape leg = new Circle(legR, legPoint);
		Point pointA = new Point(0, -12);
		Point pointB = new Point(0, -19);
		snowMan.addShape(leg);

		return snowMan;
	}

}
