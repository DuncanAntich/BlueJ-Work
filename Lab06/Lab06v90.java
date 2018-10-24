// Lab06v90.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v90 extends Applet
{
    
    public void paint(Graphics g)   
    {
    //Create RGB
    int R;
    int G;
    int B;
        
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
            
            R = (int) (Math.random()*254);
            G = (int) (Math.random()*254);
            B = (int) (Math.random()*254);
            
            Color lineColor = new Color(R, G, B);
           
            g.setColor(lineColor);
            g.drawLine((int)startx, (int)starty, (int) endx, (int) endy); 
            

        }


                
        
     // Draw Random Squares
     for(int y = 0; y<100; y++){
         int startx = (int) (Math.random()*339 + 400);
         int starty = (int) (Math.random()*239 + 10);
         
         R = (int) (Math.random()*254);
         G = (int) (Math.random()*254);
         B = (int) (Math.random()*254);
         
         g.setColor(new Color(R, G, B));
         
         g.fillRect(startx, starty, 50, 50);
     

        }
        
        // Draw Random Circles
    for(int z = 0; z<100; z++){
        int startx = (int) (Math.random()*189 + 10);
        int starty = (int) (Math.random()*89 + 300);
        int diameter = (int) (Math.random()*199);
        
        R = (int) (Math.random()*254);
        G = (int) (Math.random()*254);
        B = (int) (Math.random()*254);
         
        g.setColor(new Color(R, G, B));

        g.drawOval(startx, starty,diameter,diameter);
    }    
        // Draw 3-D Box
    Polygon trap = new Polygon();
    
    trap.addPoint(500,400);
    trap.addPoint(600,400);
    trap.addPoint(600,450);
    trap.addPoint(550,450);
    g.setColor(Color.yellow);
    g.fillPolygon(trap);
    
    Polygon rhomb = new Polygon();
    
    rhomb.addPoint(500,400);
    rhomb.addPoint(550,450);
    rhomb.addPoint(550,550);
    rhomb.addPoint(500,500);
    g.setColor(Color.green);
    g.fillPolygon(rhomb);
    
    Polygon tri = new Polygon();
    
    tri.addPoint(600,400);
    tri.addPoint(650,450);
    tri.addPoint(600,450);
    g.setColor(Color.blue);
    g.fillPolygon(tri);
    
    g.setColor(Color.red);
    g.fillRect(550,450,100,100);
    
    
    }
        
}



    
 