package viikko7;

import java.util.ArrayList;

public class Gifu {
    private String university;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();


    public Gifu(String university){
        this.university = university;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public void listCourses(){
        int i = 0;
        for (Course Course : courses){
            System.out.println(i + ") " + Course.getInformation());
            i++;
        }
    
    }

    public void listStudents(){
        int i = 0;
        for (Student Student : students){
            System.out.println(i + ") " + Student.getInformation());
            i++;
        }
    }
    public Course getCourse (int number){
        return courses.get(number);
    }

    public Student getStudent (int number){
        return students.get(number);
    }

    public void enrollStudent(Student student, Course course){
        Enrollment newEnrollment = new Enrollment((-1), student, course);
        enrollments.add(newEnrollment);

    }
    public ArrayList<Enrollment> getEnrollments(Course course){
        ArrayList<Enrollment> courseEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments){
            if (enrollment.getCourse() == course){
                courseEnrollments.add(enrollment);
            }
        }
        return courseEnrollments;
    }

    public ArrayList<Enrollment> getEnrollments(Student student){
        ArrayList<Enrollment> studentEnrollments = new ArrayList<>();
        for (Enrollment enrollment : enrollments){
            if (enrollment.getStudent() == student){
                studentEnrollments.add(enrollment);
            }
        }
        return studentEnrollments;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }
}
