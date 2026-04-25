package challenges;

import java.util.Scanner;

public class C030_FactorialOfNumber {
    /**
     * The below Java Program is used to find the factorial of a natural number.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the factorial : ");
        int number = input.nextInt();
        double fact = factorial(number);
        System.out.println("The factorial of the "+number+" is "+fact);
        input.close();
    }

    /**
     * The below program will accept the number and returns the factorial of this number
     * @param number
     * @return
     */
    public static double factorial(int number)
    {
        double factorialOfNumber = 1;
        if(number < 0)
            return 0;
        else{
            while(number>0)
            {
                factorialOfNumber *= number;
                number--;
            }
            return factorialOfNumber;
        }
    }
}
