 
import java.util.*;
import java.awt.*;

public class Village
{
    //This method makes a one-floor tall house w/ two windows and a door
    public static void OneFloorHouse(Graphics g, int x, int y, int width, int height){
        House.drawFloor(g,x,y,width,height);                            //Draws floor of house
        House.drawRoof(g,x,y,width,height);                             //Draws roof on house
        House.drawChimney(g,x+(2/3)*width,y-height,width/5,height);   //Draws chimney on house
        House.drawDoor(g,x+width/3+10,y+height-60);                     //Draws door on house
        g.setColor(Color.black);                                        //Sets color to black
        House.drawWindow(g,x+width/10,y+height/10);                     //Draws left window
        House.drawWindow(g,x+7*width/10,y+height/10);                   //Draws right window
    }
    //This method makes a two-floor tall house w/ five windows and a door
    public static void TwoFloorHouse(Graphics g, int x, int y, int width, int height){
        House.drawFloor(g,x,y,width,height);                                    //Draws 1st floor
        House.drawFloor(g,x,y-height+5,width,height);                           //Draws 2nd floor
        House.drawRoof(g,x,y-height+5,width,height);                            //Draws roof
        House.drawChimney(g,x+(width-width/5),y-2*height,width/5,height);   //Draws chimney
        House.drawDoor(g,x+width/3+10,y+height-60);                             //Draws door
        g.setColor(Color.black);                                                //Sets color to black
        House.drawWindow(g,x+width/10,y+height/10);                             //Draws left 1st floor
        House.drawWindow(g,x+7*width/10,y+height/10);                           //Draws right 1st floor
        House.drawWindow(g,x+width/10,y-9*height/10);                           //Draws upper left
        House.drawWindow(g,x+4*width/10,y-9*height/10);                         //Draws upper middle
        House.drawWindow(g,x+7*width/10,y-9*height/10);                         //Draws upper right
    }

}
    

