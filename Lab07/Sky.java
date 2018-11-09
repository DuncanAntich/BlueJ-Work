import java.util.*;
import java.awt.*;
import java.applet.*; 
public class Sky
{
    public static void drawMoon(Graphics g, Color sky, int x, int y, int size){
        g.setColor(Color.white);
        g.fillOval(x,y,size,size);
        g.setColor(sky);
        g.fillOval(x-15,y-5,size-20,size-20);
    }
    public static void drawStars(Graphics g, int width, int height){
        for(int count = 0; count<101; count++){
            Utility.randomColor(g);
            int x = Utility.random(width,0);
            int y = Utility.random(height,0);
            g.fillRect(x,y,3,3);
        }
    }
}

