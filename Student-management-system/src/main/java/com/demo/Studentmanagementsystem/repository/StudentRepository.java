package com.demo.Studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
