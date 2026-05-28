package topics;

public class Test {
    public void methodOne(int i)
    {
        System.out.println("Integer argumented method");
    }

//    public void methodOne(float f)
//    {
//        System.out.println("Floating point argumented method");
//    }

    public void methodOne(double d)
    {
        System.out.println("Double argumented method");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.methodOne('a');
//        t1.methodOne(10);
        t1.methodOne(10.2f);
    }
}
