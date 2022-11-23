// Carson Kramer
// 4-20-20
// Period 5
// Diameter, Circumference and Area of a Circle 2.28

import java.util.*;

public class Chapter2Prog28
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the radius: ");
    int r = input.nextInt();
    
    double d = r * 2;
    double circ = d * Math.PI;
    double area = Math.PI * r * r;
    
    
    System.out.println("Diameter: " + d);
    System.out.println("Circumference: " + circ);
    System.out.println("Area: " + area);
  }
}