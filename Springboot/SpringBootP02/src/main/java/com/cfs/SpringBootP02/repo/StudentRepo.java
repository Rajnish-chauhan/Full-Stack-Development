package com.cfs.SpringBootP02.repo;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

    public String getStudentData(){
        return "Hello Dear";
    }
}
