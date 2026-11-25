package threads;

public class Program03 {
    public static void main(String[] args) {
        //If the programmer don't want to override the run() then don't go for the threads concept.
        //Because if the programmer didn't override then also the default run() function will be executed which has no implementation.
        //Note:- Here i am telling that even run() is not override then also program executes smoothly won't get any exception or error.
        MyThread03 t = new MyThread03();
        t.start();
        System.out.println("Main Method.");
    }
}

class MyThread03 extends Thread{
}
