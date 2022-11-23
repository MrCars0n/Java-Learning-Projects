// Test File
// 3-4-21

public class PointCircleCylinderTest
{
  public static void main(String args[])
  {
    Point p1 = new Point();
    System.out.println(p1);
    
    Point p2 = new Point(3,4);
    System.out.println(p2);
    
    Circle c1 = new Circle(2, -5, 4.5);
    System.out.println(c1);
    System.out.println(c1.diameter());
    System.out.println(c1.circumference());
    System.out.println(c1.area());
  }
}