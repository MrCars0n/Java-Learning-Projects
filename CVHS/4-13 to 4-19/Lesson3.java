// Mr. Ensminger
// Chapter 2 Notes - Lesson 3
// Computer Science
// April 2020

// Just like C/C++ uses include statements at the top of the code, Java uses import statements
// The following line is used to import the Scanner class, which is used for getting input
// The asterisk (*) at the end is what's known as the "wildcard" character, meaning in essence 
//  import "everything/all of the classes" in the built-in "util" library folder of Java

// We could write import java.util.Scanner; if we wanted JUST the Scanner class, but most programmers just use *

import java.util.*;

public class Lesson3
{
  public static void main(String args[])
  {
    // Like some of your other commands over the years, such as randomize() or srand(time(0)), we
    //  write this line of code one time, and one time only, at the top of our main function to get input
    
    Scanner input = new Scanner(System.in);
    
    // So, you want to input a few integers, do ya?
    System.out.print("Please enter the first number: ");
    int num1 = input.nextInt();
    
    System.out.print("Please enter the second number: ");
    int num2 = input.nextInt();
    
    int total = num1 + num2;
    System.out.println("The sum of the two numbers is " + total);
    
    // Wowwwww. Now, what about two DECIMALS?!?! WHOA!!!
    System.out.print("Please enter the first decimal: ");
    double d1 = input.nextDouble();
    
    System.out.print("Please enter the second decimal: ");
    double d2 = input.nextDouble();
    
    double dTotal = d1 + d2;
    System.out.println("The sum of the two decimals is " + dTotal);
    
    // Wait, can we input strings, too!? NO WAY!!!
    // (I hope you're hearing my voice in your head as you read these comments.)
    
    // BUT HOLD UP.
    
    // You have to be careful when using nextLine, because if you precede it with input with numbers, like
    //  in this example, the nextLine() below actually captures the enter key from your previous input.
    //  Therefore, it skips the first name input! ERROR! ERROR!
    
    // To fix this, uncomment the following line. You have to get one line of "fake" input between the number
    //  and the string you get next. I know, it's dumb. WELCOME TO PROGRAMMING!
    
    String whatever = input.nextLine();
    
    System.out.print("Enter your first name, please: ");
    String firstName = input.nextLine();
    
    System.out.print("Enter your last name, please: ");
    String lastName = input.nextLine();
    
    System.out.printf("Student: %s, %s", lastName, firstName);
    
    
    // And now, let's wrap up with if-statements, which are MOSTLY the same as C/C++
    if(total > 0)
    {
      System.out.println("Your total is positive!");
    }
    
    // Mod? Yep, still a thing. Double equals? Yep.
    if(total % 2 == 0)
    {
      System.out.println("Your total is even!");
    }
    
    // < > == != <= >= && ||   Same, same, same!
    // else and else if?       Mmmhm, same.
    
    // Now, you may have noticed that when declaring int and double, they're lower case.
    // But when we declare String, it's upper case. That's because String is a class, not a primitive variable type
    // What does that mean? For right now, don't worry too much about it, EXCEPT FOR STRINGS AND IF STATEMENTS.
    
    // Spoiler - this example works
    String word1 = "computer";
    
    if(word1 == "computer")
    {
      System.out.println("Hey, this prints!");
    }
    
    // Spoiler - this example does NOT work
    String word2 = new String("computer");
    
    if(word2 == "computer")
    {
      System.out.println("Wait, huh?! Why didn't this print?!");
    }
    
    // Spoiler - this example also does NOT work
    
    // Try to type "computer" for this input
    String word3 = input.nextLine();
    
    if(word3 == "computer")
    {
      System.out.println("Wait, huh?! Why didn't this print, either?!");
    }
    
    // When comparing strings, you should always use the function .equals, not == as you can see below
    
    // THIS IS THE FIXED, CORRECT WAY TO CHECK STRINGS BEING EQUAL
    if(word2.equals("computer"))
    {
      System.out.println("Woohoo!");
    }    
  }
}

    