// Lab11av100.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.util.*;
import java.text.*;

public class Lab11av100
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.println("Primes up to ==========>");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS...");
        primes[0] = primes[1] = false;
        if(primes.length == 0)
            System.out.println("Sorry, that isn't an acceptable value.");
        for(int count = 2; count<primes.length; count++){
            primes[count] = true;
        }
        for(int count = 2; count*count < primes.length;count++){
            if(primes[count])
                for(int number = count; count*number < primes.length; number++)
                    primes[count*number] = false;
        }
        
    }
    

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();


        
        NumberFormat formatter = new DecimalFormat("0000");
        int num = 1;
        
        for(int count = 0; count<primes.length; count++){

              if(primes[count]){
                System.out.print(formatter.format(count)+"     ");
                num++;
                if(num % 10 == 0)
                System.out.print("\n");
            }

        }
    }

}



