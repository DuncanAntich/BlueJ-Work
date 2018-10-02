// Lab04av100.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04av100
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");


        double principal      = 250000;
        double annualRate     = 4.85;
        double numYears       = 30;
        double numMonths      = numYears * 12;
        double percentRate    = annualRate/100;
        double monthlyRate    = percentRate/12;
        double monthlyPercent = 1 + monthlyRate;
        double monthlyExpon   = Math.pow(monthlyPercent,numMonths);
        double monthlyPayment = (double) Math.round((((monthlyRate * monthlyExpon) / (monthlyExpon -1)) * principal) * 100) / 100;
        double totalPayment   = monthlyPayment * numMonths;
        double totalInterest  = monthlyPayment * numMonths - principal;
        double roundedMP      = (monthlyPayment);
        double roundedTP      = (double) Math.round(totalPayment * 100) / 100;
        double roundedTI      = (double) Math.round(totalInterest * 100) / 100;




        System.out.println("Principal:            "+principal);
        System.out.println("Interest Rate:        "+annualRate);
        System.out.println("Number of Years:      "+numYears);
        System.out.println("Monthly Payment:     $"+roundedMP);
        System.out.println("Total Payments:      $"+roundedTP);
        System.out.println("Total Interest:      $"+roundedTI);
        //I think that the example in the Lab04a pdf is wrong because it says that the decimal at the end
        //of Total Payments and Total Interest should be .8 when it should be rounded to .64.
    }
}

