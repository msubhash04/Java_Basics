package challenges;

import java.util.Scanner;

public class C029_SumAllOddNumbers {
    /**
     * The below Java program is used to Sum all Odd numbers from 1 to specified number.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to get the Sum of all Odd numbers from 1 : ");
        int number = input.nextInt();
        C029_SumAllOddNumbers c029 = new C029_SumAllOddNumbers();
        int sumOfOdd = c029.sumOfAllOdd(number);
        System.out.println("The Sum of all Odd numbers in between the 1 to "+number+" is "+sumOfOdd);
        input.close();
    }

    private int sumOfAllOdd(int number) {
        if(number<1)
        {
            return 0;
        }else {
            int i = 1,result=0;
            while (i <= number) {
                result += i;
                i += 2;
            }
            return result;
        }
    }
}
