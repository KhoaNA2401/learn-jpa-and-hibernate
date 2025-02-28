package com.kar.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kar.springboot.learn_jpa_and_hibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer> {

	List<Course> findByAuthor(String author);

	List<Course> findByName(String name);
}
