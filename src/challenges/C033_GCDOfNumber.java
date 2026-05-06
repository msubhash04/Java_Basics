package challenges;

import java.util.Scanner;

public class C033_GCDOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The GCD(Greatest Common Divisor) of Numbers");
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();

        int gcd = getGcd(firstNumber,secondNumber);
        System.out.println("The GCD of "+firstNumber+" and "+secondNumber+" is "+gcd);
        input.close();
    }

    /**
     * The below JAVA program is used to get the GCD(Greatest Common Diviser) of two numbers.
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    private static int getGcd(int firstNumber, int secondNumber) {
        int i = 2,gcd=1;
        int least = getLeast(firstNumber,secondNumber);
        while(i<=least){
            if(firstNumber%i == 0 && secondNumber%i == 0)
                gcd = i;
            i++;
        }
        return gcd;
    }

    /**
     * This below JAVA program is used to get the least number of given two numbers.
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    private static int getLeast(int firstNumber, int secondNumber) {
        if(firstNumber<secondNumber)
            return firstNumber;
        else
            return secondNumber;
    }
}
