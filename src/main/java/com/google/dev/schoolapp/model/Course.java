package com.google.dev.schoolapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    public Course(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Course() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String title;

    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany
    @JoinTable(
            name = "Student_course",
            joinColumns = @JoinColumn(name ="Course_Student_Id"),
            inverseJoinColumns = @JoinColumn(name = "Student_course_id")
    )
    private List<Student> students;
}
