package graphics.client;

import java.util.HashMap;
import java.util.Map;

import org.vaadin.gwtgraphics.client.DrawingArea;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Random;

import graphics.client.shape.MyCircle;
import graphics.client.shape.MyEllipse;
import graphics.client.shape.MyLine;
import graphics.client.shape.MyRectangle;
import graphics.client.shape.MySquare;
import graphics.client.shape.MyTriangle;

public class DrawListener extends NewDrawGrammarBaseListener {;
	private DrawingArea canvas;
	private Shapes shapes;
	
	public DrawListener(DrawingArea canvas) {
		this.canvas = canvas;
	}
	
	/*public Shapes getShapes() {
		return shapes;
	}*/
	
	@Override public void enterDrawSentence(NewDrawGrammarParser.DrawSentenceContext ctx) {
		String action = ctx.action().getText();
		String object = ctx.objects().object().getText();
		String objectArgument = ctx.objects().arguments().getText();
		int methodSize = ctx.methods().size();

		Map<String, String> m = new HashMap<>();
		String method = null;
		String methodArgument = null;
		
		int xPosition = Random.nextInt(canvas.getOffsetWidth() - 50);
		int yPosition = Random.nextInt(canvas.getOffsetHeight() - 50);
		int min = 15;
		int max = 50;
		int radius = Random.nextInt(max - min) + min;
		int xRadius = Random.nextInt(max - min) + min;
		int yRadius = Random.nextInt(max - min) + min;
		int length = Random.nextInt(max - min) + min;
		int width = Random.nextInt(max - min) + min;
		int height = Random.nextInt(max - min) + min;
		int x1 = Random.nextInt(max - min) + min;
		int x2 = Random.nextInt(max - min) + min;
		int delta = 0;
		objectArgument = objectArgument.replace("(", "");
		objectArgument = objectArgument.replace(")", "");
		int objectArgumentInt = Integer.parseInt(objectArgument);
		
		if (methodSize != 0) {
			for (int i = 0; i < methodSize; i++) {
				method = ctx.methods(i).methodName().getText();
				methodArgument = ctx.methods(i).arguments().getText();
				m.put(method, methodArgument);
			}
		}
		
		String color = null;
		if (m.containsKey("color")) {
			color = m.get("color");
			color = color.replace("(", "");
			color = color.replace(")", "");
		} 
		
		String dimension1 = null;
		String dimension2 = null;
		if (m.containsKey("dimension")) {
			String dimension = m.get("dimension");
			dimension = dimension.replace("(", "");
			dimension = dimension.replace(")", "");
			String dimensionSize[] = dimension.split(",");
			if (dimensionSize.length == 1) {
				dimension1 = dimensionSize[0];
			} else {
				dimension1 = dimensionSize[0];
				dimension2 = dimensionSize[1];
			}
			if (object.equals("circle")) {
				radius = Integer.parseInt(dimension1);
			} else if (object.equals("square")) {
				length = Integer.parseInt(dimension1);
			} else if (object.equals("rectangle")) {
				width = Integer.parseInt(dimension1);
				height = Integer.parseInt(dimension2);
			} else if (object.equals("ellipse")) {
				xRadius = Integer.parseInt(dimension1);
				yRadius = Integer.parseInt(dimension2);
			} else if (object.equals("line")) {
				xRadius = Integer.parseInt(dimension1);
				yRadius = Integer.parseInt(dimension2);
			} else if (object.equals("triangle")) {
				width = Integer.parseInt(dimension1);
				height = Integer.parseInt(dimension2);
			}
		}
		String move = null;
		if (m.containsKey("right")) {
			move = m.get("right");
			move = move.replace("(", "");
			move = move.replace(")", "");
			delta = Integer.parseInt(move);
			GWT.log("#### enterDrawSentence... delta is " + delta);
		} else if (m.containsKey("left")) {
			move = m.get("left");
			move = move.replace("(", "");
			move = move.replace(")", "");
			delta = Integer.parseInt(move);
		} else if (m.containsKey("up")) {
			move = m.get("up");
			move = move.replace("(", "");
			move = move.replace(")", "");
			delta = Integer.parseInt(move);
		} else if (m.containsKey("down")) {
			move = m.get("down");
			move = move.replace("(", "");
			move = move.replace(")", "");
			delta = Integer.parseInt(move);
		}
		
		String posX = null;
		String posY = null;
		if (m.containsKey("position")) {
			String pos = m.get("position");
			pos = pos.replace("(", "");
			pos = pos.replace(")", "");
			String position[] = pos.split(",");
			for (int i = 0; i < position.length; i++) {
				posX = position[0];
				posY = position[1];
			}
			xPosition = Integer.parseInt(posX);
			yPosition = Integer.parseInt(posY);
		}
		

		/*MyCircle circle = new MyCircle(xPosition, yPosition, radius, color, shapes);
		MySquare square = new MySquare(xPosition, yPosition, length, color);
		MyRectangle rectangle = new MyRectangle(xPosition, yPosition, width, height, color);
		MyEllipse ellipse = new MyEllipse(xPosition, yPosition, xRadius, yRadius, color);
		MyLine line = new MyLine(xPosition, yPosition, xRadius, yRadius, color);
		MyTriangle triangle = new MyTriangle(xPosition, yPosition, x1, x2, color);
		for (int i = 0; i < objectArgumentInt; i++) {
		if (action.equals("draw")) {
			if (object.equals("circle")) {
				shapes = new MyCircle();
				circle.draw(canvas);
			} else if(object.equals("square")) {
				square.draw(canvas);
			} else if(object.equals("rectangle")) {
				rectangle.draw(canvas);
			} else if(object.equals("ellipse")) {
				ellipse.draw(canvas);
			} else if(object.equals("line")) {
				line.draw(canvas);
			} else if(object.equals("triangle")) {
				triangle.draw(canvas);
			}
		} else if (action.equals("change") || action.equals("fill")) {
			if (object.equals("circle")) {
				if (m.containsKey("color")) {
					circle.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					circle.changeDimension(canvas, objectArgumentInt - 1, radius);
				} 
			} else if (object.equals("square")) {
				if (m.containsKey("color")) {
					square.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					square.changeDimension(canvas, objectArgumentInt - 1, length);
				}
			} else if (object.equals("rectangle")) {
				if (m.containsKey("color")) {
					rectangle.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					rectangle.changeDimension(canvas, objectArgumentInt - 1, width, height);
				}
			} else if (object.equals("ellipse")) {
				if (m.containsKey("color")) {
					ellipse.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					ellipse.changeDimension(canvas, objectArgumentInt - 1, xRadius, yRadius);
				}
			} else if (object.equals("line")) {
				if (m.containsKey("color")) {
					line.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					line.changeDimension(canvas, objectArgumentInt - 1, xRadius, yRadius);
				}
			} else if (object.equals("triangle")) {
				if (m.containsKey("color")) {
					triangle.changeColor(canvas, objectArgumentInt - 1, color);
				} else if (m.containsKey("dimension")) {
					triangle.changeDimension(canvas, objectArgumentInt - 1, width, height);
				}
			}
		} else if (action.equals("move")) {
			if (object.equals("circle")) {
				if (m.containsKey("right")) {
					circle.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					circle.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					circle.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					circle.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			} else if (object.equals("square")) {
				if (m.containsKey("right")) {
					square.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					square.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					square.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					square.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			} else if (object.equals("rectangle")) {
				if (m.containsKey("right")) {
					rectangle.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					rectangle.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					rectangle.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					rectangle.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			} else if (object.equals("ellipse")) {
				if (m.containsKey("right")) {
					ellipse.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					ellipse.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					ellipse.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					ellipse.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			} else if (object.equals("line")) {
				if (m.containsKey("right")) {
					line.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					line.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					line.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					line.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			} else if (object.equals("triangle")) {
				if (m.containsKey("right")) {
					triangle.moveRight(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("left")) {
					triangle.moveLeft(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("up")) {
					triangle.moveUp(canvas, objectArgumentInt - 1, delta);
				} else if (m.containsKey("down")) {
					triangle.moveDown(canvas, objectArgumentInt - 1, delta);
				}
			}
		} else if (action.equals("delete") || action.equals("remove")) {
			if (object.equals("circle")) {
				circle.delete(canvas, objectArgumentInt - 1);
			} else if (object.equals("square")) {
				square.delete(canvas, objectArgumentInt - 1);
			} else if (object.equals("rectangle")) {
				rectangle.delete(canvas, objectArgumentInt - 1);
			} else if (object.equals("ellipse")) {
				ellipse.delete(canvas, objectArgumentInt - 1);
			} else if (object.equals("line")) {
				line.delete(canvas, objectArgumentInt - 1);
			} else if (object.equals("triangle")) {
				triangle.delete(canvas, objectArgumentInt - 1);
			}
		}
		}*/
	}
	@Override public void exitDrawSentence(NewDrawGrammarParser.DrawSentenceContext ctx) {
	}
}