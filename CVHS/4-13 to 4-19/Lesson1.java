// Mr. Ensminger
// Chapter 2 Notes - Lesson 1
// Computer Science
// April 2020

// Pro-Tip 1 - in Dr. Java, to turn on line numbers, go to edit->preferences, then click on "display options"
//  and check the box that says "show line numbers". You can also change the font here, if you'd like.

// Pro-Tip 2 - please be sure to click compile and then run. Do not "just" click run!

// As I've told you before, Java is very, very similar to C++ syntax in so many ways.
// For example, making comments? Same! You may use either // or the /* */ block comments
// Spacing and tabbing? Same. 
// Open and closing braces? Same.
// Structures like if-statements and loops? Same.

// ** CRITICAL NOTE 1 ** 
// The name of this class is Lesson1. The name of this file is Lesson1.
// YOUR CLASS NAME AND YOUR FILE NAME MUST MATCH EXACTLY!!!!!!!!!!!!!!

// ** CRITICAL NOTE 2 **
// The rules for naming your class name/file name are the same as the rules for naming a variable
// DO NOT START WITH A NUMBER. DO NOT USE A KEYWORD. DO NOT USE SPECIAL CHARACTERS.

// ** INSTRUCTIONS **
// In order to prepare you for errors you may encounter, try to run this program as-is
// There is an error with the line which prints, the semicolon is missing!
// Notice how the error window highlights the line with the error and tells you what's wrong? Now, fix it!

public class Lesson1
{
  // Each Java class contains one (and only one) main function, as seen below.
  public static void main(String args[])
  {
    System.out.println("There is an error on this line - no semicolon!");
      
    // "endl" doesn't exist in Java. Instead, we use either println (with endl) or print (without endl)
    System.out.print("So, this prints...");
    System.out.println("... and this would print on the same line as the one above, THEN go to the next line...");
    System.out.println("... and print this line below it.");
    
    // This prints a blank line
    System.out.println();
    
    System.out.println("And \n the \n escape \n characters \n still \n work \n too!");
    System.out.println("They \t see \t me \t tabbing.");
  }
}


