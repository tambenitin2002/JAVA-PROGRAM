package studentProject;

import java.util.Scanner;

public class School {
    String scname;
    String area;
	Student s;
	public School(String scname, String area) {
		super();
		this.scname = scname;
		this.area = area;
	}
	Scanner sc=new Scanner(System.in);
	public void login() {
		if(this.s==null) {
			
			System.out.println("Enter the student name ");
			String name=sc.next();
			System.out.println("Enter the student id ");
			int id=sc.nextInt();
			System.out.println("Enter the student std ");
			String std=sc.next();
			this.s= new Student(name,id,std);
			System.out.println("Loggin Successfull");
		}else {
			System.out.println("Already Loggin....");
			System.out.println(" \n \n----------------------------------------------------------");
		}
	}
	
	public void logout() {
		if(this.s==null) {
			System.out.println("First Login..");
		}else {
			this.s=null;
			System.out.println("Logout successfull...");
			System.out.println("\n \n----------------------------------------------------------");
		}
	}
	
	public void studentDetails() {
		if(this.s==null) {
			System.out.println("First Login..");
		}else {
			System.out.println("School Name is "+scname);
			System.out.println("School Area is "+area);
			System.out.println("Student Name is "+s.getSname());
			System.out.println("Student id is "+s.getId());
			System.out.println("Student Name is "+s.getStd());
			
			System.out.println(" \n \n----------------------------------------------------------");

			
		}
	}
	
	public void updatestd() {
		if(this.s==null) {
			System.out.println("First Login..");
		}else {
			System.out.println("Enter the Updating Standerd ");
			String std=sc.next();
			s.setStd(std);
			System.out.println("std update successfully ");
			System.out.println(" \n \n----------------------------------------------------------");

			
		}
	}
    
}
