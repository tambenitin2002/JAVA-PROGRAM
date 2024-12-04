package differentClassConstructorChaining;

public class BaseClass {

	String name;
	BaseClass(){
		this("");
		System.out.println("No-Argument Constructor of base class");
	}
	
	BaseClass(String name){
		this.name=name;
		System.out.println("Calling parameterized constructor of base class");
	}
}
