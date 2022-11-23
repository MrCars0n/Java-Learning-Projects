// Carson Kramer
// 4-20-20
// Period 5
// Negative, Positive and Zero Values 2.32

import java.util.*;

public class Chapter2Prog32
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    // Make 2 arrays for numbers and numbers as words
    int[] nums = new int[5];
    String numsLetters[] = {"first", "second", "third", "fourth", "fifth"};
    
    // Ask for input 5 times
    for (int x = 0; x < 5; x++)
    {
      System.out.print("Please enter the " + numsLetters[x] + " number: ");
      nums[x] = input.nextInt();
    }
    
    // Goes through array and adds to positive, negative and zero counters if one is found
    int pos = 0, neg = 0, zero = 0;
    for (int x= 0; x<5; x++)
    {
      if (nums[x] > 0)
      {
        pos++;
      }
      else if (nums[x] < 0)
      {
        neg++;
      }
      else
      {
        zero++;
      }
    }
    
    System.out.println("There are " + pos + " positives");
    System.out.println("There are " + neg + " negatives");
    System.out.println("There are " + zero + " zeros");
  }
}