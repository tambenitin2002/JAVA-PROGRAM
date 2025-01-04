public class LargeNumber {

	public static void main(String[] args) {
		int [] a= {12,2,15,31,25,12,69,3,45};
		int large=0;
		for(int i=0;i<a.length;i++) {
			if(large<a[i]) {
				large=a[i];
			}
		}
		System.out.println("The Large Number: "+large);
	}

}
