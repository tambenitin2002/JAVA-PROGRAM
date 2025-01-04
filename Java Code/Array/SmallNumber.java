public class SmallNumber {
    public static void main(String[] args) {
		int [] a= {12,45,36,78,1,6,33};
		int small= Integer.MAX_VALUE;
		for(int i=0; i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
		}
		System.out.println("Small Number: " +small);
	}
}