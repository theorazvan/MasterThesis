package graphics.client;

import org.vaadin.gwtgraphics.client.DrawingArea;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.TextArea;

public class ClearCanvasHandler implements ClickHandler {
	static final int canvasWidth = 850;
	static final int canvasHeight = 500;
	private DrawingArea canvas;
	private TextArea textArea;
	
	public ClearCanvasHandler(DrawingArea canvas, TextArea textArea) {
		this.canvas = canvas;
		this.textArea = textArea;
	}
	
	@Override
	public void onClick(ClickEvent event) {
		DrawingArea canvas = new DrawingArea(canvasWidth, canvasHeight);
		canvas.clear();
		

	}

}
