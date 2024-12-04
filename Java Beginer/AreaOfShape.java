class AreaOfShape{
 public static double AreaOfRectangle(int l, int w){
        double areaR = l*w;
        System.out.println("Area of Rectangle : "+areaR);
       return areaR;
      
}
public static double AreaOfTraingle(int h, int b){
       double areaT=0.5 * h * b;
        System.out.println("Area of Traingle : " + areaT);
       return areaT;
}

  public static void main (String[] args){
    double areaR= AreaOfRectangle(10, 7);
  double areaT= AreaOfTraingle(7,12);
  double area=areaR+areaT;
   System.out.println(area);
}


}