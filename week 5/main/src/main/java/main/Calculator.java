package main;
import java.util.*;


public class Calculator {
    private double average;
    private double median;
    private ArrayList<Grades> grades = new ArrayList<>();



    public void getAverageGrade(Student s) {
        int addition = 0;
        int i = 0;
        grades = s.getGrades();
            for(Grades grade : grades){
                addition = addition + grade.getGrade();
                i++;
            }
        if (i != 0) {
            average = (double)addition/i;
        } else {
            average = 0.0;
        }
        System.out.println("Keskiarvo on " + average);
    }

    public void getMedianGrade(Student s) {
        int i = 0;
        grades = s.getGrades();
        ArrayList<Integer> gradesInteger = new ArrayList<>();
        for (Grades grade : grades){
            gradesInteger.add(grade.getGrade());
            i++;
        }
        Collections.sort(gradesInteger); //https://www.javatpoint.com/how-to-sort-arraylist-in-java


        if (i == 0){
            median = 0.0;

        } else if(i%2 == 0){
            int middle = i/2;
            double median1 = gradesInteger.get(middle);
            double median2 = gradesInteger.get(middle - 1);
            median = (median1 + median2)/2;

        } else if(i%2 != 0) {
            int middle = i/2;
            median = gradesInteger.get(middle);

        } System.out.println("Mediaani on " + median);
    }
}