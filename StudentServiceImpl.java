package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dao.StudentDao;
import com.entity.Student;


@Service
public class StudentServiceImpl implements StudentService
{
@Autowired
StudentDao dao;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public void saveorUpdate(Student s) {
		dao.save(s);
		
	}
	@Override
	public Student findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		Optional<Student> s= dao.findById(id);
		Student s1=null;
		if(s.isPresent())
		{
			s1=s.get();
		}
		return s1;
	}
	@Override
	public void deleteById(int id) 
	{
          dao.deleteById(id);		
	}
	

}
