// Carson Kramer
// 4-20-20
// Period 5
// Separating the Digits in an Integer 2.30

import java.util.*;

public class Chapter2Prog30
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter a number: ");
    
    // Creates array of characers from input (Converts int input to string, then to array of characters
    char[] charArray = Integer.toString(input.nextInt()).toCharArray();
    
    for (int x = 0; x < 5; x++)
    {
      System.out.printf(charArray[x] + "\t");
    }
  }
}
    