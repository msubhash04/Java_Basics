package challenges;

import java.util.Scanner;

public class C027_BitWiseEvenOdd {
    public static void main(String[] args) {
        //Write the JAVA program to check the given number is Even or Odd by using the bit wise operators.

        Scanner input = new Scanner(System.in);
        System.out.println("Even or Odd by using the Bit Wise Operator");
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if((number & 1) == 1)
            System.out.println("The number "+number+" is a ODD number");
        else
            System.out.println("The number "+number+" is a EVEN number");

        input.close();
    }
}
