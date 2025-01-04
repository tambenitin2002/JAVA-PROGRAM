public class ReversArray {
    public static void main(String[] args) {
		int [] arr= {12,25,21,5,36,13};
		int [] temp = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			temp[i]=arr[arr.length-i-1];
			
			
		}
		System.out.println("Array length: "+arr.length);
		for(int i=0;i<arr.length;i++) {
			 arr[i]=temp[i];
		}
		
		for(int rv: arr) {
			System.out.println(rv+" ");
		}
	}
}
