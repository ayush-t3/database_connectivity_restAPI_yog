/**
 * 
 */
package com.apiExample.restApiSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiExample.restApiSpring.entities.Course;

/**
 * @author Training
 *
 */
public interface CoursesDao extends JpaRepository<Course, Long>{

}