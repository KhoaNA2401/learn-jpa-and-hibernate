package com.kar.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		//		repository.insert(new Course(1, "AngularJS JPA", "Karz"));
		//		repository.insert(new Course(2, "VueJS JPA", "Karz"));
		//		repository.insert(new Course(3, "React JPA", "Karz"));
		//
		//		repository.deleteID(1);
		//
		//		System.out.println(repository.selectID(2));
	}

}
