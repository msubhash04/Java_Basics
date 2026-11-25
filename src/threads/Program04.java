package threads;

public class Program04 {
    public static void main(String[] args) {
        //The run() overloading concept.
        //Here even the run() is overloaded the thread will call the no argument run() only if we want to
        // call the argumented run(int i) then it will be called as normal function.
        MyThread04 t = new MyThread04();
        t.start();
        System.out.println("Main Method.");

    }
}

class MyThread04 extends Thread{
    public void run(){
        System.out.println("No argumented run method.");
    }

    public void run(int i){
        System.out.println("Argumented run method.");
    }
}
