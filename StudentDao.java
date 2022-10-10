package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.entity.Student;



public interface StudentDao extends JpaRepository<Student, Integer>
{

}
