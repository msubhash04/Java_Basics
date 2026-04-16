package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C019_GradeCalculate {
    public static void main(String[] args) {
        //Write a JAVA program to calculate the grades based on the marks...

        Scanner input = new Scanner(System.in);
        System.out.println("WelCome to Grade calculator");
        System.out.print("Enter the Number of subjects");
        int numberOfSub = input.nextInt();
        input.nextLine();
        double gradePercentage = gradeCalculate(numberOfSub);

        if (gradePercentage >= 90) {
            System.out.println("Grade: A");
        } else if (gradePercentage >= 80) {
            System.out.println("Grade: B");
        } else if (gradePercentage >= 70) {
            System.out.println("Grade: C");
        } else if (gradePercentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }

    public static double gradeCalculate(int numberOfSubjects)
    {
        HashMap<String,Double> subjectDtls = new HashMap<>();
        Scanner input = new Scanner(System.in);
        for(int i=0; i<=numberOfSubjects-1; i++)
        {
            System.out.print("Enter the name of subject "+(i+1) +": ");
            String subjectName = input.nextLine();
            System.out.print("Enter the Marks : ");
            double marks = input.nextDouble();
            input.nextLine();
            subjectDtls.put(subjectName.trim(),marks);
        }
        double total = 0;
        System.out.println("Total Subjects With Its Marks");
        for(Map.Entry<String,Double> entry : subjectDtls.entrySet())
        {
            total += entry.getValue();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        return (total/numberOfSubjects);
    }

}
