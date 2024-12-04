/* 11.Write a Java program to print the area and perimeter of a circle .
Test Data :
Redius=7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

public class AreaAndPerimeterOfCircle{
    public static void main(String[]args)
       {
          double radius= 7.5;
          double pai=3.14;
          double areaCircle , perimeterCircle;
                  areaCircle=  Math.PI * radius*radius;
                  perimeterCircle= 2* Math.PI * radius;
        System.out.println("Area is = " + areaCircle);
        System.out.println("Perimeter is =" + perimeterCircle);
            }
}