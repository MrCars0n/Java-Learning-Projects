// ExtraDutyTeacher (direct sublacc of Teacher, indirect sublacc of Employee)

public class ExtraDutyTeacher extends Teacher
{
  private double extraPay;
  
  public ExtraDutyTeacher()
  {
  }
  
  public ExtraDutyTeacher(String fn, String ln, double salary, double extra)
  {
    super(fn, ln, salary);
    setExtraPay(extra);
  }
  
  public void setExtraPay(double extra)
  {
    if (extra >= 0)
    {
      extraPay = extra;
    }
    else
    {
      extraPay = 0;
    }
  }
  
  public double getExtarPay()
  {
    return extraPay;
  }
  
  public double earnings()
  {
    return super.weeklyEarnings() + extraPay / 52;
  }
  
  public String toString()
  {
    return super.toString();
  }
}