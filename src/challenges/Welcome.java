package challenges;

import java.util.Scanner;

class Parent{
    int x=5;
    public static void addStatic()
    {
        System.out.println("Parent class static addStatic()");
    }

    public void add(){
        System.out.println("Parent Class  method");
    }
}

class Child extends Parent{
    int x=10;
    public static void addStatic(){
        System.out.println("Child static method");
    }

    public void add(){
        System.out.println("child Class  method");
    }
}

public class Welcome {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your Name : ");
//        String name = input.nextLine();
//        System.out.println("Welcome "+name+" to Xiota PVT Ltd.");
        
        Parent p = new Child();
        p.add();
        p.addStatic();
        System.out.println(p.x);
    }
}
