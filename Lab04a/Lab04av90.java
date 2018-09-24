// Lab04av90.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04av90
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 90 Point Version\n");

        double principal      = 250000;
        double annualRate     = 4.85;
        double numYears       = 30;
        double numMonths      = numYears * 12;
        double percentRate    = annualRate/100;
        double monthlyRate    = percentRate/12;
        double monthlyPercent = 1 + monthlyRate;
        double monthlyExpon   = Math.pow(monthlyPercent,numMonths);
        double monthlyPayment = ((monthlyRate * monthlyExpon) / (monthlyExpon -1)) * principal;
        double totalPayment   = monthlyPayment * numMonths;
        double totalInterest  = monthlyPayment * numMonths -principal;





        System.out.println("Principal:            "+principal);
        System.out.println("Interest Rate:        "+annualRate);
        System.out.println("Number of Years:      "+numYears);
        System.out.println("Monthly Payment:     $"+monthlyPayment);
        System.out.println("Total Payments:      $"+totalPayment);
        System.out.println("Total Interest:      $"+totalInterest);
    }
}

