import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePaymentCalculator {
    public static void main(String[] args){

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;


        //Take all the input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = sc.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period(Years): ");
        byte years = sc.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEARS;


        //Calculate mortgage using formula
        double mortgageFormula = principle
                * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate , numberOfPayments)))
                / (Math.pow(1 + monthlyInterestRate , numberOfPayments) - 1);

        //format mortgage value into currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgageFormula);

        //finally print
        System.out.println("Mortgage : " +mortgageFormatted);
        System.out.println("Thank you!");





    }
}
