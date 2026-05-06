package challenges;

import java.util.Scanner;

public class C034_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Prime number program");
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
        if(number>1)
        {
            boolean prime = primeNumber.prime(number);
            if(prime)
                System.out.println("The "+number+" is Prime number");
            else
                System.out.println("The "+number+" is not a Prime number");
        }else{
            System.out.println("The entered number is 0 or -ve number so, please enter the correct number");
        }
        input.close();
    }
}

class PrimeNumber{
    public boolean prime(int number)
    {
        int i=2;
        while(i < number)
        {
            if(number%i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
