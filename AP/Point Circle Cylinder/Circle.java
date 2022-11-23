// Circle is subclass of Point - "Circle is-a point"

public class Circle extends Point
{
  // What makes a circle? (x, y) a point and radius
  //  Only list variables yet to be represented
  private double radius;
  
  public Circle()
  {
    // In order to construct subclass Circle, FIRST construct superclass Point by calling keyword "super"
    super(0, 0);
    setRadius(1);
    
    System.out.println("Default circle = " + this);
  }
  
  public Circle (int x, int y, double radius)
  {
    super(x, y);
    setRadius(radius);
    System.out.println("Specific circle = " + this);
  }
  
  public void setRadius(double r)
  {
    radius = (r > 0 ? r : 1);
  }
  
  public double getRadius()
  {
    return radius;
  }
  
  public double diameter()
  {
    return 2 * getRadius();
  }
  
  public double circumference()
  {
    return Math.PI * diameter();
  }
  
  public double area()
  {
    return Math.PI * getRadius() * getRadius();
  }
  
  // In a class hierarchy, when a subclass shares method name with superclass method,
  //  we call that method overriding (NOT OVERLOADING) - in order to access superclas smethod in subclass,
  //  we can use super.____
  public String toString()
  {
    return "Center = " + super.toString() + "\tRadius" + getRadius();
  }
}