package main;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable{
    private String name;
    private int studentID;
    private ArrayList<Grades> grades = new ArrayList<>();

    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }

    public void printStudent(){
        System.out.println(studentID + ": " + name);
    }

    public void addGrades(String course, int grade){
        grades.add(new Grades(course, grade));
    }

    public String getName(){
        return name;
    }


    public void listGrades(){
        for (Grades newGrade : grades){
            newGrade.printGrade();
        }
    }
    public ArrayList<Grades> getGrades(){
        return grades;
    }

}
