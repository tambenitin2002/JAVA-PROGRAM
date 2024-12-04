package array;

public class Program {

	public static void main(String[] args) {
  
	 int [][][] arr= {
			 {{10,20},{45,63}},
			 {{50,30},{96,54}},
			 {{85,56},{56,78}}
	 };
		for(int[][] ar: arr) {
			for(int[] ar1: ar) {
				for(int ar2: ar1) {
					System.out.println(ar2);
			}
			System.out.println();
		}
			System.out.println();

	}
	}
}	


