// Lab07v110.java
// Student Version
// All methods used are completely variable (within reason)

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab07v110 extends Applet
{
    
    public void paint(Graphics g){        
        Surroundings.drawBackground(g,Color.black,1000,800);
        Sky.drawStars(g,1000,350);
        Sky.drawMoon(g, Color.black, 100, 100, 140);
        Village.OneFloorHouse(g,400,200,300,100);
        Village.TwoFloorHouse(g,700,400,300,100);
        Surroundings.drawClock(g,500,500,50,220);
        Surroundings.drawTree(g,200,600,50,220);
        Surroundings.drawTree(g,800,600,50,220);
    }
        
}



    
 