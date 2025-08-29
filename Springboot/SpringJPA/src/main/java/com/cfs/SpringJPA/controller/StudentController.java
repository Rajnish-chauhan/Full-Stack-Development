package com.cfs.SpringJPA.controller;

import com.cfs.SpringJPA.entity.Student;
import com.cfs.SpringJPA.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }


    @GetMapping
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id, @RequestBody Student student) {
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Not Found"));
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return studentRepo.save(s);
}
        @PatchMapping
        public Student patchStudent (@RequestParam Long id, @RequestParam String name){
            Student s = studentRepo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Student Not found"));
            s.setName(name);
            return s;

        }
}
