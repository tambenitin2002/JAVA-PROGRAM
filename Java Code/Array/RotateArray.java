public class RotateArray {
    public static void main(String []args){
        int [] arr={1,2,3,4,5,6,7};
        int [] res=new int[arr.length];
        for(int i=0;i<3;i++){
            for(int j=1;j<arr.length;j++){
                while(res[0]!=5){
                    res[i]=arr[i];
                }
               
            }
        }
        for (int i : res) {
            System.out.print(i+",");
        }
    }
}
