package challenges;

import java.util.Scanner;

public class T011_Exceptions {
    public static void main(String[] args) {
        System.out.println("The Exception Part");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Numerator for division :  ");
//        int num1 = input.nextInt();
//        System.out.println("Enter the Dinominator for division :  ");
//        int num2 = input.nextInt();
//        try{
//            int result = num1/num2;
//            System.out.println("The result is "+result);
//        }
//        //System.out.println("Hi");
//        catch(ArithmeticException e)
//        {
//            System.out.println("Exception occured due to denominator is 0");
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.toString());
//        }
//try {
//    System.out.println("Enter the size of an array : ");
//    int size = input.nextInt();
//    int[] arr = new int[size];
//    System.out.println("Enter the element to add in the array :  ");
//    int data = input.nextInt();
//    System.out.println("Entre the index of an array : ");
//    int index = input.nextInt();
//    arr[index] = data;
//    System.out.println("Data added Successfully");
//}catch (NegativeArraySizeException e)
//{
//    System.out.println("The size of an array cannot be Negative");
//}catch (ArrayIndexOutOfBoundsException e)
//{
//    System.out.println("Add the data within the size of an array");
//}catch (Exception e)
//{
//    System.out.println("Exception occured in the T011_Exception class "+e.toString());
//}

        Demo demo = new Demo();
        demo.display();
       // demo.disp();

    }

}

class Demo{
    public void display()
    {
        System.out.println("Display method started");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numerator for divide : ");
        int numerator = input.nextInt();
        System.out.println("Enter the Denominator for divide : ");
        try {
            int denominator = input.nextInt();
            int result = numerator / denominator;
        System.out.println("The result is : "+result);
        }catch (Exception e)
        {
            System.out.println("The exception occured in the display method");
        }
        System.out.println("Display method is Ends");
    }

    public void disp(){
        display();
    }
}
