package challenges;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping Process");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int firstValue = input.nextInt();
        System.out.print("Enter the second value : ");
        int secondValue = input.nextInt();

        int tempValue = firstValue;
        firstValue = secondValue;
        secondValue = tempValue;

        System.out.println("Swapping Done Successfully...");
        System.out.println("After swappe the FirstValue : "+firstValue+"  and SecondValue  : "+secondValue);

    }
}
