package com.springmvc.models;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

//@DateTimeFormat - used to format date in veriuos way
public class Student {

    private long id;
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;

    private List<String> course;
    private String gender;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", course=" + course + ", gender=" + gender + ", type=" + type + '}';
    }
}
