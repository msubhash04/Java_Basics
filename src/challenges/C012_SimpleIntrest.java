package challenges;

import java.util.Scanner;

public class C012_SimpleIntrest {
    public static void main(String[] args) {
        //Write a JAVA Program to calculate the simple interest...
        //Simple Interest = (P * T * R)/100

        Scanner input = new Scanner(System.in);
        System.out.println("To Calculate the Simple Interest\n Need to enter the Principal Amount, Time periode and Rate of interest annually");
        System.out.print("Enter the total Principal Amount : ");
        float principalAmt = input.nextFloat();
        System.out.print("Enter the Time Periode : ");
        int timePeriod = input.nextInt();
        System.out.print("Enter the Rate of intrest annually : ");
        float intrestRate = input.nextFloat();

        float simpleIntrest = getSimpleIntrest(principalAmt, timePeriod, intrestRate);
        System.out.println("The Simple intrest is : "+simpleIntrest);
    }

    private static float getSimpleIntrest(float principalAmt, int timePeriod, float intrestRate) {
        float simpleIntrest = (principalAmt * timePeriod * intrestRate)/100;
        return simpleIntrest;
    }
}
