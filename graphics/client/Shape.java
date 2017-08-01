package graphics.client;

import org.vaadin.gwtgraphics.client.DrawingArea;

public interface Shape {
	public void draw(DrawingArea canvas);
	public void changeColor(DrawingArea canvas, int index, String color);
	public void changeDimension(DrawingArea canvas, int index, int dimension);
	public void moveRight(DrawingArea canvas, int index, int delta);
	public void moveLeft(DrawingArea canvas, int index, int delta);
	public void moveUp(DrawingArea canvas, int index, int delta);
	public void moveDown(DrawingArea canvas, int index, int delta);
	public void delete(DrawingArea canvas, int index);
	public Shape getShape(DrawingArea canvas, int index);
}
