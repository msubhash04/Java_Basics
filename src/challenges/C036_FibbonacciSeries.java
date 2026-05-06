package challenges;

import java.util.Scanner;

public class C036_FibbonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The fibbonacci series ");
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        fibbonacciSeries(number);
        input.close();
    }

    /**
     * The below JAVA program is used to get the fibbonacci series upto entered number.
     * @param number
     */
    public static void fibbonacciSeries(int number) {
        int firstNumber = 0, secondNumber = 1;
        if (number <= 0) {
            System.out.println("0 ");
            return;
        }
        System.out.print(firstNumber + " "+secondNumber+" ");
        int thirdNumber = firstNumber + secondNumber;
        while (thirdNumber <= number) {
            System.out.print(thirdNumber + " ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = firstNumber + secondNumber;
        }
    }
}
