package challenges;

import java.util.Scanner;

public class C020_PersonAgeGroup {
    public static void main(String[] args) {
        //Write a JAVA program to categorize the persons into the different age groups...

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of the Person : ");
        int age = input.nextInt();
        String ageGrup = differentAgeGroup(age);
        System.out.println("The person belongs to the "+ageGrup+" category");

    }

    public static String differentAgeGroup(int age)
    {
        String ageGrup="";
       if(age <= 18)
           ageGrup = "Young";
       else if(age>18 && age<50)
           ageGrup = "Adult";
       else
           ageGrup = "Old";
        return ageGrup;
    }
}
