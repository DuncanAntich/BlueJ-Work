// Lab17bvst.java
// The student, starting version of the Lab17b assignment.

/**
 * 15/04/2016 - modified by Bill Montana to include applet window resizing and to "fix" the curly braces
 */

import java.awt.*;
import java.applet.*;

public class Lab17bv100 extends Applet
{
    final int TOP_LEFT = 0;
    final int TOP_RIGHT = 1;
    final int BOTTOM_RIGHT = 2;
    final int BOTTOM_LEFT = 3;
    final int CENTER = 4;
    public void paint (Graphics g) {
        super.resize(800, 600);             // sets the applet window size
        drawSquares(g,200,150,200,150,CENTER);
    }

    public void drawSquares(Graphics g, int maxX, int maxY, int length, int width, int locFlag)
    {
        if(width>=1)
        {
            int randRed = (int)(Math.random()*256);
            int randBlu = (int)(Math.random()*256);
            int randGre = (int)(Math.random()*256);
            Color color = new Color(randRed,randBlu,randGre);
            g.setColor(color);
            g.fillRect(maxX, maxY, length, width);
            switch(locFlag){
                case CENTER : 
                drawSquares(g,maxX-length/2,maxY-width/2,length/2,width/2,TOP_LEFT);
                drawSquares(g,maxX+length,maxY-width/2,length/2,width/2,TOP_RIGHT);
                drawSquares(g,maxX+length,maxY+width,length/2,width/2,BOTTOM_RIGHT);
                drawSquares(g,maxX-length/2,maxY+width,length/2,width/2,BOTTOM_LEFT);
                break;

                case TOP_LEFT :
                drawSquares(g,maxX-length/2,maxY-width/2,length/2,width/2,TOP_LEFT);
                drawSquares(g,maxX+length,maxY-width/2,length/2,width/2,TOP_RIGHT);
                drawSquares(g,maxX-length/2,maxY+width,length/2,width/2,BOTTOM_LEFT);
                break;

                case TOP_RIGHT :
                drawSquares(g,maxX+length,maxY+width,length/2,width/2,BOTTOM_RIGHT);
                drawSquares(g,maxX-length/2,maxY-width/2,length/2,width/2,TOP_LEFT);
                drawSquares(g,maxX+length,maxY-width/2,length/2,width/2,TOP_RIGHT);
                break;

                case BOTTOM_LEFT :
                drawSquares(g,maxX-length/2,maxY+width,length/2,width/2,BOTTOM_LEFT);
                drawSquares(g,maxX-length/2,maxY-width/2,length/2,width/2,TOP_LEFT);
                drawSquares(g,maxX+length,maxY+width,length/2,width/2,BOTTOM_RIGHT);
                break;

                case BOTTOM_RIGHT :
                drawSquares(g,maxX-length/2,maxY+width,length/2,width/2,BOTTOM_LEFT);
                drawSquares(g,maxX+length,maxY+width,length/2,width/2,BOTTOM_RIGHT);
                drawSquares(g,maxX+length,maxY-width/2,length/2,width/2,TOP_RIGHT);
                break;
            }
        }
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

