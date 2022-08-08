package com.student.project.service;

import java.util.List;

import com.student.project.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);

}
