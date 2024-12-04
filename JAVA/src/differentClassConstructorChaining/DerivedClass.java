package differentClassConstructorChaining;

public class DerivedClass extends BaseClass {

	DerivedClass(){
		System.out.println("No-argument Constructor of derived ");
	}
	DerivedClass(String name){
		super(name);
		System.out.println("Calling parameterized constructor of derived class");
	}
	public static void main(String[] args) {
		DerivedClass obj=new DerivedClass("Nitin");
        System.out.println(obj.name);
	}

}
