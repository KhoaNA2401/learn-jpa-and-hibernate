package com.kar.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		//		repository.insert(new Course(1, "AngularJS", "Karz"));
		//		repository.insert(new Course(2, "VueJS", "Karz"));
		//		repository.insert(new Course(3, "React", "Karz"));
		//
		//		repository.deleteID(1);
		//
		//		repository.selectID(2);
		//		System.out.println(repository.selectID(2));
	}

}
