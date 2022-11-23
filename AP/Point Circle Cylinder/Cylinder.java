// Cylinder is a direct sublacc of Circle
// Cylinder is an indirect subclass of Point

public class Cylinder extends Circle
{
  private double height;
  
  public Cylinder()
  {
    super();
    setHeight(1);
  }
  
  public Cylinder(int x, int y, double r, double h)
  {
    super(x, y, r);
    setHeight(h);
  }
  
  public void setHeight(double h)
  {
    height = (h > 0 ? h : 1);
  }
  
  public double getHeight()
  {
    return height;
  }
  
  public double volume()
  {
    return super.area() * getHeight();
  }
  
  public String toString()
  {
    return super.toString() + "\tHeight = " + getHeight();
  }
}