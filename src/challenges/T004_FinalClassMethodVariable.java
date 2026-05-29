package challenges;

final class FinalExample{
//class FinalExample{

     final static int dbYear = 2000;

    public static final void test()
    {
        System.out.println("The person who is born in the year of "+dbYear+" they all are belongs to 20th century");
    }

    public void test1()
    {
        System.out.println("The person who is born in the year of "+dbYear+" they all are belongs to 20th century");
    }
}

//class FinalExample2 extends FinalExample{    //final class cannot be extends
class FinalExample2 {
    //FinalExample.dbYear = 2001;  //Final variables cannot be overridden

    public static final void test()
    {
        System.out.println("Final methods cannot be overridden");     //Final methods cannot be overridden in the child class
    }

    public void test1()
    {
        System.out.println("The person who is born in the year of "+FinalExample.dbYear+" these are belongs to 21th centuary");
    }
}

public class T004_FinalClassMethodVariable {
    public static void main(String[] args) {

        FinalExample2 fe = new FinalExample2();
        fe.test();   //2001
    }
}
