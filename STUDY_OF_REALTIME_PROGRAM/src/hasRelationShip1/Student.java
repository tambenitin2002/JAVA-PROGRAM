package hasRelationShip1;

public class Student {

	 private int studentId;
	 private String studentName;
	 private College college;
	public Student(int studentid, String studentName, College college) {
		super();
		this.studentId = studentid;
		this.studentName = studentName;
		this.college = college;
	}
	public void showStudent() {
		System.out.println("Student id is : "+studentId);
		System.out.println("Student Name is : "+ studentName);
		System.out.println("Student College is "+ college.getCollegeName());
		System.out.println("Student College Location is: "+college.getCollegeLocation());
	}
	 
	 
}
