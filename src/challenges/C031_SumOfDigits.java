package challenges;

import java.util.Scanner;

public class C031_SumOfDigits {
    /**
     * The below Java program will returns the sum of number Ex: 236 the sum is 2+3+6 = 11
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the sum of the digits : ");
        int number = input.nextInt();
        int sumDigits = sumOfDigitsOfNumber(number);
        System.out.println("The sum of digits of "+number+" is "+sumDigits);
        input.close();
    }

    /**
     * This method accepts the number as the input argument and returns the sum of the digits of the number
     * @param number
     * @return
     */
    private static int sumOfDigitsOfNumber(int number) {
        int sumOfDigits = 0;
        if(number<1)
        {
            return 0;
        } else if (number<10) {
            return number;
        }else {
            while(number>0)
            {
                sumOfDigits += number%10;
                number /= 10;
            }
        }
        return sumOfDigits;
    }
}
