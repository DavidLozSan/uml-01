package school;

import java.util.ArrayList;

public class Enrolment {
    private Integer code;
    private String startYear;
    private String finalYear;

    public void setStudents(Students students) {
        this.students = students;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public void setSubjects(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }

    private Students students;

    public Students getStudents() {
        return students;
    }

    public Courses getCourses() {
        return courses;
    }

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    private Courses courses;
    private ArrayList<Subjects> subjects;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getStartYear() {
        return startYear;
    }
    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }
    public String getFinalYear() {
        return finalYear;
    }
    public void setFinalYear(String finalYear) {
        this.finalYear = finalYear;
    }

}
