// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v80 extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10,10,width,height);
        
        for(int rep=0; rep<38; rep++){
            g.drawLine(x1,y1,x2,y2-=15);
            g.drawLine(x1+=25,y1,x2,y2);
          }
    }
}

