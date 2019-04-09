// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14av100 extends Applet
{
    public void paint(Graphics g)
    {
        drawGrid(g);
        displayShapes(g);
   }

    public void drawGrid(Graphics g)
    {
      g.drawRect(10,10,800,600);
        g.drawLine(10,300,810,300);
        g.drawLine(410,10,410,610);
    }
    public void displayShapes(Graphics g){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape square = new Shape1Square();
        shapes.add(square);
        Shape tri = new Shape2Triangle();
        shapes.add(tri);
        Shape octa = new Shape3Octagon();
        shapes.add(octa);
        Shape circle = new Shape4Circle();
        shapes.add(circle);
        for(Shape shape: shapes)
            shape.draw(g);
       }
}

