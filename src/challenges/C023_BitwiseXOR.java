package challenges;

import java.util.Scanner;

public class C023_BitwiseXOR {
    public static void main(String[] args) {
        //Write the JAVA program to perform the BitwiseXOR on the entered numbers...
        Scanner input = new Scanner(System.in);
        System.out.println("The Bitwise XOR of two numbers");
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();

        int bitwiseAnd = firstNumber ^ secondNumber;
        System.out.println("The Bitwise XOR of the "+firstNumber+" and "+secondNumber+" is :  "+bitwiseAnd);
        input.close();
    }
}
