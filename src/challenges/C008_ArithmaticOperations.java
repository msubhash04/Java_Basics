package challenges;

import java.util.Scanner;

public class C008_ArithmaticOperations {
    public static void main(String[] args) {
        //Write a Java Program which takes 2 inputs and gives result for the "+ - * / %" all of these Arithmetic operations.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :  ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int secondNumber = input.nextInt();

        System.out.println("================The Results for the operators are as follows================");
        arithmeticOperations(firstNumber,secondNumber);

    }

    public static void arithmeticOperations(int firstNo,int secondNo)
    {
        System.out.println("The Result of the + operator is :  "+(firstNo+secondNo));
        System.out.println("The Result of the - operator is :  "+(firstNo>=secondNo ? (firstNo-secondNo) : (secondNo-firstNo)));
        System.out.println("The Result of the * operator is :  "+(firstNo*secondNo));
        System.out.println("The Result of the / operator is :  "+(firstNo/secondNo));
        System.out.println("The Result of the % operator is :  "+(firstNo%secondNo));
    }
}
