package sameClassConstructorChaining;
// Constructor Chaining within the same class using this() keyword
public class SameClassConstructorChaining {
	SameClassConstructorChaining(){
		this(5);
		 System.out.println("The Default constructor");
	}
	
	 SameClassConstructorChaining(int x) {
		this(5,15);
		System.out.println(x);
	}
	 
	 SameClassConstructorChaining(int x,int y) {
			System.out.println(x*y);
    }

	public static void main(String[] args) {
	//	SameClassConstructorChaining s=
				new SameClassConstructorChaining();
       // System.out.println(s);
	}

}
