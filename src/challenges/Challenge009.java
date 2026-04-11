package challenges;

import java.util.Scanner;

public class Challenge009 {

    public static void main(String[] args) {
        //Write a Java Program to calculate the Product of the two floating point numbers.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first floating point value : ");
        float firstInput = input.nextFloat();
        System.out.print("Enter the second floating point value : ");
        float secondInput = input.nextFloat();

        Challenge009 ch = new Challenge009();
        float prodNo = ch.productOfFloatingNumber(firstInput,secondInput);
        System.out.println("The Product of the "+firstInput+" and "+secondInput+" is  "+prodNo);

    }

    public float productOfFloatingNumber(float firstNo,float secondNo)
    {
        return  (firstNo * secondNo);
    }
}
