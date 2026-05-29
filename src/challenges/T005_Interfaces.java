package challenges;

interface ICar{
    void numberOfGers();
    void numberOfSeats();
    void colorOfCar();
    void engineType();
}

class Mercedes implements ICar{

    @Override
    public void numberOfGers() {
        System.out.println("The Mercedes has 5 gers");
    }

    @Override
    public void numberOfSeats() {
        System.out.println("4 seater cars");
    }

    @Override
    public void colorOfCar() {
        System.out.println("Blue color");
    }

    @Override
    public void engineType() {
        System.out.println("Petrol Enginee");
    }
}

class Skoda implements ICar{

    @Override
    public void numberOfGers() {
        System.out.println("The Skoda has 5 gears");
    }

    @Override
    public void numberOfSeats() {
        System.out.println("7 Seater");
    }

    @Override
    public void colorOfCar() {
        System.out.println("White Color");
    }

    @Override
    public void engineType() {
        System.out.println("Diesel Engine");
    }
}

class Mahindra implements ICar{

    @Override
    public void numberOfGers() {
        System.out.println("No gears Automatic");
    }

    @Override
    public void numberOfSeats() {
        System.out.println("7 Seater");
    }

    @Override
    public void colorOfCar() {
        System.out.println("RED color");
    }

    @Override
    public void engineType() {
        System.out.println("Electric Enginee");
    }
}

class Shoroom{
    public void models(ICar icar)
    {
        icar.numberOfGers();
        icar.numberOfSeats();
        icar.colorOfCar();
        icar.engineType();
    }
}

public class T005_Interfaces {

    public static void main(String[] args) {
        Mercedes i1 = new Mercedes();
        ICar i2 = new Skoda();

        Shoroom s1 = new Shoroom();
        s1.models(i1);
        System.out.println("===========================================");
        s1.models(i2);
        System.out.println("===========================================");
        s1.models(new Mahindra());
    }
}
