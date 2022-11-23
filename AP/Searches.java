// Linear Search (Sequential Search) and Binary Search
// 1-17-21

// Linear search works for both sorted and unsorted lists
// Binary search only works for sorted lists

// LINEAR
//  Best - 1 step
//  Worst - n steps (number of elements)

// BINARY
//  Best - 1 step
//  Worst - log2(n) steps

// If you have 10 elements
//  2 ^ ___ just over 10

public class Searches
{
  public static void main (String args[])
  {
    int a[] = {4, 2, 9, 0, 1, 5, 6, 3, 7, 8};
    int b[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
    
    int index = sequentialSearch(a, 9);
    
    if (index == -1)
    {
      System.out.println("Element not found");
    }
    else
    {
      System.out.println("Element found at location " + index);
    }
    
    index = binarySearch(b, 9);
    
    if (index == -1)
    {
      System.out.println("Element not found");
    }
    else
    {
      System.out.println("Element found at location " + index);
    }
  }
  
  public static int sequentialSearch(int elements[], int target)
  {
    for (int j = 0; j < elements.length; j++)
    {
      if (elements[j] == target)
      {
        return j;
      }
    }
    
    return -1;
  }

  public static int binarySearch(int elements[], int target)
  {
    int left = 0;
    int right = elements.length - 1;
    
    while (left <= right)
    {
      int middle = (left + right) / 2;
      
      if (elements[middle] > target)
      {
        right = middle - 1;
      }
      else if (elements[middle] < target)
      {
        left = middle + 1;
      }
      else
      {
        return middle;
      }
    }
    
    return -1;
  }
}