// Lab17avst.java
// The Recursive Methods Program
// This is the student, starting version of the Lab17a assignment.
// Students need to write the implementations of the
// <countUp>, <countDown>, <sum>, <fact>, <pow>, <fibo> and <gcf> methods.

/**
 * 15/04/2016 - modified by Bill Montana to "fix" the curly braces and line spacing
 *
 */

public class Lab17avst {
    public static void main(String[] args) {
        System.out.println("Counting from 1 up to 10");
        Test.countUp(1,10);
        skip2();    
        System.out.println("Counting from 10 down to 1");
        Test.countDown(1,10);
        skip2();    
        System.out.println("The sum of all integers 0 to 100 " + Test.sum(100));
        skip1();    
        System.out.println("The factorial of 8 is " + Test.fact(8));
        skip1();    
        System.out.println("The 10th Fibonacci Number is " + Test.fibo(10));
        skip1();    
        System.out.println("The GCF of 120 and 108 is " + Test.gcf(120,108));
        skip1();    
        System.out.println("2 raised to the 8th power is " + Test.pow(2,8));
    }

    public static void skip1() {
        System.out.println();
    }

    public static void skip2() {
        System.out.println("\n");
    }

    public static void skip3() {
        System.out.println("\n\n");
    }    
}

class Test {
    // displays consecutive integers from k to n
    public static void countUp(int k, int n) {
        if(k<=n){
            System.out.print(k + " ");
            countUp(k + 1, n);
        }
    }   

    // displays consecutive integers backwards from k to n
    public static void countDown(int k, int n) {
        if(n>=k){
            System.out.print(n + " ");
            countDown(k,n -1);
        }
    }

    // returns the sum of all integers 1 + 2 + .... + n-1 + n
    public static int sum(int n) {
        int sum = 0;
        if(n==0)
            return 0;
        else return n + sum(n-1);
    }

    // returns n factorial
    public static int fact(int n) {
        int fact = 1;
        if(n==0)
            return 1;
        else return n*fact(n-1);
    }

    // returns the nth Fibonacci number
    public static int fibo(int n) {
        int fibo = 0;
        if(n==1 || n==2)
            return 1;
        else return fibo(n-1) + fibo(n-2);
    }

    // returns the gcf of n1 and n2
    public static int gcf(int n1, int n2) {
        int remainder = n1 % n2;
        if(remainder == 0)
            return n2;
        else
            return gcf(n2, remainder);
    }       

    // returns n1 raised to the n2 power
    public static int pow(int n1, int n2) {
        int pow = n1;
        if(n2==0)
            return 1;
        else return pow * pow(n1,n2-1);
    }   
}    
