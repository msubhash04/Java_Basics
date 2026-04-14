package challenges;

import java.util.Scanner;

public class C015_PositiveOrNegativeNumber {
    public static void main(String[] args) {
        //Write a program to determine the weather a number is Positive or Negative...
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number determiner");
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        if(number>0)
            System.out.println("The entered number "+number+" is a Positive number");
        else if(number == 0)
            System.out.println("The entered number is 0");
        else if(number < 0)
            System.out.println("The entered number "+number+" is a Negative number");
    }
}
