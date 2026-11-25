package threads;

public class Program05 {
    public static void main(String[] args) {
        //It's not recomended to override the start().
        //Because the start() is responsible for the allocating the TS(Thread Schedular) or CPU allocation, Also internally calls the run().
        //If we override the start() then controller will be consider the start() method as the normal function and the new thread won't create.
        MyThread05 t = new MyThread05();
        t.start();          //Observe the output the run() won't get executed bcs the thread itself not created.
        /* ....Console OUTPUT....
            Start method of the thread ! Overridden
            Main method.
         */
        System.out.println("Main method.");
    }
}

class MyThread05 extends Thread{
    public void start(){
        System.out.println("Start method of the thread ! Overridden");
    }
    public void run(){
        System.out.println("Run method of the thread.");
    }
}
