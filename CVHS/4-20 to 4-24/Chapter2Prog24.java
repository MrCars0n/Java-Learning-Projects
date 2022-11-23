// Carson Kramer
// 4-20-20
// Period 5
// Largest and Smallest Integers 2.24

import java.util.*;

public class Chapter2Prog24
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
    
    // Set largest and smallest to the first number. If any numbers are larger that largest or smaller than smallest, update values
    int largest = nums[0];
    int smallest = nums[0];
    for (int x = 0; x < 5; x++)
    {
      if (nums[x] > largest)
      {
        largest = nums[x];
      }
      if (nums[x] < smallest)
      {
        smallest = nums[x];
      }
    }
    
    // Print
    System.out.println("The smallest is " + smallest);
    System.out.println("The largest is " + largest);
  }
}