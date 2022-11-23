import java.util.*;

public class Sentinel1
{
  public static void main(String args[])
  {
    // Definite loop - find the average of ten numbers
    // Indefinite loop - find the average of a series of positive numbers, until you enter the -1
    
    Scanner input = new Scanner(System.in);
    
    int num;
    int count = 0;
    int total = 0;
    double average = 0;
    
    System.out.print("Please enter a number (-1 to quit): ");
    num = input.nextInt();
    
    while (num != -1)
    {
      count++;
      total += num;
      
      System.out.print("Please enter a number (-1 to quit): ");
      num = input.nextInt();
    }
    
    average = (double)total / count;
    System.out.println("The average is " + average);
    
    // -----------------------------------------------------------------------
    // Sentinel loop with multiple inputs
    
    int miles;
    int gallons;
    
    while (miles != -1)
    {
      gallons = input.nextInt();
      miles = input.nextInt();
    }
  }
}