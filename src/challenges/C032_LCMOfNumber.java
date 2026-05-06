package challenges;

import java.util.Scanner;

public class C032_LCMOfNumber {

    /**
     * The below JAVA program is used to get the LCM(Least Common Multiple) of Given numbers Num1 and Num2.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The LCM(Least Common Multiple) Of Numbers");
        System.out.print("Enter the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();

        int lcmNum = getLcm(firstNumber,secondNumber);
        System.out.println("The LCM of "+firstNumber+" and "+secondNumber+" is "+lcmNum);
        input.close();
    }

    private static int getLcm(int firstNumber, int secondNumber) {
        int i = 1;
        while(i<=secondNumber)
        {
            int lcm = firstNumber * i;
            if(lcm % secondNumber == 0)
            {
                return lcm;
            }
            i++;
        }
        return 1;
    }


}
