// Carson Kramer
// 4-20-20
// Period 5
// Odd or Even 2.25

import java.util.*;

public class Chapter2Prog25
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    
    if (num1 % 2 == 0)
    {
      System.out.println(num1 + " is even");
    }
    else
    {
      System.out.println(num1 + " is odd");
    }
  }
}