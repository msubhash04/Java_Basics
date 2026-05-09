package challenges;

import java.util.Scanner;

public class C017_GreatestOfThree {
    public static void main(String[] args) {
        //Write a JAVA program to find the greatest of the three numbers...
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest of the Three numbers");
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third number : ");
        int thirdNumber = input.nextInt();

        if(firstNumber > secondNumber)
        {
            if(firstNumber > thirdNumber)
                System.out.println("The "+firstNumber+" is greater then the "+secondNumber+" and "+thirdNumber);
            else
                System.out.println("The "+thirdNumber+" is greater then the "+firstNumber+" and "+secondNumber);
        }else{
            if(secondNumber > thirdNumber)
                System.out.println("The "+secondNumber+" is greater then the "+firstNumber+" and "+thirdNumber);
            else
                System.out.println("The "+thirdNumber+" is greater then the "+firstNumber+" and "+secondNumber);
        }

        int result = (firstNumber>secondNumber) ? ((firstNumber>thirdNumber)? firstNumber : thirdNumber) : ((secondNumber>thirdNumber) ? secondNumber : thirdNumber);
        System.out.println("The greatest among three numbers is "+result);
    }
}
