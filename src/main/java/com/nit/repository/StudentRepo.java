package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
