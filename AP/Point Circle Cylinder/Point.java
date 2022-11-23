// Inheritance
// 3-1-21

// One of the core-concepts of Object-Oriented Programming, promoting software reusability
//  by "inheriting" existing class members and giving them new/different capabilities

// Superclass (aka base class / parent class) is class being inherited from
// Subclass (aka derived class or child class) is class inherited into

// For example, superclass Quadrilateral could be inherited into subclass Rectangle
//  We can also use idea of direct and indirect superclass.subclasses
//  Sqare class is drect sublacc of Rectangle and therefore an indirect subclass of quadrilateral

// We call these class diagrams/setups "Class hierarchies"

// Subclass is more complex than superclass, because subclass is everything a superclass is and more

// Java only supports single inheritance, cannot inherit more than one class

// Keyword "extends" shows inheritance - class Square extends Rectangle

// Remember, inheritance shows "is a" relationship

public class Point
{
  private int x;
  private int y;
  
  public Point()
  {
    setX(0);
    setY(0);
    
    // Keyword "this" refers to "this" object
    //System.out.println("Default counstructor = " + this);
  }
  
  public Point(int x, int y)
  {
    setX(x);
    setY(y);
    //System.out.println("Specific constructor = " + this);
  }
  
  public void setX(int x)
  {
    // Keyworkd "this" used = "this" class's x variable
    this.x = x;
  }
  
  public void setY(int y)
  {
    this.y = y;
  }
  
  public int getX()
  {
    return x;
  }
  
  public int getY()
  {
    return y;
  }
  
  public String toString()
  {
    // Notice the use of get methods here, not just x, y
    return "(" + getX() + ", " + getY() + ")";
  }
}