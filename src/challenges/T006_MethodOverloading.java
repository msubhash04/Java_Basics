package challenges;

public class T006_MethodOverloading {
    /**Note :
     * 1.While resolving overloaded methods exact match will always get high priority.
     * 2.While resolving overloaded methods child class will get the more priority than parent class.
     */

//    public void methodOne(int i)
//    {
//        System.out.println("Int method overloading  "+i);
//    }
////    public void methodOne(float f)
////    {
////        System.out.println("Float method overloading");
////    }
//
//    public void methodOne(double d)
//    {
//        System.out.println("Double method overloading");
//    }

//    public void methodOne(String s)
//    {
//        System.out.println("String Version");
//    }
//    public void methodOne(Object o)
//    {
//        System.out.println("Object Version");
//    }
//    public void methodOne(StringBuffer stringBuffer)
//    {
//        System.out.println("String Buffer Version");
//    }

    /**
     * In general var-arg method will get less priority that is if no other method matched then
     * only var-arg method will get chance for execution it is almost same as default case inside
     * switch.
     */
//    public void methodOne(int i)
//    {
//        System.out.println("General Method  "+i);
//    }
//
//    public void methodOne(int...i)
//    {
//        System.out.println("Var-args Method");
//    }

    /**
     * In overloading method resolution is always based on reference type and runtime object
     * won't play any role in overloading.
     */

    public static void main(String[] args) {

        T006_MethodOverloading t1 = new T006_MethodOverloading();
//        t1.methodOne(10);
//        t1.methodOne(5.4f);
//        t1.methodOne('A');

//        t1.methodOne("QPS");
//        t1.methodOne(new T006_MethodOverloading());
//        t1.methodOne(null);
//        t1.methodOne(new StringBuffer("KARNA"));

//        t1.methodOne(10);
//        t1.methodOne();
//        t1.methodOne(10,20);
//        t1.methodOne('B');  //66
//        t1.methodOne(null);
//        t1.methodOne(14,1,67);


        Animal a1 = new Animal();
        t1.methodOne(a1);

        Monkey m1 = new Monkey();
        t1.methodOne(m1);

        Animal animal = new Monkey();
        t1.methodOne(animal);
    }

    public void methodOne(Animal animal)
    {
        System.out.println("Animal method");
    }
    public void methodOne(Monkey monkey)
    {
        System.out.println("Monkey method");
    }
}

class Animal{}

class Monkey extends Animal{}