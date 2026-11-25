package threads;

public class Program01 {
    public static void main(String[] args) {
        //In this example we will see the thread execution.
        //The execution of the thread is not line by line here in the Thread Schedular if any thread is running then all other threads will be in queue if some bit of time
        //if waiting thread gets the CPU then it will execute simultaneously all the threads are in the running state only but the thing is the cpu allocation part to complete the process.
        MyThread01 t = new MyThread01();
        t.start();
        for(int i=1; i<=5; i++) {
            System.out.println("Main Method");
        }

    }
}

class MyThread01 extends Thread{
    public void run(){
        System.out.println("Run Method of thread.");
        for(int i=1; i<=10; i++)
        {
            System.out.println("Child Method.");
        }
    }
}
