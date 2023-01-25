package com.google.dev.schoolapp.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "School_1")
public class School {

    public School(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public School() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sch_id")
    private long id;

    @Column(name = "sch_name", length = 225, nullable = false)
    private String name;

    @Column(name = "sch_address", length = 225, nullable = false)
    private String address;

    @Column(name = "sch_loca", length = 225, nullable = false)
    private String location;

    @OneToMany(mappedBy = "school")
    private Set<Student> students;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
