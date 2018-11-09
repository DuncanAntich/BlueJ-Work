//This class contains everything needed to make a house in Java
//No locations are hard-coded to ensure wide applicability

import java.util.*;
import java.awt.*;
import java.applet.*;
public class House
{
    //The following method makes 60x60 windows from a point (x,y) with 4 panes
    public static void drawWindow(Graphics g, int x, int y){
        g.setColor(Color.white);            //Sets color to white
        g.fillRect(x,y,59,60);              //Draws window frame
        g.setColor(Color.black);            //Sets color to black
        g.drawRect(x,y,60,59);              //Draws window frame
        g.drawLine(x+30,y,x+30,y+60);       //Makes vertical pane divider
        g.drawLine(x,y+30,x+60,y+30);       //Makes horizontal pane divider
    }
    //The following method makes floors of a certain height and width at (x,y)
    public static void drawFloor(Graphics g, int x, int y, int width, int height){
        g.setColor(Color.blue);             //Sets floor outline color to blue
        g.drawRect(x,y,width, height);      //Draws floor outline at x,y
        g.setColor(new Color(231,198,154)); //Makes floors light tan color
        g.fillRect(x+1,y+1,width-1, height-1); //Creates filled floor
    }
    //The following method makes the door on the house
    public static void drawDoor(Graphics g, int x, int y){
        g.drawRect(x-1,y-1,31,61);      //Makes door outline
        g.setColor(Color.yellow);       //Sets color of door to yellow
        g.fillRect(x,y,30,60);          //Makes filled door
        g.setColor(Color.black);        //Sets color back to black
        Polygon handle = new Polygon(); //Creates new polygon for door handle
        handle.addPoint(x+25,y+25);     //These methods add points
        handle.addPoint(x+22,y+30);     //so that the button
        handle.addPoint(x+25,y+35);     //will be a rhombus
        handle.addPoint(x+28,y+30);     //when created
        g.fillPolygon(handle);          //Creates the door handle
    }
    //The following method makes a triangular roof
    public static void drawRoof(Graphics g, int x, int y, int width, int height){
        Polygon roof = new Polygon();           //Creates a polygon "roof"
        roof.addPoint(x,y);                     //Adds start of roof
        roof.addPoint(x+width/2,y-height);      //Adds peak of roof
        roof.addPoint(x+width,y);               //Adds end of roof
        g.setColor(Color.red);                  //Sets color to red
        g.fillPolygon(roof);                    //Creates roof
    }
    //The following method draws a chimney on the right side of the house
    public static void drawChimney(Graphics g, int x, int y, int width, int height) {
        Polygon chimney = new Polygon();            //Initializes chimney object
        chimney.addPoint(x+width/3,y);                      //Adds top left of chimney
        chimney.addPoint(x+width/2,y);                //Adds top right of chimney
        chimney.addPoint(x+width/2,y+height);     //Adds bottom right of chimney
        chimney.addPoint(x+width/3,y+height);     //Adds bottom left of chimney
        g.setColor(Color.red);                      //Sets color to red
        g.fillPolygon(chimney);                     //Creates chimney from point (x,y)
    }
}
