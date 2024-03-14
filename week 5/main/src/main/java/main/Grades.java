package main;

import java.io.Serializable;

public class Grades implements Serializable{
    private String course;
    private int grade;



    public Grades(String course, int grade){
        this.course = course;
        this.grade = grade;
    }

    public void printGrade(){
        System.out.println(course + ": " + grade);
    }

    public int getGrade(){
        return grade;
    }
}

