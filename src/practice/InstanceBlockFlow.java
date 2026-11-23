package practice;

//Child Class
public class InstanceBlockFlow extends Parent{
    int i=100;
    {
        methodTwo();
        System.out.println("First Instance block of Child class...");
    }
    public InstanceBlockFlow() {
        System.out.println("Child class constructor...");
    }

    public void methodTwo(){
        System.out.println("Child class function..."+j);
    }

    {
        System.out.println("Second Instance block of Parent class...");
    }
    int j=200;

    public static void main(String[] args) {
        InstanceBlockFlow child = new InstanceBlockFlow();
        System.out.println("The main method of the child class...");
        System.out.println("j : "+child.j+"  y : "+child.y);
    }

}

//Parent Class
class Parent{
    int x = 10;
    {
        methodOne();
        System.out.println("First Instance block of Parent class...");
    }

    public Parent() {
        System.out.println("Parent class constructor...");
    }

    public void methodOne(){
        System.out.println("Parent class function..."+y);
    }
    {
        System.out.println("Second Instance block of Parent class...");
    }
    int y=20;

}
