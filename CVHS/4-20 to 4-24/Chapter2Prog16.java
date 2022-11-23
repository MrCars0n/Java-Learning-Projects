// Carson Kramer
// 4-20-20
// Period 5
// Comparing Integers 2.16

import java.util.*;

public class Chapter2Prog16
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    
    System.out.print("Please enter the second number: ");
    int num2 = input.nextInt();
    
    if (num1 > num2)
    {
      System.out.print(num1 + " is larger");
    }
    else if(num1 < num2)
    {
      System.out.print(num2 + " is larger");
    }
    else
    {
      System.out.print("These numbers are equal");
    }
      
  }
}