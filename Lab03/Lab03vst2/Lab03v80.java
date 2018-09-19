
/**
 * Lab03v80.java  
 * 
 * @author - Duncan Antich
 * @author - Period B4
 * @author - Id 0000000
 *
 *
 */ 
public class Lab03v80
{
    public static void main(String[] args) {
        int startSec = 10000;               //Sets starting seconds
        int hours = startSec / 3600;        //Finds number of starting hours
        int remMin = startSec % 3600;       //Finds remainder of hours
        int minutes = remMin / 60;          //Finds number of remaining minutes
        int remSec = remMin % 60;           //Finds remaining seconds
        
        System.out.println("Lab03, 80 Point Version \n");
        System.out.println("Starting Seconds:  " +startSec);
        System.out.println("Hours:             " +hours);
        System.out.println("Minutes:           " +minutes);
        System.out.println("Seconds:           " +remSec);
}

}
