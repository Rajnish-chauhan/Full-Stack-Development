package com.cfs.SpringBootP02.controller;

import com.cfs.SpringBootP02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/welcome")
    public String getDataFromDb()
    {
        return service.getStudentData();
    }
}
