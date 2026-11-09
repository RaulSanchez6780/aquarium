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
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(new Color(0, 152, 186));
        painter.circle(50 * scale);
        painter.finishFill();
        
        painter.liftPen();
        painter.startFill(new Color(0, 152, 186));
        painter.moveTo(x - 75 * scale, y + 75 * scale);
        painter.lowerPen();
        painter.turnRight(50);
        painter.forward(40 * scale);
        painter.turnRight(80);
        painter.forward(40 * scale);
        painter.turnRight(140);
        painter.forward(60 * scale);
        painter.finishFill();
        painter.turnLeft(140);
        painter.turnLeft(80);
        painter.turnLeft(50);

        painter.liftPen();
        painter.moveTo(x + 30 * scale, y + 50 * scale);
        painter.lowerPen();
        painter.startFill(new Color(0, 0, 0));
        painter.circle(10 * scale);
        painter.finishFill();
    }

    public static void drawSandwich(PainterAPI painter, int x, int y, Color color){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(color);
        for (int i = 0; i < 2; i++) {
            painter.forward(100);
            painter.turnRight(90);
            painter.forward(15);
            painter.turnRight(90);
        }
        painter.finishFill();
    }

    public static void drawBlanket(PainterAPI painter, int x, int y, Color color){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(color);
        for (int i = 0; i < 4; i++) {
            painter.forward(40);
            painter.turnRight(90);
        }
        painter.finishFill();

    }

    public static void drawSunglasses(PainterAPI painter, int x, int y){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(new Color(0, 0, 0));
        for (int i = 0; i < 4; i++) {
            painter.forward(30);
            painter.turnRight(90);
        }
        painter.finishFill();

        painter.liftPen();
        painter.moveTo(x + 25, y - 10);
        painter.lowerPen();
        painter.forward(20);

        painter.liftPen();
        painter.moveTo(x + 40, y);
        painter.lowerPen();
        painter.startFill(new Color(0, 0, 0));
        for (int i = 0; i < 4; i++) {
            painter.forward(30);
            painter.turnRight(90);
        }
        painter.finishFill();
    }

    public static void drawTopHat(PainterAPI painter, int x, int y){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(new Color(0, 0, 0));
        for (int i = 0; i < 2; i++) {
            painter.forward(100);
            painter.turnRight(90);
            painter.forward(20);
            painter.turnRight(90);
        }
        painter.finishFill();
        painter.liftPen();
        painter.moveTo(x + 13, y);
        painter.lowerPen();
        painter.startFill(new Color(0, 0, 0));
        for (int i = 0; i < 2; i++) {
            painter.forward(75);
            painter.turnLeft(90);
            painter.forward(80);
            painter.turnLeft(90);
        }
        painter.finishFill();
    }

    public static void drawCrab(PainterAPI painter, int x, int y){
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
        painter.startFill(new Color(245, 129, 66));
        painter.circle(75 );
        painter.finishFill();

        painter.liftPen();
        painter.moveTo(75 + x, 75 + y);
        painter.lowerPen();
        painter.turnLeft(50);
        painter.forward(25);
        painter.turnRight(50);
        painter.liftPen();
        painter.moveTo(-75 + x, 75 + y);
        painter.lowerPen();
        painter.turnRight(50);
        painter.backward(25);
        painter.turnLeft(50);

        painter.liftPen();
        painter.moveTo(25 + x, 5 + y);
        painter.lowerPen();
        painter.turnRight(75);
        painter.forward(20);
        painter.turnLeft(75);
        painter.liftPen();
        painter.moveTo(-25 + x, 5 + y);
        painter.lowerPen();
        painter.turnLeft(-100);
        painter.forward(20);
        painter.turnRight(-100);

        painter.liftPen();
        painter.moveTo(80 + x, 95 + y);
        painter.lowerPen();
        painter.startFill(new Color(245, 129, 66));
        for (int i = 0; i < 3; i++) {
            painter.forward(20);
            painter.turnLeft(120);
        }
        painter.finishFill();

        painter.liftPen();
        painter.moveTo(-100 + x, 95 + y);
        painter.lowerPen();
        painter.startFill(new Color(245, 129, 66));
        for (int i = 0; i < 3; i++) {
            painter.forward(20);
            painter.turnLeft(120);
        }
        painter.finishFill();
    }

    public static void drawGround(PainterAPI painter){
        painter.liftPen();
        painter.moveTo(-400, -100);
        painter.lowerPen();
        painter.startFill(new Color(209, 196, 113));
        for (int i = 0; i < 2; i++) {
            painter.forward(800);
            painter.turnRight(90);
            painter.forward(200);
            painter.turnRight(90);
        }
        painter.finishFill();
        }

        public static void main(String[] args) {
    CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
    canvas.setBackgroundColor(new Color(117, 202, 255));
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
    drawGround(painter);

    // Crab
    drawCrab(painter, 200, -85);
    drawCrab(painter, -200, -85);

    painter.liftPen();
    painter.moveTo(-220, -5);
    painter.lowerPen();
    painter.startFill(new Color(0, 0, 0));
    painter.circle(10);
    painter.finishFill();
    painter.liftPen();
    painter.moveTo(-180, -5);
    painter.lowerPen();
    painter.startFill(new Color(0, 0, 0));
    painter.circle(10);
    painter.finishFill();

    // Top Hat
    drawTopHat(painter, -250, 70);

    // Sunglasses
    drawSunglasses(painter, 165, 20);

    // Fish
    drawFish(painter, 200, 165, 0.75);
    drawFish(painter, 100, 155, 0.5);

    // Blanket
    drawBlanket(painter, -100, -95, new Color(150, 0, 0));
    drawBlanket(painter, -60, -95, new Color(255, 255, 255));
    drawBlanket(painter, -20, -95, new Color(150, 0, 0));
    drawBlanket(painter, 20, -95, new Color(255, 255, 255));
    drawBlanket(painter, 60, -95, new Color(150, 0, 0));

    drawBlanket(painter, -100, -135, new Color(255, 255, 255));
    drawBlanket(painter, -60, -135, new Color(150, 0, 0));
    drawBlanket(painter, -20, -135, new Color(255, 255, 255));
    drawBlanket(painter, 20, -135, new Color(150, 0, 0));
    drawBlanket(painter, 60, -135, new Color(255, 255, 255));

    // Sandwich
    drawSandwich(painter, -50, -90, new Color(232, 214, 135));
    drawSandwich(painter, -50, -75, new Color(204, 0, 0));
    drawSandwich(painter, -50, -60, new Color(0, 196, 43));
    drawSandwich(painter, -50, -45, new Color(232, 214, 135));
 }
}