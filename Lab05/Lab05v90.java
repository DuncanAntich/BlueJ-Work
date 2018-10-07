// Lab05v90.java
// This is the 90 Point version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v90 extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        int x3 = 10;
        int x4 = 990;
        int y3 = 640;
        int y4 = 640;
        g.drawRect(10,10,width,height);
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x1+=19,y1,x2,y2-=12);
          }
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x2-=19, y4, x3, y3-=12);
        }
        
        }
}

