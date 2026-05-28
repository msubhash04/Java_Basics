package challenges;

abstract class Car{
    abstract public void sideMirror();
    public abstract void airBags();
    public abstract void frontGlassWipers();
}

class Ford extends Car{
    @Override
    public void sideMirror() {
        System.out.println(" Ford sidemirrors Opens Very smoothly ");
    }

    @Override
    public void airBags() {
        System.out.println(" Ford Air Bags opens whithin miliseconds Cofirmed in crash testing ");
    }

    @Override
    public void frontGlassWipers() {
        System.out.println(" Ford Front Glass wipers are same as in previous model ");
    }
}

class MercedesBenz extends Car{
    @Override
    public void sideMirror() {
        System.out.println(" MercedesBenz side mirrors are better then all the cars");
    }
    @Override
    public void airBags() {
        System.out.println(" MercedesBenz air bags safety is absolute ");
    }
    @Override
    public void frontGlassWipers() {
        System.out.println(" MercedesBenz front glass wipers are also fantastic ");
    }
}

class CarFunctions{
    public void carFunctionality(Car car)
    {
        car.sideMirror();
        car.airBags();
        car.frontGlassWipers();
    }
}

public class T003_AbstractClassOrMethod {
    static public void main(String[] args) {
        Ford ford = new Ford();
        MercedesBenz benz = new MercedesBenz();
//        ford.airBags();
//        ford.frontGlassWipers();
//        ford.sideMirror();

        CarFunctions cf = new CarFunctions();
        cf.carFunctionality(ford);
        System.out.println("=================================================");
        cf.carFunctionality(benz);
    }
}
