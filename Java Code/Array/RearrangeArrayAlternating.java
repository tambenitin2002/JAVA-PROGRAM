public class RearrangeArrayAlternating {
    public static void main(String []ags){
        int [] arr={1,2,-3,-4,5,-6};
        int [] res= new int[arr.length];
        int posIndex=1;
        int negIndex=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]<0 && negIndex<arr.length){
               res[negIndex]=arr[i];
               negIndex+=2;
          }else if(arr[i]>=0){
            res[posIndex]=arr[i];
            posIndex+=2;
          }
        }
        for(int result:res)
{
    System.out.print(result+",");
}
    }
}
