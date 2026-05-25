package challenges;

class AlphaInheritance {
    static int age;
    int id;



    AlphaInheritance()
    {
        this(5);
        System.out.println("Constructor of parent class");
    }

    AlphaInheritance(int a)
    {
//        this();
        System.out.println("Constructor of parent class");
    }

    public static void test()
    {
        System.out.println("--- Parent static test method ---");
    }

    public void test1()
    {
        System.out.println("--- Parent Non static test method ---");
    }
}

class BetaInheritance extends AlphaInheritance{
    static int age = 10;

    BetaInheritance()
    {
        System.out.println("Constructor of the Child class");
    }

    public static void test()
    {
        System.out.println("--- child static test method ---");
    }

    public void test1()
    {
        System.out.println("--- child Non static test method ---");
    }
}

class Aeroplane{
    public void fly()
    {
        System.out.println("Aeroplane can fly");
    }

    public void takeOff()
    {
        System.out.println("Aeroplane can take off on the runway");
    }
}

class Cargoplane extends Aeroplane{
    public void fly()
    {
        System.out.println("Cargoplane can fly at lower height");
    }
    public void takeOff()
    {
        System.out.println("Cargoplane will take off on long runway");
    }
}

class Passengerplane extends Aeroplane{
    public void fly()
    {
        System.out.println("Passenger plane can fly on the medium height");
    }
    public void takeOff()
    {
        System.out.println("Passenger plane can take off on medium or long runway");
    }
}

class Fighterplane extends Aeroplane{
    public void fly()
    {
        System.out.println("Fighter Plane can fly on the heigher height");
    }
    public void takeOff()
    {
        System.out.println("Fighter Plane can take off on very shorter runway");
    }
}


class Airport{
    public void test(Aeroplane aeroplane)
    {
        aeroplane.fly();
        aeroplane.takeOff();
    }
}


public class T002_Inheritance {
    public static void main(String[] args) {
//        BetaInheritance b1 = new BetaInheritance();
//        System.out.println("--------  "+b1.age);
//        b1.test();
//        b1.test1();
//        AlphaInheritance alpha = new BetaInheritance();
//        System.out.println("-----------  "+alpha.age);
//        alpha.test();
//        alpha.test1();

        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        Fighterplane fp = new Fighterplane();
//        cp.fly();
//        cp.takeOff();
//        pp.fly();
//        pp.takeOff();
//        fp.fly();
//        fp.takeOff();

        Airport a1 = new Airport();
        a1.test(cp);
        a1.test(pp);
        a1.test(fp);

    }
}
