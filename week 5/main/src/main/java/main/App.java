package main;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    Scanner sc = new Scanner(System.in);

    Student newStudent = null;
    University university = new University();
    Calculator calculator = new Calculator();

    boolean exit = false;
    while(!exit) {
        System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                    System.out.println("Anna opiskelijan nimi?");
                    String name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String IDstring = sc.nextLine();
                    int studentID = Integer.parseInt(IDstring);

                    newStudent = new Student(name, studentID);
                    university.addStudent(newStudent);
                    break;

                case 2:
                    university.listStudents();
                    break;

                case 3:
                    university.studentsByID();
                    System.out.println("Mille opiskelijalle suorite lisätään?");
                    String stringID1 = sc.nextLine();
                    int ID1 = Integer.parseInt(stringID1);
                    Student s1 = university.getStudentByID(ID1);
                    System.out.println("Mille kurssille suorite lisätään?");
                    String course = sc.nextLine();
                    System.out.println("Mikä arvosana kurssille lisätään?");
                    String intGrade = sc.nextLine();
                    int grade = Integer.parseInt(intGrade);

                    s1.addGrades(course, grade);
                    break;
                
                case 4:
                    university.studentsByID();
                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    String stringID2 = sc.nextLine();
                    int ID2 = Integer.parseInt(stringID2);
                    Student s2 = university.getStudentByID(ID2);
                    s2.listGrades();
                    break;

                case 5:
                    university.studentsByID();
                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    String stringID3 = sc.nextLine();
                    int ID3 = Integer.parseInt(stringID3);
                    Student s3 = university.getStudentByID(ID3);
                    calculator.getAverageGrade(s3);
                    break;

                case 6:
                    university.studentsByID();
                    System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                    String stringID4 = sc.nextLine();
                    int ID4 = Integer.parseInt(stringID4);
                    Student s4 = university.getStudentByID(ID4);
                    calculator.getMedianGrade(s4);
                    break;

                case 7:
                    university.saveStudents();
                    break;

                case 8:
                    university.loadStudents();
                    break;

                case 0:
                    System.out.println("kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                default:
                System.out.println("Syöte oli väärä");
                break;

            }
        }
    }   sc.close();
}
}