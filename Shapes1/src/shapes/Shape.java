package shapes;

import java.awt.Color;

import teaching.WhiteBoard;

public abstract class Shape implements Drawable {

	protected Object representation;

	private static WhiteBoard whiteboard = new WhiteBoard();

	private Color color;

	private boolean solid;

	public Shape() {

	}

	public static WhiteBoard getWhiteboard() {
		return whiteboard;
	}

	public Color getColor() {
		return color;
	}

	public boolean isSolid() {
		return solid;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setSolid(boolean solid) {
		this.solid = solid;
	}

}
