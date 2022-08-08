package com.student.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.student.project.entity.Student;
import com.student.project.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentrepo;
	
	

	public StudentServiceImpl(StudentRepo studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}



	@Override
	public List<Student> getAllStudent() {
		return studentrepo.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentrepo.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentrepo.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentrepo.deleteById(id);
	}

}
