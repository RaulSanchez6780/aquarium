import java.awt.Color;
import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

    public static void drawBubble(PainterAPI painter, int x, int y, double scale){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(new Color(3, 186, 252));
        painter.circle(50 * scale);
        painter.finishFill();

        painter.liftPen();
        painter.moveTo(x + 20 * scale, y + 50 * scale);
        painter.lowerPen();
        painter.startFill(new Color(3, 227, 252));
        painter.circle(15 * scale); 
        painter.finishFill();
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
 painter.setSpeed(0); // Lower number means faster, zero means as fast as possible.

 // Bubbles
 drawBubble(painter, 325, 50, 1);
 drawBubble(painter, 360, 150, .75);
 drawBubble(painter, 325, 220, .5);
 drawBubble(painter, -325, 50, 1);
 drawBubble(painter, -360, 150, .75);
 drawBubble(painter, -325, 220, .5);

 // Ground
 painter.liftPen();
 painter.moveTo(-400, -100);
 painter.lowerPen();
 painter.startFill(new Color(209, 196, 113));
 painter.forward(800);
 painter.turnRight(90);
 painter.forward(200);
 painter.turnRight(90);
 painter.forward(800);
 painter.turnRight(90);
 painter.forward(200);
 painter.finishFill();

 // Fish
 }
}