package com.cfs.SpringJPA.repo;

import com.cfs.SpringJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {


}
