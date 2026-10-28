import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

    public static void drawBubble(PainterAPI painter, int x, int y, double scale){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.circle(50 * scale);

        painter.liftPen();
        painter.moveTo(x + 20, y + 50);
        painter.lowerPen();
        painter.circle(15 * scale); 
    }

    public static void drawFish(PainterAPI painter, int x, int y, double scale){

    }

    public static void drawSandwich(PainterAPI painter, int x, int y){

    }

    public static void drawBlanket(PainterAPI painter, int x, int y){

    }

    public static void drawSunglasses(PainterAPI painter, int x, int y){

    }

    public static void drawTopHat(PainterAPI painter, int x, int y){

    }

    public static void drawCrab(PainterAPI painter, int x, int y){

    }
     public static void main(String[] args) {
 CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

 PainterAPI painter = canvas.getPainter();
 painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
 painter.forward(100);
 drawBubble(painter, 100, 100, 1.0);
 }
}