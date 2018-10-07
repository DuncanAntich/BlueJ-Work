// Lab05v90.java
// This is the 100 Point version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v100 extends Applet
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
        int x5 = 10;
        int x6 = 990;
        int y5 = 10;
        int y6 = 10;
        int y7 = 10;
        g.drawRect(10,10,width,height);
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x1+=19,y1,x2,y2-=12);
          }
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x2-=19, y4, x3, y3-=12);
        }
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x4-=19,y5,x5,y7+=12);
        }
        
        for(int rep=0; rep<50; rep++){
            g.drawLine(x5+=19,y5,x6,y6+=12);
        }
        
        }
}

