// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   private int x;
   private int y;
   
   public Shape3Octagon(){
       x=250;
       y=375;
   }
   public void drawShape(Graphics g){
       Polygon octo = new Polygon();
       octo.addPoint(x,y);
       octo.addPoint(x+50,y+50);
       octo.addPoint(x+50,y+100);
       octo.addPoint(x,y+150);
       octo.addPoint(x-50,y+150);
       octo.addPoint(x-100,y+100);
       octo.addPoint(x-100,y+50);
       octo.addPoint(x-50,y);
       g.fillPolygon(octo);
   }
   public void displayName(Graphics g){
       g.drawString("Octagon", x-50,y-30);
   }
   public void displayNumSides(Graphics g){
       g.drawString("An octagon has eight sides", x-50, y+175);
   }
   public void draw(Graphics g){
       drawShape(g);
       displayName(g);
       displayNumSides(g);
   }
}

