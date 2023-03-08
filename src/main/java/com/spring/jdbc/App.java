package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started... ");

		// use when bean is defined via xml
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");

		// use when bean is defined via java config file
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDaoImpl studentDaoImpl = context.getBean("studentDaoImpl", StudentDaoImpl.class);

		// insert
//		 Student student = new Student(); student.setId(662); student.setName("vaibhav");
//		 student.setCity("Patna");
//		 int result = studentDaoImpl.insert(student);
//		 System.out.println("student added ....." + result);

		// update
//		  Student student = new Student(); student.setId(222); student.setName("Raj");
//		  student.setCity("Patna");
//		  int result = studentDaoImpl.change(student);
//		  System.out.println("student updated  ....." + result);

		// delete
//		int res = studentDaoImpl.delete(222);
//		System.out.println("deleted " + res);

		// Retrive data
//	    Student student=	studentDaoImpl.getStudent(456);
//	    System.out.println(student);

		// Retrive all data
		List<Student> students = studentDaoImpl.getAllStudents();
		for (Student s : students)
			System.out.println(s);

	}
}
