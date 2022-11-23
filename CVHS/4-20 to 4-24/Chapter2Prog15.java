// Carson Kramer
// 4-20-20
// Period 5
// Arithmetic 2.15

import java.util.*;

public class Chapter2Prog15
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    
    System.out.print("Please enter the second number: ");
    int num2 = input.nextInt();
    
    int sum = num1 + num2;
    System.out.println("The sum is " + sum);
    
    int product = num1 * num2;
    System.out.println("The product is " + product);
    
    int difference = num1 - num2;
    System.out.println("The difference is " + difference);
    
    int quotient = num1 / num2;
    System.out.println("The quotient is " + quotient);
  }
}