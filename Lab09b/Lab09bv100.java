// Lab09bvst.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.

import java.util.Scanner;

public class Lab09bv100
{
    private static int num1, den1;   // numerator and denominator of the 1st rational number
    private static int num2, den2;   // numerator and denominator of the 2nd rational number

    public static void main (String args[])
    {
        enterData();

        Rational r1 = new Rational(num1,den1);
        Rational r2 = new Rational(num2,den2);
        Rational r3 = new Rational();

        r3.multiply(r1,r2);
        System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced());
        r3.divide(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced());
        r3.add(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced());
        r3.subtract(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced());
        System.out.println();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 1st numerator ----> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the 1st denominator --> ");
        den1 = input.nextInt();
        System.out.print("\nEnter the 2nd numerator ----> ");
        num2 = input.nextInt();
        System.out.print("\nEnter the 2nd denominator --> ");
        den2 = input.nextInt();
    }
}

class Rational
{
    private int firstNum;      // entered numerator
    private int firstDen;      // entered denominator
    private int reducedNum;     // reduced numerator
    private int reducedDen;     // reduced denominator
    private int gcf;           // greatest common factor
    private String orig;
    private String reduced;
    private int num1;
    private int num2;
    private int den1;
    private int den2;
    private int num3;
    private int den3;
    private int lcm;
    
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
    
    public void multiply(Rational r1, Rational r2){
        firstNum = r1.getNum() * r2.getNum();
        firstDen = r1.getDen() * r2.getDen();
    }
    
    public void divide(Rational r1, Rational r2){
        firstNum = r1.getNum() * r2.getDen();
        firstDen = r2.getNum() * r1.getDen();
    }
    
    public void add(Rational r1, Rational r2){
        r1.reduce();
        r2.reduce();
        
        num1 = r1.getNum();
        num2 = r2.getNum();
        den1 = r1.getDen();
        den2 = r2.getDen();
        
        firstNum = num1*den2 + num2*den1;
        firstDen = den1*den2;        
    }
    
    public void subtract(Rational r1, Rational r2){
        r1.reduce();
        r2.reduce();
        
        num1 = r1.getNum();
        num2 = r2.getNum();
        den1 = r1.getDen();
        den2 = r2.getDen();
        
        firstNum = num1*den2 - num2*den1;
        firstDen = den1*den2;
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

