// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bv110 extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawRect(50,60,200,200);
        g.drawRect(100,110,200,200);
        g.drawLine(50,60,100,110);
        g.drawLine(50,260,100,310);
        g.drawLine(250,60,300,110);
        g.drawLine(250,260,300,310);

        // DRAW SPHERE
        g.drawOval(80,90,200,200);
        g.drawOval(80,170,200,50);
        g.drawOval(80,140,200,110);
        g.drawOval(80,110,200,170);
        g.drawOval(150,90,50,200);
        g.drawOval(120,90,110,200);
        g.drawOval(90,90,170,200);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(500,70,250,250);
        g.drawOval(539,178,105,105);
        g.drawLine(503,223,703,100);
        g.drawLine(611,319,703,100);
        g.drawLine(503,223,611,319);


        // DRAW APCS
            //Draw A
        g.fillRect(80,500,25,120);
        g.fillRect(80,500,50,25);
        g.fillRect(80,550,50,25);
        g.fillRect(130,500,25,120);
            //Draw P
        g.fillRect(175,500,25,120);
        g.fillRect(175,500,75,25);
        g.fillRect(200,550,50,25);
        g.fillRect(225,500,25,50);
            //Draw C
        g.fillRect(270,500,25,120);
        g.fillRect(270,500,75,25);
        g.fillRect(270,595,75,25);
            //Draw S
        g.fillRect(365,500,75,25);
        g.fillRect(365,500,25,75);
        g.fillRect(365,595,75,25);
        g.fillRect(415,550,25,70);
        g.fillRect(365,550,75,25);
        
        // DRAW PACMEN FLOWER
        g.fillArc(765,500,100,100,45,270);
        g.fillArc(700,435,100,100,45,-270);
        g.fillArc(635,500,100,100,135,-270);
        g.fillArc(700,565,100,100,225,-270);


    }

}


