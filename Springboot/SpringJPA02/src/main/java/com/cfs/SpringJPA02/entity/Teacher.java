package com.cfs.SpringJPA02.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String name;

    @OneToMany(mappedBy="teacher")
    private List<Student> studentList=new ArrayList<>();

}

