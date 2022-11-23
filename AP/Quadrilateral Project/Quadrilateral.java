public class Quadrilateral
{
  private Point p1 = new Point();
  private Point p2 = new Point();
  private Point p3 = new Point();
  private Point p4 = new Point();
  
  public Quadrilateral()
  {
  }
  
  public Quadrilateral(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y, double p4x, double p4y)
  {
    p1.setX(p1x);
    p1.setY(p1y);
    p2.setX(p2x);
    p2.setY(p2y);
    p3.setX(p3x);
    p3.setY(p3y);
    p4.setX(p4x);
    p4.setY(p4y);
  }
  
  public Point getP1()
  {
    return p1;
  }
  public Point getP2()
  {
    return p2;
  }
  public Point getP3()
  {
    return p3;
  }
  public Point getP4()
  {
    return p4;
  }
  
  public void setP1(double p1x, double p1y)
  {
    p1.setX(p1x);
    p1.setY(p1y);
  }
  
  public void setP2(double p2x, double p2y)
  {
    p2.setX(p2x);
    p2.setY(p2y);
  }
  public void setP3(double p3x, double p3y)
  {
    p3.setX(p3x);
    p3.setY(p3y);
  }
  public void setP4(double p4x, double p4y)
  {
    p4.setX(p4x);
    p4.setY(p4y);
  }
  
  public double height()
  {
    return p4.getY() - p1.getY();
  }
  
  public double top()
  {
    return p3.getX() - p4.getX();
  }
  
  public double bottom()
  {
    return p2.getX() - p1.getX();
  }
  
  public double left()
  {
    return Math.sqrt(Math.pow(height(), 2) + Math.pow(Math.abs(p4.getX()-p1.getX()), 2));
  }
  
  public double right()
  {
    return Math.sqrt(Math.pow(height(), 2) + Math.pow(Math.abs(p3.getX()-p2.getX()), 2));
  }
  
  public String toString()
  {
    return "\nCoordinates of Quadrilateral are:\n" + p1 + ", " + p2 + ", " + p3 + ", " + p4;
  }
}