// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
   private int x;
   private int y;
   public Shape2Triangle(){
    x = 625;
    y = 80;
    }
   public void drawShape(Graphics g){
       Polygon tri = new Polygon();
       tri.addPoint(x,y);
       tri.addPoint(x+75,y+100);
       tri.addPoint(x-75,y+100);
       g.fillPolygon(tri);
   }
   public void displayName(Graphics g){
       g.drawString("Triangle", x-25, y-30);
   }
   public void displayNumSides(Graphics g){
       g.drawString("A Triangle has three sides", x-50, y+120);
   }
   public void draw(Graphics g){
       drawShape(g);
       displayName(g);
       displayNumSides(g);
    }
}

