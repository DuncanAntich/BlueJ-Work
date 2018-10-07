// Lab05vst.java
// This is the 110 Point version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v110 extends Applet
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
        g.drawRect(253,165,width/2,height/2);

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
        
        int x7 = 253;
        int y8 = 480;
        int x8 = 743;
        int y9 = 480;
        int x9 = 253;
        int x10 = 743;
        int y10 = 480;
        int y11 = 480;
        int x11 = 253;
        int x12 = 743;
        int y12= 165;
        int y13= 165;
        int y14 = 165;
        
        for(int rep=0; rep<36; rep++){
            g.drawLine(x7+=13,y8,x8,y9-=7);
          }
        
        for(int rep=0; rep<36; rep++){
            g.drawLine(x8-=13,y10,x9,y8-=7);
          }
          
        for(int rep=0; rep<36; rep++){
            g.drawLine(x10-=13,y12,x11,y13+=7);
          }
        for(int rep=0; rep<36; rep++){
            g.drawLine(x11+=13, y12, x12, y14+=7);
          }
    }
}

