package com.google.dev.schoolapp.model;


import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
public class Student {


    public Student(long id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Student() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String lastName;

    private int age;

    @ManyToOne
    @JoinColumn(name = "std_sch_id")
    private School school;

    @OneToOne
    @JoinColumn(name="std_prof")
    private StudentProfile profile;

    @ManyToMany
    @JoinTable(
            name = "Student_course",
            joinColumns = @JoinColumn(name ="Student_course_id"),
            inverseJoinColumns = @JoinColumn(name = "Course_Student_Id")
    )
    private List<Course> courses;


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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
