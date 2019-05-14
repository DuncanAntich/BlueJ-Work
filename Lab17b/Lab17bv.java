// Lab17bvst.java
// The student, starting version of the Lab17b assignment.

/**
 * 15/04/2016 - modified by Bill Montana to include applet window resizing and to "fix" the curly braces
 */

import java.awt.*;
import java.applet.*;

public class Lab17bv100 extends Applet
{

    public void paint (Graphics g) {
        super.resize(800, 600);             // sets the applet window size
        drawSquare1(g,800,600);
    }

    public void drawSquare1(Graphics g, int maxX, int maxY) {
        int midX = maxX/2;
        int midY = maxY/2;
        int startWidth = maxX/4;
        int startHeight = maxY/4;
        int tlX = midX - (startWidth/2);
        int tlY = midY - (startHeight/2);
        g.fillRect(tlX,tlY,startWidth,startHeight);
    }

    public void delay(long n) {
        n *= 1000;
        long startDelay = System.nanoTime();
        long endDelay = 0;
        while (endDelay - startDelay < n)
            endDelay = System.nanoTime();
    }

    public void topLeft(Graphics g, int x, int y, int width, int height){
        if(width>=1){
            g.fillRect(x,y,width,height);
            topLeft(g,x-width/2,y-height/2,width/2,height/2);
            topRight(g,x+width,y-height/2,width/2, height/2);
            bottomLeft(g,x-width/2,y+height,width/2,height/2);
        }

    }

    public void topRight(Graphics g, int x, int y, int width, int height){
        if(width>=1){
            g.fillRect(x,y,width,height);
            topRight(g,x+width,y-height/2, width/2, height/2);
            topLeft(g,x-width/2,y-height/2,width/2,height/2);
            bottomRight(g,x+width,y+height,width/2,height/2);
        }
    }

    public void bottomLeft(Graphics g, int x, int y, int width, int height){
        if(width>=1){
            g.fillRect(x,y,width,height);
            bottomLeft(g,x-width/2,y+height, width/2, height/2);
            topLeft(g,x-width/2,y-height/2,width/2,height/2);
            bottomRight(g,x+width,y+height,width/2,height/2);
        }
    }

    public void bottomRight(Graphics g, int x, int y, int width, int height){
        if(width>=1){
            g.fillRect(x,y,width,height);
            bottomRight(g,x-width/2,y+height, width/2, height/2);
            topRight(g,x-width/2,y-height/2,width/2,height/2);
            bottomLeft(g,x+width,y+height,width/2,height/2);
        }
    }
}

