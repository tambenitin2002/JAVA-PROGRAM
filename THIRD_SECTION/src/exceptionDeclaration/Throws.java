package exceptionDeclaration;

public class Throws {

	public static void div() throws ArithmeticException{
		int a= 10;
		int b= 0;
		int res=a/b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		try {
			div();
		} catch (ArithmeticException a) {
			System.out.println("mathematical invalidations");
		}
		

	}

}
