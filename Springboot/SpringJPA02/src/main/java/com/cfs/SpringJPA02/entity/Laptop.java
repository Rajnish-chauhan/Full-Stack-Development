package com.cfs.SpringJPA02.entity;


import jakarta.persistence.*;

@Entity
public class Laptop {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String brand;

    @OneToOne
    @JoinColumn(name = "student_id",unique = true)
    private Student student;
}
