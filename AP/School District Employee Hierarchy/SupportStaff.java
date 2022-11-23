// Support Staff subclass
// 3-8-21

public class SupportStaff extends Employee
{
  private double hoursWorked;
  private double hourlyWage;
  
  public SupportStaff()
  {
  }
  
  public SupportStaff(String fn, String ln, double hoursWorked, double hourlyWage)
  {
    super (fn, ln);
    setHoursWorked(hoursWorked);
    setHourlyWage(hourlyWage);
  }
  
  public void setHoursWorked(double hoursWorked)
  {
    if(hoursWorked >= 0 && hoursWorked <= 168)
    {
      this.hoursWorked = hoursWorked;
    }
    else
    {
      this.hoursWorked = 0;
    }
  }
  
  public void setHourlyWage(double horlyWage)
  {
    if(hourlyWage >= 0)
    {
      this.hourlyWage = hourlyWage;
    }
    else
    {
      this.hourlyWage = 0;
    }
  }
  
  public double getHourlyWage()
  {
    return hourlyWage;
  }
  
  public double getHoursWorked()
  {
    return hoursWorked;
  }
  
  public double earnings()
  {
    return hourlyWage * hoursWorked;
  }
  
  @Override
  public String toString()
  {
    return super.toString() + String.format("\nEarnings = $%.2f", earnings());
  }
}