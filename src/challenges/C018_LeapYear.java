package challenges;

import java.util.Scanner;

public class C018_LeapYear {
    public static void main(String[] args) {
        //Write a JAVA program to determine weather thr year is Leap Year or Not...
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year to find weather its a Leap Year or Not");
        int year = input.nextInt();

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("The year is a Leap Year");
        else
            System.out.println("The year is not a Leap Year");
    }
}
