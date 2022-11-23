// Doing digit splitter using string methods

import java.util.*;

public class Splitter
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    String num = input.nextLine(); // Get number as a string
    
    String d1 = num.substring(0, 1);
    String d2 = num.substring(1, 2);
    String d3 = num.substring(2, 3);
    String d4 = num.substring(3, 4);
    String d5 = num.substring(4, 5);
    
    System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
    
    System.out.println(num.charAt(0));
    
    String digit1 = "" + num.charAt(0); // To convert a char to a string, concatenate an empty string
  }
}