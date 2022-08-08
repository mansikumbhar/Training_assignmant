package com.student.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.project.entity.Student;
import com.student.project.service.StudentService;

@Controller
public class StudentContoller {
	

	private StudentService studentservice;

	//Constructor based dependency Injection
	public StudentContoller(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//List of students
	@GetMapping("/students")
	public String listStudent(Model model) {
		
		model.addAttribute("students",studentservice.getAllStudent());
		return "students";
		
	}
	
	//New Registration
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		
		//create student object to hold student data
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String updateStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student",studentservice.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student,Model model) {
		
		//get student from database by id
		Student existingStudent=studentservice.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setAddress(student.getAddress());
		
		//update student info
		studentservice.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	//delete method
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentservice.deleteStudentById(id);
		return "redirect:/students";
	}

}
