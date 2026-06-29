package challenges;

import java.util.Scanner;

class UserNotFoundException extends Exception{
    public UserNotFoundException(String msg)
    {
        super(msg);
    }
}

class Atm{
    int userName = 1111;
    int userPass = 2222;

    int user;
    int password;

    public void initiate()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the userName : ");
        user = input.nextInt();
        System.out.println("Enter the Password : ");
        password = input.nextInt();
    }

    public void verify() throws UserNotFoundException
    {
        if (user == userName  && userPass == password)
        {
            System.out.println("User Credentials are matching. Now you can move for Credit or Debit Money");
        }else {
            //System.out.println("User Credentials are Not matched. Please enter the correct User credentials...");
            UserNotFoundException userNotFoundException = new UserNotFoundException("User Credentials are Not matched. Please enter the correct User credentials...");
            System.out.println(userNotFoundException.getMessage());
            throw userNotFoundException;
        }
    }
}

class Bank{
    public void canaraBank()
    {
        Atm atm = new Atm();
       try{
            atm.initiate();
            atm.verify();
       }catch (UserNotFoundException e1)
       {
           try{
               atm.initiate();
               atm.verify();
           }catch(UserNotFoundException e2)
           {
               try {
                   atm.initiate();
                   atm.verify();
               } catch (UserNotFoundException e3)
               {
                   System.out.println("You are card is blocked for next 24 hours");
               }
           }
       }

    }
}

public class T012_CustomException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.canaraBank();
    }
}
