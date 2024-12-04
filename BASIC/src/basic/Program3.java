package basic;

public class Program3 {
	int a=20;
	public void test() {
		System.out.println(a);
	}
	{
		a=10;
		test();
	}
	public static void main(String[] args) {
		{
			System.out.println("java");
		}
	}

}
