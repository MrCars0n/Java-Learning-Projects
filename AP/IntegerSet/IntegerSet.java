// IntegerSet
// 3-5-21
// Period 4
// Carson Kramer

public class IntegerSet
{
  private boolean set[] = new boolean[101]; 
  
  // REQUIRED - Default Constructor
  public IntegerSet()
  {
    for (boolean num : set)
    {
      num = false;
    }
  }
  
  // EXTRA - Specific Instructor for array integration
  public IntegerSet(int arr[])
  {
    addArr(arr);
  }
  
  // EXTRA - Method for adding mutliple numbers at once
  public void addArr(int arr[])
  {
    for (int num : arr)
    {
      addNumber(num);
    }
  }
  
  // EXTRA - Converts boolean array into integer array
  public int[] toIntArr()
  {
    // Gets number of true values in boolean array
    int arrSize = 0;
    for (boolean num : set)
    {
      if (num)
      {
        arrSize++;
      }
    }
    
    // Temporary variables
    int arr[] = new int[arrSize];
    int currentSlot = 0;
    
    // Adds true values in boolean set to temp array
    for (int x = 0; x < set.length; x++)
    {
      if (set[x])
      {
        arr[currentSlot] = x;
        currentSlot++;
      }
    }
    
    return arr;
  }
  
  // REQUIRED - Union Method
  public IntegerSet union(IntegerSet set1)
  {
    IntegerSet tempSet = new IntegerSet(toIntArr());
    
    tempSet.addArr(set1.toIntArr());
    
    return tempSet;
  }
  
  // REQUIRED - Intersection Method
  public IntegerSet intersection(IntegerSet set1)
  {
    int arr1[] = set1.toIntArr();
    int arr2[] = toIntArr();
    
    IntegerSet tempSet = new IntegerSet();
    
    for (int num1 : arr1)
    {
      for(int num2 : arr2)
      {
        if (num1 == num2)
        {
          tempSet.addNumber(num1);
        }
      }
    }
    
    return tempSet;
  }
  
  // REQUIRED - addNumber Method
  public void addNumber(int num)
  {
    if(num <= 100 && num >= 0)
    {
      set[num] = true;
    }
  }
  
  // REQUIRED - removeNumber Method
  public void removeNumber(int num)
  {
    if(num <= 100 && num >= 0)
    {
    set[num] = false;
    }
  }
  
  // REQUIRED - printSet Method
  public void printSet()
  {
    System.out.print("{");
    boolean listEmpty = true;
    
    for (int x = 0; x < set.length; x++)
    {
      if (set[x])
      {
        if(!listEmpty)
        {
          System.out.print(", ");
        }
        listEmpty = false;
        System.out.print(x);
      }
    }
    System.out.print("}");
  }
  
  // EXTRA - Set accessor method
  public boolean[] getSet()
  {
    return set;
  }
  
  // REQUIRED - isEqualTo Method
  public boolean isEqualTo(IntegerSet set1)
  {
    boolean isEqualTo = true;
    for (int x = 0; x < getSet().length; x++)
    {
      if (set1.getSet()[x] != getSet()[x])
      {
        isEqualTo = false;
      }
    }
    
    return isEqualTo;
  }
}