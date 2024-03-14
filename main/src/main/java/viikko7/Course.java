package viikko7;

import java.io.Serializable;

public class Course implements Serializable, PrintInfo{
    private int MaxNumberOfStudents;
    private String name;
    private String id;


    public Course (String name, String id, int MaxNumberOfStudents){
        this.MaxNumberOfStudents = MaxNumberOfStudents;
        this.name = name;
        this.id = id;
    }

    public String getInformation(){
        return this.id + " " + this.name;
    }
}
