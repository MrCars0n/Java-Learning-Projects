// 2D Arrays in Java, Continued
// 1-14-21

public class Two2DArraysCont
{
  public static void main (String args[])
  {
    int grid[][] = new int[3][5];
    
    // 0 0 0 0 0
    // 0 0 0 0 0
    // 0 0 0 0 0
    
    fillGrid(grid);
    printGrid(grid);
    
    System.out.println("The sum of row 0 is " + sumRow(grid, 0));
    System.out.println("The sum of column 0 is " + sumColumn(grid, 0));
  }
  
  public static int sumColumn (int arr[][], int col)
  {
    int total = 0;
    for (int row = 0; row < arr.length; row++)
    {
      total += arr[row][col];
    }
    return total;
  }
  
  public static int sumRow (int arr[][], int row)
  {
    int total = 0;
    for (int col = 0; col < arr[row].length; col++)
    {
      total += arr[row][col];
    }
    return total;
  }
  
  public static void fillGrid(int arr[][])
  {
    for(int row = 0; row < arr.length; row++)
    {
      for(int col = 0; col < arr[row].length; col++)
      {
        arr[row][col] = (int)(Math.random() * 10);
      }
    }
  }
  
  public static void printGrid(int arr[][])
  {
    for (int row[] : arr)
    {
      for (int num : row)
      {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}