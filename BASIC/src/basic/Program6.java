package basic;

public class Program6 {
        int a=25;{
        	m1();
        }
        public void m1() {
        	a=20;
        }
}
public class D{
	static int a=80;
	int b=35;
	public static void A() {
		D d=new D();
		Program6 c=new Program6();
		System.out.println(c.a);
		System.out.println(d.a);
        System.out.println("h");	
	}
	public static void main(String[] args) {
		Program6 c=new Program6();
		 System.out.println("h");
		System.out.println(c.a);
		System.out.println(D.a);
	}
	
	
}
