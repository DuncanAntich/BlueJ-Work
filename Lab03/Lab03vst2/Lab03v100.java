
/**
 * Lab03v100.java  
 * 
 * @author - Duncan Antich
 * @author - Period B4
 * @author - Id 0000000
 *
 *
 */ 
public class Lab03v100
{
    public static void main(String[] args) {
        int startMill = 10000123;            //Sets number of initial milli-seconds
        int startSec = startMill / 1000;    //Finds starting seconds
        int hours = startMill / 3600000;    //Finds number of starting hours
        int remMin = startSec % 3600;       //Finds remainder of hours
        int minutes = remMin / 60;          //Finds number of remaining minutes
        int remSec = remMin % 60;           //Finds remaining seconds
        int remMill = startMill % 1000;     //Finds number of remaining Milli-seconds
        
        System.out.println("Lab03, 100 Point Version \n");              
        System.out.println("Starting Milli-Seconds:  " +startMill);     //Prints starting milliseconds
        System.out.println("Hours:                   " +hours);         //Prints number of hours
        System.out.println("Minutes:                 " +minutes);       //Prints number of minutes
        System.out.println("Seconds:                 " +remSec);        //Prints number of remaining seconds
        System.out.println("Milli-seconds:           " +remMill);       //Prints remaining milli-seconds
}

}
