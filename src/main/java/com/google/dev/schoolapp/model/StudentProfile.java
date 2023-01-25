package com.google.dev.schoolapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_profile")
public class StudentProfile {


    public StudentProfile(long id, String origin, String religion, String hobby) {
        this.id = id;
        this.origin = origin;
        this.religion = religion;
        this.hobby = hobby;
    }

    public StudentProfile() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prof_id")
    private long id;

    @Column(name = "prof_origin")
    private String origin;

    @Column(name = "prof_religion")
    private String religion;

    @Column(name = "prof_hobby")
    private String hobby;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
