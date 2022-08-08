package com.student.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
