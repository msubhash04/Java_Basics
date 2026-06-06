package challenges;

public class T001_StaticAndNonStaticExamples {
    public static void main(String[] args) {
        System.out.println(" Main Method ");
//        Alpha.staticFunction();
        Alpha a1 = new Alpha();
//        a1.nonStaticFunction();
    }
}

class Alpha{
    static int num1;
    int num2;
    int a;
    static{
        System.out.println(" Static Block "+num1);
    }
    {
        System.out.println(a+" Non Static Block "+num2);
    }

    Alpha(){
        num1 = 5;
        System.out.println(" Zero parameterized Constructor ");
    }

    Alpha(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void staticFunction()
    {
        System.out.println(" Static Method ");
    }

    void nonStaticFunction()
    {
        System.out.println(" Non Static Method "+a);
    }

}
