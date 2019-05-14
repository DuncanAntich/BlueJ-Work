// Lab17bv110.java
// The student, starting version of the Lab17b assignment.
// Created by Duncan Antich and Joe Cloud

/**
 * 15/04/2016 - modified by Bill Montana to include applet window resizing and to "fix" the curly braces
 */

import java.awt.*;
import java.applet.*;

public class Lab17bv110 extends Applet
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
}

