package topics;

public class TypeConversions {
    public static void main(String[] args) {
        //The type conversion are of two types  Widening and Narrowing
        // Widening :- Converting a smaller data type → larger data type
        //Note:- Widening is implicitly done by java but not Narrowing.
        //Narrowing :- Converting a larger data type → smaller data type

        int num1 = 100;

        long num2 = num1;
        System.out.println("Ex of Widening (Converted int To long)  "+num2);

        int num3 = (int) num2;
        System.out.println("Ex of Narrowing (Converted long To int)  "+num3);

    }
}
