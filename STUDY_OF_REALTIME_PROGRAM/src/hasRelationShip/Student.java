package hasRelationShip;

public class Student {
 private String studenName;
 private int studentId;
 private College college;
 
public Student(String studenName, int studentId, College college) {
	super();
	this.studenName = studenName;
	this.studentId = studentId;
	this.college = college;
}
public void display() {
	System.out.println("Student Name: "+studenName);
	System.out.println("Student Id: "+studentId);
	System.out.println("Student college: "+college.collegeName);
	System.out.println("Student Of college Location : "+college.collegeLocation);

}
 
 
 
}
