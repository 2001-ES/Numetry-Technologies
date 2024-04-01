package Esha.Demo_Aop.service;

public class Admission {

	public void saveStudent(int enrollmentNumber) {
		System.out.println("New student entry started");
		
		System.out.println("New student record saved in database");
		}
	public void hostelAllocated() {
		System.out.println("Searching Hostel for new student");
		
	   System.out.println("hostel allocated to student");	
}
}
