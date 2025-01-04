public class CyclicallyArrayRotateArray {
    public static void main(String[] args) {
        int [] arr=new int[] {1,2,3,4,5,6,7,8,3,2};
         System.out.println("Given Array is ");
            for(int arr1: arr) {
                 System.out.print(arr1+" ");
            }
            //This is a first approch
            
    //	 int last_element = arr[arr.length-1];
    //	 for(int i=arr.length-1; i>0; i--) {
    //		 arr[i]=arr[i-1];
    //	 }
    //	 arr[0]=last_element;
            
            
         
            //This is a Second approach 
            
            
            int i=0, j =arr.length-1;
            while (i!=j) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            
            
            
         System.out.println("\n Rotated Array is ");
        for(int arr1: arr) {
             System.out.print(arr1+" ");
        }
    }
    
}