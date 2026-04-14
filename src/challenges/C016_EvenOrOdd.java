package challenges;

import java.util.Scanner;

public class C016_EvenOrOdd {

    public static void main(String[] args) {
        //Write a JAVA Program to determine weather a number is EVEN or ODD...
        Scanner input = new Scanner(System.in);
        System.out.println("Even Or Odd Java Program");
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        if(number % 2 == 0)
            System.out.println("The entered "+number+" is Even number");
        else
            System.out.println("The entered "+number+" is Odd number");
    }
}
