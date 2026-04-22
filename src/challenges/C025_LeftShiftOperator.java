package challenges;

import java.util.Scanner;

public class C025_LeftShiftOperator {
    public static void main(String[] args) {
        //Write the JAVA program to perform the left shift.
        Scanner input = new Scanner(System.in);
        System.out.println("The Left Shift of a given number");
        System.out.print("Enter a number to perform left shift : ");
        int number = input.nextInt();
        int leftShift =  number << 1;

        System.out.println("The Lft Shift of "+number+" is "+leftShift);
        input.close();
    }
}
