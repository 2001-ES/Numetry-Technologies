package com.esha;

public class Student {
int rno;
String name;
float marks;
public Student() {
	
}

public Student(int rno, String name, float marks) {
	super();
	this.rno = rno;
	this.name = name;
	this.marks = marks;
}



public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}

}
