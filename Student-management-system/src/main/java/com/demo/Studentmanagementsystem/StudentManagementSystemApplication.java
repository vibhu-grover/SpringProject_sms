package com.demo.Studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.Studentmanagementsystem.entity.Student;
import com.demo.Studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		
//		Student student1 = new Student("Sugandha","Singh","sugu@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Vibhu","Grover","vibhu@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Ojas","Grover","ojo@gmail.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("Rizul","Taneja","riz@gmail.com");
//		studentRepository.save(student4);
		
	}

}
