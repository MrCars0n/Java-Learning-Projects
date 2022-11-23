// Arrays and Methods in Java
// 1-4-21

import java.util.*;

public class ArraysAndMethods
{
  public static void main(String args[])
  {
    int a[] = {2, 4, 6, 8, 10};
    
    // Sending a single element from an array into a function menas changes arn't kept (passed by value)
    System.out.println(squareElement(a[0]));
    System.out.println(a[0]);
    
    // Sending the entire array into function changes are kept (passed by reference)
    squareArray(a);
    
    for (int num : a)
    {
      System.out.println(num);
    }
    
    ArrayList<String> names = new ArrayList<String>();
    names.add("Siddha");
    names.add("Matthew");
    names.add("Essam");
    
    printSpecial(names);
    
    int aCopy[] = copyArray(a);
    
    for (int x = 0; x < aCopy.length; x++)
    {
      System.out.println(aCopy[x]);
    }
  }
  
  public static int[] copyArray(int arr[])
  {
    // When returing an array in Java, be sure to declare AND initialize it with some kind of length
    int copy[] = new int[arr.length];    
    
    for(int x= 0; x<arr.length;x++)
    {
      copy[x] = arr[x];
    }
    
    return copy;
  }
  
  public static int squareElement(int num)
  {
    return num * num;
  }
  
  public static void squareArray(int arr[])
  {
    for (int x = 0; x < arr.length; x++)
    {
      arr[x] = squareElement(arr[x]);
    }
  }
  
  public static void printSpecial(ArrayList<String> list)
  {
    for (String e : list)
    {
      System.out.println(e + ", welcome!");
    }
  }
}