package com.cfs.SpringJPA02.repo;

import com.cfs.SpringJPA02.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
