package challenges;

import java.util.Scanner;

public class Challenge013 {
    public static void main(String[] args) {
        //Write a JAVA Program to calculate the simple interest...
        //Simple Interest = P(1 + R/100)T

        Scanner input = new Scanner(System.in);
        System.out.println("To Calculate the Compound Interest\n Need to enter the Principal Amount, Time periode and Rate of interest annually");
        System.out.print("Enter the total Principal Amount : ");
        float principalAmt = input.nextFloat();
        System.out.print("Enter the Time Periode : ");
        int timePeriod = input.nextInt();
        System.out.print("Enter the Rate of intrest annually : ");
        float intrestRate = input.nextFloat();

        double simpleIntrest = getCompoundIntrest(principalAmt, timePeriod, intrestRate);
        System.out.println("The Compound intrest is : "+simpleIntrest);
    }

    private static double getCompoundIntrest(float principalAmt, int timePeriod, float intrestRate) {
        // Formula: CI = P * (1 + R/100)^T - P
        double amount = principalAmt * Math.pow(1 + (intrestRate / 100), timePeriod);
        return amount - principalAmt;
    }


}
