// Lab06v70.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v70 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Create RGB
        double R;
        double G;
        double B;
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        
        
        
        // Draw Random Lines
        for(int x = 0; x<100; x++){
            double startx = Math.random()*389 + 10;
            double starty = Math.random()*289 + 10;
            double endx = Math.random()*389 + 10;
            double endy = Math.random()*289 + 10;
            
            R = Math.random()*254;
            G = Math.random()*254;
            B = Math.random()*254;
            
            Color lineColor = new Color((int) R, (int) G, (int) B);
           
            g.setColor(lineColor);
            g.drawLine((int)startx, (int)starty, (int) endx, (int) endy); 
            

        }
        // Draw Random Squares




        
        // Draw Random Circles




        
        // Draw 3-D Box
    
    
    
    
    
    }
        
}



    
 