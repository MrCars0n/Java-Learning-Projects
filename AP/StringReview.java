// Java String Review

public class StringReview
{
  public static void main (String args[])
  {
    String s1 = "computer";
    
    // length() - 0 up to (not including) the length()
    System.out.println(s1.length());  // 8
    
    // iterate and give one letter at a time
    for(int x=0; x < s1.length(); x++)
      System.out.println(s1.charAt(x)); // These are chars, not strings!
    
    // do the same thing with substring, not charAt
    for(int x=0; x < s1.length(); x++)
      System.out.println(s1.substring(x, x+1)); //These are string (of length one!)
    
    // substring(from, to) -- inclusize on from, exclusive on to
    // overload for substring(from) -- inclusive on from to the end of the string
    
    // get the word "put" from computer
    System.out.println(s1.substring(3, 6));
    
    // string.indexOf(string key) - return the first index occurence of key in string
    //  if not found, return -1  NOTE - only gives first occurance
    System.out.println(s1.indexOf("p"));  // 3
    System.out.println(s1.indexOf("er"));  // 6
    
    if (s1.indexOf("z") >= 0)
      System.out.println("Z is in the string");
    else
      System.out.println("Z is not in the string");
    
    // equals vs === vs compareTo
    //  == is comparison equals, meant to work only with primitive variables
    //  equals is a bolean method meant to work with objects, like String
    String s2 = "computer";
    String s3 = new String("computer");
    
    if (s1 == s2)
      System.out.println("== works!");
    
    if(s1.equals(s2))
      System.out.println("equals works!");
    
    if (s1 == s3)
      System.out.println("== works!");
    
    if(s1.equals(s3))
      System.out.println("equals works!");
    
    // compareTo - <, >, or =
    //  
    String word1 = "apple";
    String word2 = "eagle";
    String word3 = "eagle";
    
    System.out.println(word1.compareTo(word2));  // -4 (a is 4 before e in ASCII)
    System.out.println(word2.compareTo(word1));  // 4 (e is 4 after a in ASCII)
    
    if (word1.compareTo(word2) < 0)
      System.out.println("Word1 comes before word2");
    
    if (word1.compareTo(word3) == 0)  //same as .equals()
      System.out.println("The words are the same!");
    
  }
}