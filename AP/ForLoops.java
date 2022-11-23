// For-Next vs For-Each with Arrays and ArrayLists
// 12-21-20

import java.util.*;

public class ForLoops
{
  public static void main(String args[])
  {
    int numList[] = {1, 4, 9, 16, 25};
    ArrayList<String> wordList = new ArrayList<String>();
    
    wordList.add("Apple");
    wordList.add("Banana");
    wordList.add("Cherry");
    wordList.add("Dominos");
    
    // For-Next Loop - uses a loop control variable (LCV), integer counter. We also with arrays use [] notation
    for(int x = 0; x < numList.length; x++)
    {
      System.out.println(numList[x]);
    }
    
    // ArrayList is a class, so we use .size() rather than .length. We also use .get() rather than []
    for(int x= 0; x < wordList.size(); x++)
    {
      System.out.println(wordList.get(x));
    }
    
    // For-Each Loop does not use LCV. Instead, we assume we're iterating from start to finish
    //  using a singular element from the plural list
    
    // "For each (singular) num in the (plural) numList"
    for(int num : numList)
    {
      System.out.println(num);
    }
    
    for (String word: wordList)
    {
      System.out.println(word);
    }
    
    System.out.println();
    
    // Take an ArrayList and remove the even numbers
    
    ArrayList<Integer> nums  = new ArrayList<Integer>();
    
    nums.add(2);
    nums.add(4);
    nums.add(4);
    nums.add(5);
    nums.add(6);
    
    for (int x= nums.size() - 1; x > 0; x--)
    {
      if (nums.get(x) % 2 == 0)
      {
        nums.remove(x);
      }
    }
    
    for (int n : nums)
    {
      System.out.println(n);
    }
  }
}