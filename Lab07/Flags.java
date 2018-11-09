import java.awt.*;
import java.util.*;

 
public class Flags{
    public static void Italy(Graphics g, int x, int y, int width, int height){
        g.setColor(Color.green);
        g.fillRect(x,y,width/3,height);
        g.setColor(Color.white);
        g.fillRect(x+width/3,y,width/3,height);
        g.setColor(Color.red);
        g.fillRect(x+width*(2/3),y,width/3,height);
    }
    public static void Germany(Graphics g, int x, int y, int width, int height){
        g.fillRect(x,y,width,height/3);
        g.setColor(Color.red);
        g.fillRect(x,y+height/3,width,height/3);
        g.setColor(new Color(255,204,0));
        g.fillRect(x,y+2*height/3,width,height/3);
    }
    public static void HTricolor(Graphics g, int x, int y, int width, int height, Color top, Color middle, Color bottom){
        
    }
}
