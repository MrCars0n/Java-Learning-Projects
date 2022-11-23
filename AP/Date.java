// Date Class

public class Date
{
  private int month;
  private int day;
  private int year;
  
  private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  public Date()
  {
    // Unix Timestamp Date
    setDate(1, 1, 1970);
  }
  
  public Date(int m, int d, int y)
  {
    setDate(m, d, y);
  }
  
  public void setDate(int m, int d, int y)
  {
    setMonth(m);
    setDay(d);
    setYear(y);
  }
  
  public void setYear(int y)
  {
    if (y >= 1753)
    {
      year = y;
    }
    else
    {
      throw new IllegalArgumentException("Year must be >= 1753");
    }
  }
  
  public void setMonth(int m)
  {
    if (m >= 1 && m <= 12)
    {
      month = m;
    }
    else
    {
      throw new IllegalArgumentException("Month must be between 1 and 12");
    }
  }
  
  public void setDay(int d)
  {
    if (d >= 1 && d <= daysPerMonth[month])
    {
      day = d;
    }
    else if(month == 2 & d == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
    {
      throw new IllegalArgumentException("Day is invalid for that month/year");
    }
  }
  
  public int getMonth()
  {
    return month;
  }
  
  public int getDay()
  {
    return day;
  }
  
  public int getYear()
  {
    return year;
  }
  
  public String toString()
  {
    return String.format("%d%d%d", month, day, year);
  }
}