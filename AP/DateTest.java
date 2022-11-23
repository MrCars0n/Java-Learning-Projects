// Test file for Date

public class DateTest
{
  public static void main(String args[])
  {
    Date today = new Date(2, 22, 2021);
    System.out.println(today);
    
    // Is it summer?
    if(today.getMonth() >= 6 && today.getMonth() <= 8)
    {
      System.out.println("It is summer!");
    }
    else
    {
      System.out.println("It's not summer!");
    }
    
    try
    {
      today.setDate(-1, -1, -1);
    }
    catch(Exception e)
    {
      System.out.println(e.getClass().getName());
      System.out.println(e.getMessage());
    }
  }
}