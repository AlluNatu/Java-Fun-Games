package viikko7;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tervetuloa Gifu-järjestelmään");
        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String name = sc.nextLine();
        Gifu gifu = new Gifu(name);
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                    System.out.println("Anna kurssin nimi:");
                    String courseName = sc.nextLine();
                    System.out.println("Anna kurssin ID:");
                    String courseID = sc.nextLine();
                    System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                    String maxstudentsString = sc.nextLine();
                    int maxStudentsint = Integer.parseInt(maxstudentsString);
                    Course newCourse = new Course(courseName, courseID, maxStudentsint);
                    gifu.addCourse(newCourse);
                        break;

                    case 2:
                        System.out.println("Anna opiskelijan nimi:");
                        String studentName = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String studentID = sc.nextLine();
                        Student newStudent = new Student(studentName ,studentID);
                        gifu.addStudent(newStudent);
                        break;
                    case 3:
                        gifu.listCourses();
                        break;
                    case 4:
                        gifu.listStudents();
                        break;
                    case 5:
                        gifu.listCourses();
                        System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                        String courseNumber = sc.nextLine();
                        int courseNumberInt = Integer.parseInt(courseNumber);
                        Course C1 = gifu.getCourse(courseNumberInt);
                        gifu.listStudents();
                        System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                        String studentNumber = sc.nextLine();
                        int studentNumberInt = Integer.parseInt(studentNumber);
                        Student s1 = gifu.getStudent(studentNumberInt);
                        gifu.enrollStudent(s1, C1);
                        break;
                    case 6:
                        ArrayList<Enrollment> specificEnrollments = new ArrayList<>();
                        gifu.listCourses();
                        System.out.println("Minkä kurssin haluat arvostella? Syötä kurssin numero:");
                        String coursegradeNumber = sc.nextLine();
                        int coursegradeNumberInt = Integer.parseInt(coursegradeNumber);
                        Course C2 = gifu.getCourse(coursegradeNumberInt);
                        specificEnrollments = gifu.getEnrollments(C2);
                        for (Enrollment enrollment : specificEnrollments){
                            Student S2 = enrollment.getStudent();
                            System.out.println("Anna arvosana opiskelijalle " + S2.getInformation());
                            String givenGrade = sc.nextLine();
                            int givenGradeInt = Integer.parseInt(givenGrade);
                            enrollment.gradeCourse(givenGradeInt);
                        }
                        break;
                    case 7:
                        ArrayList<Enrollment> specificEnrollments2 = new ArrayList<>();
                        gifu.listCourses();
                        System.out.println("Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:");
                        String listStudents = sc.nextLine();
                        int listStudentsInt = Integer.parseInt(listStudents);
                        Course C3 = gifu.getCourse(listStudentsInt);
                        specificEnrollments2 = gifu.getEnrollments(C3);
                        for (Enrollment enrollment : specificEnrollments2){
                            Student S3 = enrollment.getStudent();
                            System.out.println("Opiskelijan " + S3.getInformation() + ", arvosana: " + enrollment.getGrade());
                        }
                        break;
                    case 8:
                        ArrayList<Enrollment> specificStudentEnrollments = new ArrayList<>();
                        gifu.listStudents();
                        System.out.println("Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:");
                        String studentNumber2 = sc.nextLine();
                        int studentNumberInt2 = Integer.parseInt(studentNumber2);
                        Student specificStudent = gifu.getStudent(studentNumberInt2);
                        System.out.println("Opiskelijan " + specificStudent.getInformation() + " arvosanat:");
                        specificStudentEnrollments = gifu.getEnrollments(specificStudent);
                        for (Enrollment enrollment : specificStudentEnrollments){
                            Course studentCourse = enrollment.getCourse();
                            System.out.println(studentCourse.getInformation() + ", arvosana: " + enrollment.getGrade());
                        }
                        break;
                    case 9:
                        ArrayList<Course> courseGrades = new ArrayList<>();
                        courseGrades = gifu.getCourses();
                        for (Course course : courseGrades){
                            System.out.println(course.getInformation());
                            ArrayList<Enrollment> courseEnrollments = new ArrayList<>();
                            courseEnrollments = gifu.getEnrollments(course);
                            for (Enrollment enrollment : courseEnrollments){
                                Student S5 = enrollment.getStudent();
                                System.out.println(S5.getInformation() + ", arvosana: " + enrollment.getGrade());
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        } 
        sc.close();
    }

}