package com.kar.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY = """
				INSERT INTO course (id, name, author) VALUES (1, 'Java', 'Karz');
			 	INSERT INTO course (id, name, author) VALUES (2, 'React', 'Karz');
			""";

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}

}
