package com.student.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.project.entity.Student;
import com.student.project.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	
	private StudentRepo studentrepo;
	
	@Override
	public void run(String ...args) throws Exception {
		
//		Student student1=new Student("Mansi","Kumbhar","mansi@gmail.com","At post:satara");
//		studentrepo.save(student1);
//		
//		Student student2=new Student("Kiran","Babar","kiran@gmail.com","At post:pune");
//		studentrepo.save(student2);
//		
//		Student student3=new Student("Pradnya","Jagtap","pradnya@gmail.com","At post:satara");
//		studentrepo.save(student3);
	}
	
}
