// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   private int x;
   private int y;
   private int size;
   public Shape4Circle(){
       x = 550;
       y = 400;
       size = 150;
   }
   public void drawShape(Graphics g){
      g.fillOval(x,y,size,size);
   }
   public void displayName(Graphics g){
      g.drawString("Circle",x+40,y-20);
   }
   public void displayNumSides(Graphics g){
      g.drawString("A circle has 0 sides", x+10, y+size+20);
   }
   public void draw(Graphics g){
       drawShape(g);
       displayName(g);
       displayNumSides(g);
   }
}
