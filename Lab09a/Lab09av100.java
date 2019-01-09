// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09av100
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}



class Rational
{
    private int reducedNum;
    private int reducedDen;
    private int firstNum;
    private int firstDen;
    private double dec;
    private int gcf;
    private String orig;
    private String reduced;
    public Rational(){
    }
    public Rational(int n1, int n2){
        firstNum = n1;
        firstDen = n2;
        reducedNum = n1;
        reducedDen = n2;
    }
    public int getNum(){
        return reducedNum;
    }
    
    public int getDen(){
        return reducedDen;
    }
    
    public double getDecimal(){
        dec = (double) firstNum/ (double) firstDen;
        return dec;
    }
    
    public String getOriginal(){
        return orig = firstNum + "/" + firstDen;
    }
    
    public void reduce(){
        getGCF(firstNum,firstDen);
        reducedNum = firstNum/gcf;
        reducedDen = firstDen/gcf;
    }
    
    public String getReduced(){
        reduce();
        return reduced = reducedNum + "/" + reducedDen;
    }
    
    public void displayData()
    {
        System.out.println();
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " +getReduced());
        System.out.println();
    }

    private void getGCF(int n1,int n2)
    {
        int rem = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
    }
}








