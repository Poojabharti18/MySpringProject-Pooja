package com.Service;

import java.util.List;

import com.entity.Student;


public interface StudentService 
{
	public List<Student>findAll();
	public Student findById(int id);
	public void saveorUpdate(Student s);
	public void deleteById(int id);
	

}
