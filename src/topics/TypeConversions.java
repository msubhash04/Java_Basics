package topics;

public class TypeConversions {
    public static void main(String[] args) {
        //The type conversion are of two types  Widening and Narrowing
        // Widening :- Converting a smaller data type → larger data type
        //byte → short → int → long → float → double
        //Note:- Widening is implicitly done by java but not Narrowing.
        //Narrowing :- Converting a larger data type → smaller data type
        //double → float → long → int → short → byte

        int a = 10;
        double b = a;   // widening

        System.out.println(a); // 10
        System.out.println(b); // 10.0

        double c = 10.75;
        int d = (int) c;   // narrowing

        System.out.println(c); // 10.75
        System.out.println(d); // 10

    }
}
