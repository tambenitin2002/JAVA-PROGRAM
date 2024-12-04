package hasRelationShip;

public class Main {

	public static void main(String[] args) {
		College c1=new College("SVIT","Nashik, Maharashtra");
		Student s1=new Student("Nitin", 1, c1);
		Student s2=new Student("Siddhart", 2, c1);
		Student s3=new Student("Rakesh", 3, c1);
		Student s4=new Student("Akshay", 4, c1);

		s1.display();
		System.out.println("----------------------------------------------");
		s2.display();
		System.out.println("----------------------------------------------");

		s3.display();
		System.out.println("----------------------------------------------");

		s4.display();
		

		
	}

}
