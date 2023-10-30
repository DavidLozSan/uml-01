package school;

import java.util.ArrayList;

public class Courses {
    private Integer code;
    private String name;

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }

    private ArrayList<Subjects> subjects;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
