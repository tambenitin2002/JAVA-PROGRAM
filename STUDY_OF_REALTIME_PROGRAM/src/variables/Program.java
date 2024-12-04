package variables;

public class Program {
	static int a;
	float b;
	public static void display() {
		Program p=new Program();
		p.b=24.7f;
		a=5;
		System.out.println(a);
		System.out.println(p.b);
		
	}
	public void show() {
		System.out.println("A is "+a);
		
	}
	public static void main(String[] args) {
		Program p=new Program();
		
		display();
		p.show();
	}

}
