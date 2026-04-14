package challenges;

import java.util.Scanner;

public class C014_FarhenhitToCelcious {
    public static void main(String[] args) {
        //Write a program to calculate the Farhenhit to Celcious...
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate the Farhenhit to Celcious use the formula as [ (F - 32)*5/9 ]");
        System.out.print("Enter the Temparature in the Farenhit : ");
        float fah = input.nextFloat();
        float Celcious = (fah - 32)*5/9;
        System.out.println("The temparature in the Celcious is : "+Celcious);
    }
}
