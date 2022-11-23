public class Rectangle extends Parallelogram
{
  public Rectangle(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y, double p4x, double p4y)
  {
    super(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
  }
  
  public double area()
  {
    return top() * height();
  }
  
  public double perimeter()
  {
    return (2 * top()) + (2 * height());
  }
  
  @Override
  public String toString()
  {
    return String.format("\nCoordinates of Rectangle are:\n" + getP1() + ", " + getP2() + ", " + getP3() + ", " 
                           + getP4() + "\nWidth is: %.1f\nHeight is: %.1f\nArea is: %.1f", top(), height(), area());
  }
}