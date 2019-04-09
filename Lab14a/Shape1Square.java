// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   private int x;
   private int y;
   private int size;
    public Shape1Square(){
        x=120;
        y=100;
        size=100;
    }
    
    public void drawShape(Graphics g){
       g.fillRect(x,y,size,size);
   }
   public void displayName(Graphics g){
       g.drawString("Square",x,y-30);
   }
   public void displayNumSides(Graphics g){
       g.drawString("A square has four sides",x,y+130);
   }
   public void draw(Graphics g){
      drawShape(g);
      displayName(g);
      displayNumSides(g);
    }
}


