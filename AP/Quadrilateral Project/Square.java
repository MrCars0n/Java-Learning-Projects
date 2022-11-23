public class Square extends Rectangle
{
  public Square(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y, double p4x, double p4y)
  {
    super(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
  }
  
  public double area()
  {
    return Math.pow(top(), 2);
  }
  
  public double perimeter()
  {
    return 4 * top();
  }
  
  @Override
  public String toString()
  {
    return String.format("\nCoordinates of Square are:\n" + getP1() + ", " + getP2() + ", " + getP3() + ", " 
                           + getP4() + "\nSide is: %.1f\nArea is: %.1f", top(), area());
  }
}