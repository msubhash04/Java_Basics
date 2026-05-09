package challenges;

import java.util.Scanner;

public class C007_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple calculator");
        System.out.println("Enter the first number :  ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The Sum of two numbers is : "+sum);

    }
}
