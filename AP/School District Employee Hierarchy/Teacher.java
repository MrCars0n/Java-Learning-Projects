// Teacher subclass of Employee
// 3-8-21

public class Teacher extends Employee
{
  private double salary;
  
  public Teacher()
  {
    // super() is called by default
  }
  
  public Teacher(String fn, String ln, double salary)
  {
    super(fn, ln);
    setSalary(salary);
  }
  
  public void setSalary(double salary)
  {
    if (salary >= 0)
    {
      this.salary = salary;
    }
    else
    {
      this.salary = 0;
    }
  }
  
  public double getSalary()
  {
    return salary;
  }
  
  public double weeklyEarnings()
  {
    return salary / 52;
  }
  
  // Add tags here to note override of superclass toString
  @Override
  public String toString()
  {
    return super.toString() + String.format("\nWeekly pay = $%.2f", weeklyEarnings());
  }
}