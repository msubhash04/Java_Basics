package challenges;

import java.util.Scanner;

public class C026_RightShiftOperator {
    public static void main(String[] args) {
        //Write the JAVA program to perform the RIGHT shift.
        Scanner input = new Scanner(System.in);
        System.out.println("The Right Shift of a given number");
        System.out.print("Enter a number to perform Right shift : ");
        int number = input.nextInt();
        int rightShift =  number >> 1;

        System.out.println("The Right Shift of "+number+" is "+rightShift);
        input.close();
    }
}
