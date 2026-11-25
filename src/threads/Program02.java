package threads;

public class Program02 {
    public static void main(String[] args) {
        //The difference between the t.start() and t.run().
        /*
        When ever the programer uses t.start() a new thread will be created and run the run() internally by the created thread.
        When ever the programer uses t.run() wont create ant new thread instead it will execute as the normal method.
         */
        System.out.println(Thread.currentThread().getName());
        MyThread02 t = new MyThread02();
//        t.start();
        /*
                    main
                    Main Method
                    main
                    MyThread02
                    Run method of the thread.
         */
        t.run();
        /*
                main
                main
                Run method of the thread.
                Main Method
                main
         */
        System.out.println("Main Method");
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread02 extends Thread{
    public void run(){
        //Thread.currentThread().setName("MyThread02");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Run method of the thread.");
    }
}
