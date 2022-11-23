// Point

public class Point
{
  private double x;
  private double y;
  
  public Point()
  {
    setX(0);
    setY(0);
    
    // The keyword "this" refers to "this" object!
    //System.out.println("Default constructor = " + this);
  }
  
  public Point(double x, double y)
  {
    setX(x);
    setY(y);
    //System.out.println("Specific constructor = " + this);
  }
  
  public void setX(double x)
  {
    // The keyword "this" used here refers to "this" class's x variable
    this.x = x;
  }
  
  public void setY(double y)
  {
    this.y = y;
  }
  
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public String toString()
  {
    // Notice the use of the get methods here, not just x,y!
    return "( " + getX() + ", " + getY() + " )";
  }
}






  
  
  
  
  
  
  








