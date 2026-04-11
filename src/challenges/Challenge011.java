package challenges;

import java.util.Scanner;

public class Challenge011 {
    public static void main(String[] args) {
        //Write a JAVA Program to display the area of a Triangle...
        //Area = 1/2* B * H

        Scanner input = new Scanner(System.in);
        System.out.println("To Calculate the Area of a triangle, Provide the breadth and height of a tri-angle");
        System.out.print("Enter the Breadth of a triangle : ");
        int breadth = input.nextInt();
        System.out.print("Enter the Height of a triangle : ");
        int height = input.nextInt();
        int result =  (breadth * height)/2 ;
        System.out.println("The Area of a Triangle is : "+result);
    }
}
