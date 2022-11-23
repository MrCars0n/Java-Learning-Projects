// Carson Kramer
// 9-17-2020
// Period 4
// Chapter 2 Notes

import java.util.*; // Scanner

public class Chapter2
{
  public static void main(String args[])
  {
    // Instantiate an inastance of the Scanner class
    Scanner input = new Scanner(System.in);
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    int sum = num1 + num2;
    
    // Concatenation operator is +
    System.out.println("The sum is " + sum);
    
    // When entering mixed values (like a number and a string) with nextLine, you need an extra input between
    double x = input.nextDouble();
    String name = input.nextLine(); // take the extra newline (enter key) from above
    name = input.nextLine();
    
    System.out.println(x + " is " + name);
    
    // printf - formatted printing
    // %s = strings
    // %f = floats (decimals)
    // %d = integer
    System.out.printf("%s is awesome\n", name);
    System.out.printf("%d + %d = %d\n", num1, num2, sum);
    
    System.out.printf("%.2f is pi", Math.PI);
  }
}