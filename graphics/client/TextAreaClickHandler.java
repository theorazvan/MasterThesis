package graphics.client;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.vaadin.gwtgraphics.client.DrawingArea;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.TextArea;


public class TextAreaClickHandler implements ClickHandler {
	private TextArea textArea;
	private DrawingArea canvas;
	
	public TextAreaClickHandler(DrawingArea drawingArea, TextArea textArea) {
		this.canvas = drawingArea;
		this.textArea = textArea;
	}
	
	@Override
	public void onClick(ClickEvent event) {
		DrawListener listener = new DrawListener(canvas);
		String line = textArea.getText();
		ANTLRInputStream input = new ANTLRInputStream(line);
		NewDrawGrammarLexer lexer = new NewDrawGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NewDrawGrammarParser parser = new NewDrawGrammarParser(tokens);
		ParseTree tree = parser.drawSentence();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, tree);
	}
}