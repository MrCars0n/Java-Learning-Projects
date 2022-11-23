public class Trapezoid extends Quadrilateral
{
  public Trapezoid(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y, double p4x, double p4y)
  {
    super(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
  }
  
  public double area()
  {
    return ((top() + bottom())/2) * height();
  }
  
  public double perimeter()
  {
    return top() + bottom() + left() + right();
  }
  
  @Override
  public String toString()
  {
    return String.format("\nCoordinates of Trapezoid are:\n" + getP1() + ", " + getP2() + ", " + getP3() + ", " 
                           + getP4() + "\nHeight is: %.1f\nArea is: %.2f", height(), area());
  }
}