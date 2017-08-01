package graphics.client;


import org.vaadin.gwtgraphics.client.DrawingArea;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class GraphicsComponent implements EntryPoint {
	
	private HorizontalPanel panelUp = new HorizontalPanel();
	private HorizontalPanel panelUpCenter = new HorizontalPanel();
	private HorizontalPanel panelUpLeft = new HorizontalPanel();
	private HorizontalPanel panelUpRight = new HorizontalPanel();
	private HorizontalPanel panelCenter = new HorizontalPanel();
	private VerticalPanel panelCenterLeft = new VerticalPanel();
	private HorizontalPanel panelCenterRight = new HorizontalPanel();
	private HorizontalPanel panelBottom = new HorizontalPanel();
	private HorizontalPanel underTextArea = new HorizontalPanel();
	static final int canvasWidth = 850;
	static final int canvasHeight = 500;

	static final String divTagId = "canvasExample";
	
	private Button bt1 = new Button("Home");
	private Button bt2 = new Button("Courses");
	private Button bt3 = new Button("Education");
	private Button bt4 = new Button("Shop");
	private Button bt5 = new Button("About");
	private Button bt6 = new Button("Sign in");
	private Button bt7 = new Button("Create account");
	private Button bt8 = new Button("Add");
	private Button bt9 = new Button("Erase");
	private Button bt10 = new Button("Something");
	private Image image = new Image();
	private FocusPanel focus = new FocusPanel();
	private MyDialog dialog = new MyDialog();
	private static TextArea textArea = new TextArea();
	
	@Override
	public void onModuleLoad() {;
		
		focus.setStyleName("grid");
		final DrawingArea canvas = new DrawingArea(canvasWidth, canvasHeight);
		canvas.setStyleName("canvas");
		panelUp.addStyleName("panelUp");
		panelUp.add(panelUpLeft);
		panelUp.add(panelUpCenter);
		panelUp.add(panelUpRight);

		panelUpLeft.addStyleName("panelUpLeft");
		panelUpLeft.setVisible(true);
		panelUpLeft.add(bt1);
		panelUpLeft.add(bt2);
		panelUpLeft.add(bt3);
		panelUpLeft.add(bt4);
		panelUpLeft.add(bt5);
		
		image.setUrl("/images/logo.gif");
		panelUpCenter.setVisible(true);
		panelUpCenter.addStyleName("panelUpCenter");
		panelUpCenter.add(image);
	
		panelUpRight.addStyleName("panelUpRight");
		panelUpRight.setVisible(true);
		panelUpRight.add(bt6);
		panelUpRight.add(bt7);
		
		panelCenter.addStyleName("panelCenter");
		panelCenterLeft.addStyleName("panelCenterLeft");
		panelCenterRight.addStyleName("panelCenterRight");
		panelCenter.add(panelCenterLeft);
		panelCenter.add(focus);
		panelCenterLeft.add(textArea);
		panelCenterLeft.add(underTextArea);
		underTextArea.add(bt8);
		underTextArea.add(bt9);
		
		panelBottom.add(bt10);
		panelBottom.addStyleName("panelBottom");
		
		Button b = new Button("Click me");
		b.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
		// Instantiate the dialog box and show it.
		MyDialog myDialog = new MyDialog();
		int left = Window.getClientWidth()/ 2;
		int top = Window.getClientHeight()/ 2;
		myDialog.setPopupPosition(left, top);
		myDialog.show();
		}
		});
		
		focus.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				MyDialog myDialog = new MyDialog();
				int left = Window.getClientWidth()/ 2;
				int top = Window.getClientHeight()/ 2;
				myDialog.setPopupPosition(left, top);
				myDialog.show();
				
				
			}
			
		});
		bt8.addClickHandler(new TextAreaClickHandler(canvas, textArea));
		bt9.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				canvas.clear();	
			}
			
		});
		canvas.addClickHandler(new CanvasClickHandler(canvas, textArea));
		textArea.setText("");
		
		RootPanel.get("graphics").add(panelUp);
		RootPanel.get("graphics").add(panelCenter);
		RootPanel.get("graphics").add(panelBottom);
	}
}