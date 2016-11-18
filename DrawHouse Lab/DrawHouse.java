import apcslib.*;
/**
 * DrawHouse should create a house graphic in a screen of 500*500 pixels with turtle graphics
 * 
 * @author Jason Ouyang 
 * @version 0.1
 */
public class DrawHouse
{
  
    public static void drawMyHouse(){

        
        SketchPad pad = new SketchPad(1000,800);
        DrawingTool turtle = new DrawingTool(pad);
        turtle.up();
        turtle.move(-200,-100);
        turtle.down();
        turtle.move(-200,200);
        turtle.move(200,200);
        turtle.move(200,-100);
        turtle.move(300,-100);
        turtle.move(-300,-100);
        turtle.up();
        turtle.move(-200,200);
        turtle.down();
        turtle.move(0,300);
        turtle.move(200,200);
        turtle.up();
        turtle.move(100,25);
        turtle.down();
        turtle.move(50,25);
        turtle.move(50,-25);
        turtle.move(100,-25);
        turtle.move(100,25);
        turtle.move(75,25);
        turtle.move(75,-25);
        turtle.up();
        turtle.move(100,0);
        turtle.down();
        turtle.move(50,0);
        turtle.up();
        turtle.move(-100,25);
        turtle.down();
        turtle.move(-50,25);
        turtle.move(-50,-25);
        turtle.move(-100,-25);
        turtle.move(-100,25);
        turtle.move(-75,25);
        turtle.move(-75,-25);
        turtle.up();
        turtle.move(-100,0);
        turtle.down();
        turtle.move(-50,0);
        turtle.up();
        turtle.move(-25,-100);
        turtle.down();
        turtle.move(-25,0);
        turtle.move(25,0);
        turtle.move(25,-100);
        turtle.up();
        turtle.move(10,-50);
        turtle.down();
        turtle.drawCircle(5);
        turtle.up();
        turtle.move(0,100);
        turtle.down();
        turtle.drawCircle(50);
        turtle.move(0,50);
        turtle.move(0,150);
        turtle.up();
        turtle.move(-50,100);
        turtle.down();
        turtle.move(50,100);
        turtle.up();
        turtle.move(-150,225);
        turtle.down();
        turtle.move(-150,250);
        turtle.move(-140,250);
        turtle.move(-140,230);
    }
}
