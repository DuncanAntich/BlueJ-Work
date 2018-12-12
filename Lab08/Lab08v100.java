// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
            

        }
        while (notFinished);
    }
}



class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */
public static boolean isPal(String s)
    {
        int leng = s.length();
        s = s.toLowerCase();
        String rev = "";        
        for(int count = leng; count>0; count--){
            rev += s.substring(count-1,count);
        }
        String trimmed = s.trim();
        String purged = purge(s);
        int trimLeng = trimmed.length();
        int compLeng = trimLeng - leng;
        if(rev.equals(s)&& !(trimmed.equals("")) && !(purged.equals("")) && compLeng==0)
            return true;      // This statement is provided to allow initial compiling.
        else
            return false;
    }  
   
   /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
   private static boolean isLetter(String letter)
   {   
       String lowerLetter = letter.toLowerCase();

       if(lowerLetter.compareTo("a") >= 0 && lowerLetter.compareTo("z") <= 0)
        return true;
       else
        return false;
   }
   
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    static String purge(String s)
    {
      s.trim();
      int leng = s.length();
      String purged = "";
      for(int count = leng; count>0; count--){
          String letter = s.substring(count-1,count);
          if(isLetter(letter) == true )
            purged += letter;
      }
      return purged;
    }
   
   /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        s.toLowerCase();
        String purged = purge(s);
        int leng = purged.length();
        String rev = "";
        for(int count = leng; count>0; count--){
            rev += purged.substring(count-1,count);
        }
        if(isPal(s)==true||rev.equals("")){
            return false; 
        } // This statement is provided to allow initial compiling.
        else if(rev.equals(purged)){
            return true;
        }
        else{
            return false;
        }
    }

}

