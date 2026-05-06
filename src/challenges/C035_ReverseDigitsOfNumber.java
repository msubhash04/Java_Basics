package challenges;

import java.util.Scanner;

public class C035_ReverseDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reverse the digits of a number");
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if (number > 0) {
            ReverseNumber reverseNumber = new ReverseNumber();
            int reverse = reverseNumber.reverse(number);
            System.out.println("The reversed number of the " + number + " is " + reverse);
        } else {
            System.out.println("The entered number is 0 or -ve so please enter correct number");
        }
        input.close();
    }
}

/**
 * The below JAVA program is used to get the Reversed number of the entered number
 */
class ReverseNumber {
    public int reverse(int number) {
        int reverse = 0;

        while (number > 0) {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }
        return reverse;
    }
}
