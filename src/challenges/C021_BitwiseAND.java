package challenges;

import java.util.Scanner;

public class C021_BitwiseAND {
    public static void main(String[] args) {
        //Write the JAVA program to perform the BitwiseAnd on the entered numbers...
        Scanner input = new Scanner(System.in);
        System.out.println("The Bitwise And of two numbers");
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();

        int bitwiseAnd = firstNumber & secondNumber;
        System.out.println("The Bitwise And of the "+firstNumber+" and "+secondNumber+" is :  "+bitwiseAnd);
        input.close();
    }
}
