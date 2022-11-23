// Carson Kramer
// Arrays in Java & Array Lists
// 12-14-20

import java.util.*;   // Scanner and ArrayList

public class ArrayNotes
{
  public static void main (String args[])
  {
    Scanner input = new Scanner(System.in);
    
    // Array is a group or collection of values of the same type
    // The elements of the array are the actual contents of each array location
    // The locations are numbered, starting with 0 - we acll these the index/subscript
    
    int num[] = new int[10];
    // Other example:    int[] a = new int[10];
    
    // Begin with zero, are initialized
    System.out.println(num[0]);
    
    // Arrays are static structures, once size given can't change, but size of array can be set dynamically (with variable)
    int size = input.nextInt();
    int a[] = new int[size];
    
    // Arrays in Java also know their own length, using .length member
    for(int x = 0; x < a.length; x++)
    {
      System.out.println(x + "\t" + a[x]);
    }
    
    // ArrayLits are dynamic structures (size can change)
    //  We can add, remove, insert elements in ArrayList
    ArrayList<String> names = new ArrayList<String>();
    
    names.add("Daniel");
    names.add("Bennett");
    names.add("Andrew");
    names.add("Essam");
    names.add("Siddha");
    names.add("Matthew");
    names.add("Carson");
    
    for (int x=0; x < names.size(); x++)
    {
      System.out.println(names.get(x));
    }
    
    names.remove("Essam");
    
    System.out.println();
    
    for (int x=0; x < names.size(); x++)
    {
      System.out.println(names.get(x));
    }
    
    // Simulate a dice roll
    //  We have two six sided dice, sum to find the total
    //  Roll 100,000,000 and tally results
    
    int rollCount[] = new int[13];
    
    for (int roll = 1; roll <= 100000000; roll++)
    {
      int d1 = (int)(Math.random() * 6) + 1;
      int d2 = (int)(Math.random() * 6) + 1;
      int total = d1 + d2;
      rollCount[total]++;
    }
    
    for (int x = 2; x <= 12; x++)
    {
      System.out.println(x + "\t" + rollCount[x]);
    }
    
  }
}