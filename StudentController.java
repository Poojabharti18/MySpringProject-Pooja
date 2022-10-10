package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.StudentService;
import com.entity.Student;


@RestController
@RequestMapping("/students")
public class StudentController 
{
	@Autowired
	StudentService service;
	@GetMapping("/list")
	public List<Student> liststudents()
	{
		return service.findAll();
		
	}
	 @GetMapping("/findbyid/{studentid}")
		public Student findById(@PathVariable int studentid)
		{
			return service.findById(studentid);
		}
	@PostMapping("/save")
    public Student save(@RequestBody Student st)
    {
    	st.setStudentid(0);
		service.saveorUpdate(st);
    	return st;
    }
	@PutMapping("/update")
    public Student Update(@RequestBody Student st)
    {
    	//e.setProductid(0);
		service.saveorUpdate(st);
    	return st;
    }
	@DeleteMapping("/delete/{studentid}")
    public String delete(@PathVariable int studentid)
    {
    	Student stu=findById(studentid);
    	if(stu==null)
    	{
    		throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.deleteById(studentid);
    	}
    	return "student id"+studentid;
    	
    }

}
