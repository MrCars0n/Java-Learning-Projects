// Carson Kramer
// 4-20-20
// Period 5
// Arithmetic, Smallest and Largest 2.17

import java.util.*;

public class Chapter2Prog17
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    
    System.out.print("Please enter the second number: ");
    int num2 = input.nextInt();
    
    System.out.print("Please enter the third number: ");
    int num3 = input.nextInt();
    
    int sum = num1 + num2 + num3;
    System.out.println("The sum is " + sum);
    
    int average = sum / 3;
    System.out.println("The average is " + average);
    
    int product = num1 * num2 * num3;
    System.out.println("The product is " + product);
    
    int smallest = num1;
    if (num2 < smallest)
    {
      smallest = num2;
    }
    if (num3 < smallest)
    {
      smallest = num3;
    }
    System.out.println("The smallest is " + smallest);
    
    int largest = num1;
    if (num2 > largest)
    {
      largest = num2;
    }
    if (num3 > largest)
    {
      largest = num3;
    }
    System.out.println("The largest is " + largest);
  }
}