package challenges;

import java.util.*;

public class T014_PassportExample {
    public static void main(String[] args) {
        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(102);
        Integer id3 = Integer.valueOf(103);
        Integer id4 = Integer.valueOf(104);

        Passport pass1 = new Passport("Raghu","04-08-2002",24,"Mantralayam");
        Passport pass2 = new Passport("Suni","01-05-2004",23,"Kadapa");
        Passport pass3 = new Passport("Subhash","04-08-2001",25,"Zaheerabad");
        Passport pass4 = new Passport("Tarun","01-03-2000",26,"Chennai");

        HashMap<Integer, Passport> pssHm = new HashMap<>();
        pssHm.put(id1,pass1);
        pssHm.put(id2,pass2);
        pssHm.put(id3,pass3);
        pssHm.put(id4,pass4);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the passport number :  ");
        Integer id = input.nextInt();
        boolean isFound = false;
        Set<Map.Entry<Integer, Passport>> entry = pssHm.entrySet();
        Iterator<Map.Entry<Integer, Passport>> itr = entry.iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, Passport> itrData = itr.next();
            Integer key = itrData.getKey();
            if(key.equals(id)){
                Passport result = itrData.getValue();
                System.out.println("The passport details are as follows \n"+result);
                isFound = true;
            }

        }
        if(!isFound)
            System.out.println("Passport details are Not present ! Please enter the correct passport number...");


    }
}

class Passport{
    private String name;
    private String DOB;
    private int age;
    private String city;

    public Passport(String name, String DOB, int age, String city) {
        this.name = name;
        this.DOB = DOB;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
