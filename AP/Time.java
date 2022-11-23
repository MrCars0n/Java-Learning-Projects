// Time Class - not runnable

public class Time
{
  // Attributes of the object (private variables)
  private int hour;
  private int minute;
  private int second;
  
  // Object behaviors (public functions)
  //  public members access private members
  
  // Constructors - define default values, Same name as class, no return
  
  // Default constructor - no parameters
  public Time()
  {
    // Calling 3 argument constructor
    this(0, 0, 0);
  }
  
  // Specific instructor - parameters
  public Time(int h, int m, int s)
  {
    setTime(h, m, s);
  }
  
  // Constructors = overloaded (same method name, different parameters)
  
  // Only hour constructor
  public Time(int h)
  {
    this(h, 0, 0);
  }
  
  // Copy constructorr - create new Time based on another time object
  public Time(Time t)
  {
    // Cannot access "t"'s private varibles, use get function
    this(t.getHour(), t.getMinute(), t.getSecond());
  }
  
  // Get methods
  public int getHour()
  {
    return hour;
  }
  
  public int getMinute()
  {
    return minute;
  }
  public int getSecond()
  {
    return second;
  }
  
  // Set methods - protect private data
  public void setHour(int h)
  {
    if (h >= 0 && h < 24)
    {
      hour = h;
    }
    else
    {
      // Keyword "throw" will "throw" and "exception" (error) to the "catching" block
      //  in runnable main class. Text here will be shown as error
      throw new IllegalArgumentException("Invalid hour - must be between 0 and 23");
    }
  }
  
  public void setMinute(int m)
  {
    if (m >= 0 && m < 60)
    {
      minute = m;
    }
    else
    {
      throw new IllegalArgumentException("Invalid minute - must be between 0 and 59");
    }
  }
  
  public void setSecond(int s)
  {
    if (s >= 0 && s < 60)
    {
      second = s;
    }
    else
    {
      throw new IllegalArgumentException("Invalid second - must be between 0 and 59");
    }
  }
  
  public void setTime(int h, int m, int s)
  {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }
  
  // Class specific methods
  public String toMilitaryTime()
  {
    // String.format similar to printf, using %d, %s, etc...
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    
    // Note - we get methods here rather than direct variables because
    //  when we get to inheritance, we MAY need a sublacc to refer to this method
  }
  
  // Each class should have toString()
  public String toString()
  {
    return String.format("%d:%02d:%02d %s", 
                         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
  }
}