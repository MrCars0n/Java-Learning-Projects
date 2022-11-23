// Two Dimensional Arrays in Java
// 1-11-21

// Tables or grids or spreadsheets of values
//  Indices are identified by the row and then the column

public class TwoDArrays
{
  public static void main(String args[])
  {
    // Create a pre-filled 2d array
    int grid[][] = { {1, 2}, {3, 4} };
    
    // In Java, multi-dimension arrays are stored as an array of arrays
    // This matters, because in Java you may create "jagged" arrays
    int jagged[][] = { {1, 2}, {3, 4, 5} };
    
    // In Java, arrays know their own length. To get number of rows ...
    System.out.println(jagged.length);  // 2 (index 0 & 1)
    
    // To get the length of a row (number of columns in that row)...
    System.out.println(jagged[0].length);
    System.out.println(jagged[1].length);
    
    // To iterate through a 2d array, we use 2 for loops
    // The outer loop is v, the number of rows. Inner loop is h, number of columns
    for(int v=0; v < jagged.length; v++)
    {
      for (int h = 0; h < jagged[v].length; h++)
      {
        System.out.print(jagged[v][h] + " ");
      }
      System.out.println();
    }
    
    // To create an empty array
    int table[][] = new int[3][4];
    
    int jag[][] = new int[2][];
    jag[0] = new int[3];
    jag[1] = new int[5];
    
    print2DArray(jag);
    
    // To use a for-each loop with a 2D array ...
    int total = 0;
    for (int row[] : jagged)
    {
      for (int num : row)
      {
        total += num;
      }
    }
    System.out.println("The total of the values in jagged is " + total);
  }
  
  public static void print2DArray(int arr[][])
  {
    for (int v=0; v < arr.length; v++)
    {
      for (int h = 0; h < arr[v].length; h++)
      {
        System.out.print(arr[v][h] + " ");
      }
      System.out.println();
    }
  }
}