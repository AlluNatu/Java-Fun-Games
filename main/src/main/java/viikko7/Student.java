package viikko7;

import java.io.Serializable;

public class Student implements Serializable, PrintInfo{
    private String name;
    private String id;


    public Student (String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getInformation(){
        return this.id + " " + this.name;
    }
}
