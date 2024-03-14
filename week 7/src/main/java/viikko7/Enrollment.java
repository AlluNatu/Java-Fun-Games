package viikko7;

public class Enrollment {
    private int grade;
    private Student student;
    private Course course;

    public Enrollment(int grade, Student student, Course course){
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

    public void gradeCourse(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }
}
