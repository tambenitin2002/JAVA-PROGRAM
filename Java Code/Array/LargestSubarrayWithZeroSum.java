public class LargestSubarrayWithZeroSum {
    public static void main(String [] args){
          int [] arr={1,2,-3,3,1,-4,2,1};
          int maxlength=0;
          int sum=0;

          for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                
                if(sum==0){
                maxlength= Math.max(maxlength,j-i+1);
                }
            }
          }
          System.out.println(maxlength);

    }
}
