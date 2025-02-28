package com.kar.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kar.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseSpringDataJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "AngularJS CourseSpringDataJPARepository", "Karz"));
		repository.save(new Course(2, "VueJS CourseSpringDataJPARepository", "Karz"));
		repository.save(new Course(3, "React CourseSpringDataJPARepository", "Karz"));

		repository.deleteById(1);

		System.out.println(repository.findById(2));
		System.out.println(repository.findByAuthor("Karz"));
		System.out.println(repository.findByAuthor("Karzzz"));

		System.out.println(repository.findByName("VueJS CourseSpringDataJPARepository"));

	}

}
