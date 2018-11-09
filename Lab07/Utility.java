import java.util.*;
import java.awt.*; 
public class Utility
{
    public static int random(int max, int min){
        int range = max - min +1;                           //Sets range
        int randint = (int) ((Math.random()*range) + min);  //Creates random integer
        return randint;                                     //Returns random integer
    }
    public static void randomColor(Graphics g){
        int red = random(255,0);                //Creates random red value
        int green = random(255,0);              //Creates random green value
        int blue = random(255,0);               //Creates random blue value
        g.setColor(new Color(red,green,blue));  //Creates random color
    }
}
