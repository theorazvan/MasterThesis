package graphics.client;

import org.vaadin.gwtgraphics.client.DrawingArea;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.TextArea;

public class CanvasClickHandler implements ClickHandler {
	private TextArea textArea;
	private DrawingArea canvas;
	private Shape shape;
	enum Shapes {
		CIRCLE, SQUARE, RECTANGLE, LINE, TRIANGLE, ELLIPSE
	}
	public Shape getShape() {
		return shape;
	}
	public CanvasClickHandler(DrawingArea canvas, TextArea textArea) {
		this.canvas = canvas;
		this.textArea = textArea;
	}

	@Override
	public void onClick(ClickEvent event) {
		shape = (Shape) event.getSource();
		GWT.log("Shape: " + shape.getShape(canvas, 0));
		//canvas = (DrawingArea) event.getSource();
		
	}
}
