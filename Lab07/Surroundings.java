//This is a repository of surroundings
//No locations are hardcoded except upper left corner, only proportions
import java.util.*;
import java.awt.*;
import java.applet.*;

public class Surroundings
{
    //This method creates a tree
    public static void drawTree(Graphics g, int x, int y,int width, int height){
        g.setColor(new Color(150,100,15));                      //The color is now brown
        g.fillRect(x,y,width,height);                           //This draws the trunk
        g.setColor(new Color(20,200,50));                       //Sets color to leaf green
        g.fillOval(x-width,y-width,width*3,width*3);            //Fills oval

    }
    //This method creates a plain green foreground and plain background
    public static void drawBackground(Graphics g, Color c, int width, int height){
        g.setColor(new Color(0,255,0));                 //Makes foreground green
        g.fillRect(0,height/2,width,height/2);          //Creates foreground
        g.setColor(c);                                  //Makes backround color c
        g.fillRect(0,0,width,height/2);                 //Creates background
    }
    //The following method creates a clock tower
    public static void drawClock(Graphics g, int x, int y, int width, int height){
        g.setColor(new Color(210,210,210));                             //Sets color to off-white
        g.fillRect(x,y,width,height);                                   //Creates body of tower
        g.fillRect(x-width/2,y,width*2,width*2);                        //Creates top of tower
        g.setColor(Color.white);                                        //Sets clockface to white
        g.fillOval(x,y+width/2,width/(3/2),width/(3/2));        //Creates clockface
        g.setColor(Color.black);                                    //Sets color to black
        g.drawLine(x+width/2,y+width,x+width/4,y+(width/2+10));   //Sets minute hand
        g.drawLine(x+width/2,y+width,x+width*3/4,y+(width/4+20));       //Sets hour hand
    }
}
