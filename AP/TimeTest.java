// Time Tester Class

public class TimeTest
{
  public static void main(String args[])
  {
    Time t1 = new Time();
    System.out.println(t1.toMilitaryTime());
    System.out.println(t1);
    
    Time t2 = new Time(13, 29, 30);
    System.out.println(t2.toMilitaryTime());
    System.out.println(t2);
    
    Time t3 = new Time(13);
    System.out.println(t3.toMilitaryTime());
    System.out.println(t3);
    
    Time t4 = new Time(t2);
    System.out.println(t4.toMilitaryTime());
    System.out.println(t4);
    
    // try / catch blocks - if anything with try block "throws" an exception, it is "caught" by catch
    
    try
    {
      Time t5 = new Time (-5, 99, 43202);
    }
    catch(IllegalArgumentException e)
    {
      // e = parameter representing thrwn error, .getMessage() print text from code
      System.out.println(e.getMessage());
    }
  }
}