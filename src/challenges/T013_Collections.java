package challenges;

import java.util.ArrayList;

public class T013_Collections {
    /**
     * Collections
     * 1. List, 2. ArrayList  and 3. LinkedList
     * 4. Dequeue, 5. PriorityQueue
     * 6. HashTree
     * 7. HashSet, 8. LinkedHashSet
     */

    public static void main(String[] args) {
//        ArrayList  ls  = new ArrayList();
//        ls.add(100);
//        ls.add(20);
//        ls.add(50);
//        ls.add(150);
//        ls.add(30);
//        ls.add(180);
//        ls.add(180);
//        ls.add(null);
//        ls.add("ABC");
//
//        System.out.println(ls);
//
//        System.out.println(ls.getFirst());
//        System.out.println(ls.getLast());
//        System.out.println(ls.contains(150));
//        System.out.println(ls.set(1,120));
//        System.out.println(ls);

        Animal01 t=new Tiger();
        t.animalHuntsAndEats();


    }

//    public static void main(String[] args)
//    {
//        ArrayList aList=new ArrayList();
//
//        aList.add(44);
//        aList.add("Harsh");
//        aList.add(454.4);
//        aList.add(true);
//
//        System.out.println(aList);
//        aList.add(5);
//
//        System.out.println(aList);
//        System.out.println("************************************");
//        ArrayList aList2=new ArrayList();
//
//        aList2.add(44);
//        aList2.add(454);
//        aList2.add(454.4);
//        aList2.add(65);
//        aList2.add(65);
//        System.out.println(aList2);
//
//        aList2.addAll(aList);
//        System.out.println(aList2);
//
//        aList2.add(2, "Siddhu");
//        System.out.println(aList2);
//
//
//        aList2.add(null);
//        System.out.println(aList2);
//    }

}

class Animal01
{
    //this method
    public void animalHuntsAndEats()
    {
        System.out.println("Animal is eating ........");
    }
}
//@Override
class Tiger extends Animal01
{
    @Override
    public void animalHuntsAndEats()
    {
        System.out.println("Tiger hunts and eat....");
    }
}
