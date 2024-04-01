package com.esha;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebAPI {

@GetMapping("getName")	
	public String getName()
	{
		return "Esha";
	}
@GetMapping("getNames")	
public ArrayList<String>  getNames()
{
	ArrayList<String> names=new ArrayList<>();
	names.add("India");
	names.add("China");
	names.add("UK");
	names.add("Japan");
	names.add("America");
	
	return names;
}

@GetMapping("getStudent")	
public Student getStudent()
{
	Student student = new Student(101, "alex",90);
	
	return student; 
}

@GetMapping("getStudents")	
public ArrayList<Student> getStudents()
{
	ArrayList<Student> students=new ArrayList<>();
	students.add(new Student(101,"alex",90));
	students.add(new Student(102,"amar",92));
	students.add(new Student(103,"aman",9));
	students.add(new Student(104,"rajiu",95));
	
	return students; 
}



}

