package challenges;

import java.util.Scanner;

public class C024_BitWiseCompliment {
    public static void main(String[] args) {
        //Write a JAVA program to perform the bit wise compliment on the entered number.
        Scanner input = new Scanner(System.in);
        System.out.println("Compliment of a given number");
        System.out.print("Enter the Number  : ");
        int number = input.nextInt();
        int complimentNumber = ~number;

        System.out.println("The compliment of the "+number+" is "+complimentNumber);
        input.close();
    }
}
