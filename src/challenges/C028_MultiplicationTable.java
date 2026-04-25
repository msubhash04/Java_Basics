package challenges;

import java.util.Scanner;

public class C028_MultiplicationTable {
    /**
     * The below java program will prints the multiplication table.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print the multiplication table : ");
        int number = input.nextInt();
        System.out.println("The Multiplication table of the "+number+" is as follows");
        multiplicationTablePrint(number);
        input.close();
    }

    public static void multiplicationTablePrint(int number)
    {
        int i = 1;
        while(i<=10)
        {
            System.out.println(number+" X "+i+" = "+(number*i));
            i++;
        }
    }
}
