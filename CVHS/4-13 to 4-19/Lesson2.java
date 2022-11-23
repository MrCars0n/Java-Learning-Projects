// Mr. Ensminger
// Chapter 2 Notes - Lesson 2
// Computer Science
// April 2020

// Variables and formatted printing

// An alternative way to print in Java is to use the printf command for formatted printing
// NOTE: YES, YOU MAY STILL USE PRINT AND PRINTLN - THIS IS MERELY A THIRD OPTION!

public class Lesson2
{
  public static void main(String args[])
  {
    // First, you can concatenate in Java using the plus sign in your print and println statements, like this:
    String name = "Sven";
    System.out.println("Hello there, " + name + ". How are you today?");
    
    // As I said above, another option is to use the printf command. It works kind of like a fill-in-the-blank.
    // %s is the placeholder for strings
    // %d is the placeholder for integer types
    // %f is the placeholder for floating point types (decimals)
    //  there are other options you may use with %f - in the example below, I had it print to one decimal place
    
    // Notice how after the text in quotes, I placed the variables in order from left to right as they appear
    //  in the text, separated by commas. The order, of course, matters!
    
    int num = 19;
    double decimal = 98.6;
    String word = "COVID";
    
    System.out.printf("If you get %s - %d, your temperature will likely rise above %.1f\n", word, num, decimal);
    
    // Speaking of variables, all of the old rules about integers about the operators still apply!
    
    int sum = 3 + 4;
    int diff = 3 - 4;
    int prod = 3 * 4;
    int quot = 3 / 4;
    double fixedQuot = 3.0 / 4.0;
    
    System.out.println("The sum is " + sum);
    System.out.println("The difference is " + diff);
    System.out.println("The product is " + prod);
    System.out.println("The quotient is " + quot);  // THIS WILL GIVE YOU ZERO, NOT .75!!!!!!!!!!!!!!!!!!!!!!
    System.out.println("The ACTUAL quotient is " + fixedQuot); 
        
    // We'll wrap up the lessons for the week with how to get input in Java!
  }
}




