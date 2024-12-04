package hasRelationShip1;

public class Main {
 public static void main(String[] args) {
	College c1= new College("SVIT","Nashik,Maharashtra");
	Student s1=new Student(1, "Nitin", c1);
	Student s2= new Student(2, "Chetan", c1);
	
	s1.showStudent();
	System.out.println("-----------------------------------------------------------------");
	s2.showStudent();
}
}
