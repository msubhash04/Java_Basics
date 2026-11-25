package practice;

public class StaticAndNonStaticPractice {
    static int i=10;
    static{
        methodOne();
        System.out.println("Static block");
    }
    {
        System.out.println("Non Static block");
    }

    public static void main(String[] args) {
//        System.out.println("Main block i calling  "+StaticAndNonStaticPractice.i);
        System.out.println("Main block");
        StaticAndNonStaticPractice st = new StaticAndNonStaticPractice();
        System.out.println("Main block");

    }

    public static void methodOne(){
        System.out.println("Method One block.");
    }
}
