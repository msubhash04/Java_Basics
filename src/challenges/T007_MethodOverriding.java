package challenges;

class ParentMarry{
    //Overridden method
    public void marry()
    {
        System.out.println("Normal girl who is selected by parents");
    }
}

class ChildMarry extends ParentMarry{
    //Overridding method
    public void marry()
    {
        System.out.println("Extra ordinary girl who looks good, my self i will select");
    }
}

public class T007_MethodOverriding {
    public static void main(String[] args) {
       ParentMarry p1 = new ParentMarry();
       p1.marry();

       ChildMarry c1 = new ChildMarry();
       c1.marry();

       ParentMarry p2 = new ChildMarry();   //Method hiding concept  when the methods are static in parent
       p2.marry();

    }
}
