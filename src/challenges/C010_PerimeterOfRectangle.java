package challenges;

import java.util.Scanner;

public class C010_PerimeterOfRectangle {
    public static void main(String[] args) {
        //Write a JAVA program to display the perimeter of a rectangle.
        // ABCD = A + B + C + D;

        System.out.println("To Calculate the perimeter of the rectanlge,\n you need to provide the length and width of the rectangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle : ");
        int length = input.nextInt();
        System.out.print("Enter the Width of the rectangle : ");
        int width = input.nextInt();
        System.out.println("*******************************************");
        int perimeter = (width <= 0 || length <= 0) ? 0:(2 * (length + width)); //Using the ternary operator.
        System.out.println(" The Perimeter of the rectangle is : "+perimeter);

    }
}
