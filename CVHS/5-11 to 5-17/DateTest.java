// Carson Kramer
// 5-17-20
// Period 5
// 3.15 Date Class

import java.util.*;

public class DateTest
{
 public static void main(String args[])
 {
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the month: ");
   String m = input.nextLine();
   
   System.out.print("Enter the day: ");
   String d = input.nextLine();
   
   System.out.print("Enter the year: ");
   String y = input.nextLine();
   
   Date d1 = new Date(Integer.parseInt(m), Integer.parseInt(d), Integer.parseInt(y));
   Date d2 = new Date();
   
   System.out.println(d1);
   System.out.println(d2);
 }
}

class Date
{
  private int month;
  private int day;
  private int year;
  
  // Constructors
  public Date()
  {
    setMonth(1);
    setDay(1);
    setYear(1900);
  }
  
  public Date(int m, int d, int y)
  {
    setMonth(m);
    setDay(d);
    setYear(y);
  }
  
  // Sets
  public void setMonth(int m)
  {
    month = m;
  }
  
  public void setDay(int d)
  {
    day = d;
  }
  
  public void setYear(int y)
  {
    year = y;
  }
  
  // Gets
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
    return month + "/" + day + "/" + year;
  }
}