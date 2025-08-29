package com.cfs.SpringJPA02.repo;

import com.cfs.SpringJPA02.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Laptoprepo extends JpaRepository<Laptop,Long> {
}
