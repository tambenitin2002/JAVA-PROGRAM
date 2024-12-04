package basic;

public class Program8 {
	Program8(boolean a){
		System.out.println("MODEM="+a);
	}
	Program8(float a){
		System.out.println("ROUTER="+a);
	}
	public static void main(String[] args) {
		Program8 con1=new Program8(50);
		Program8 con2=new Program8(false);
	}
}
