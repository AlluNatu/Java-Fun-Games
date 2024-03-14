package main;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

public class University implements Serializable{
    final private String FILENAME;
    private ArrayList<Student> students = new ArrayList<>();

    public University(){
        FILENAME = "students.data";
    }


    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public void listStudents(){
        System.out.println("Opiskelijat:");
        for (Student newStudent : students){
            newStudent.printStudent();
        }
    }

    public void studentsByID(){
            int i = 0;
            for (Student newStudent : students){
                System.out.println(i + ": " + newStudent.getName());     
                i++;           
        }
    }

    public Student getStudentByID(int id){
        return students.get(id);
    }

    public void saveStudents(){
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            e.printStackTrace();
        }
    }

    public void loadStudents(){
        try{
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }

}
