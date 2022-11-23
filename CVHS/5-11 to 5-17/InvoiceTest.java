// Carson Kramer
// 5-17-20
// Period 5
// 3.13 Invoice Class

import java.util.*;

public class InvoiceTest
{
 public static void main(String args[])
 {
   Scanner input = new Scanner(System.in);
   
   System.out.println("***********************INVOICE GENERATOR***********************");
   System.out.println();
   
   System.out.print("Enter the part number: ");
   String partNum = input.nextLine();
   
   System.out.print("Enter the part description: ");
   String partDesc = input.nextLine();
   
   System.out.print("Enter the quantity sold: ");
   String quantity = input.nextLine();
   
   System.out.print("Please the price per item: ");
   String price = input.nextLine();
   
   Invoice in1 = new Invoice(partNum, partDesc, Integer.parseInt(quantity), Double.parseDouble(price));
   Invoice in2 = new Invoice();
   
   in1.print();
   in2.print();
 }
}

class Invoice
{
  private String partNum;
  private String partDesc;
  private int quantity;
  private double price;
  
  
  // Constructor
  public Invoice()
  {
    setPartNum("0");
    setPartDesc("<Description Example>");
    setQuantity(0);
    setPrice(0);
  }
  
  public Invoice(String num, String desc, int quant, double p)
  {
    setPartNum(num);
    setPartDesc(desc);
    setQuantity(quant);
    setPrice(p);
  }
  
  // Calculations
  public double getInvoiceAmount()
  {
    double amount = quantity * price;
    return amount;
  }
  
  // Sets
  public void setPartNum(String num)
  {
    partNum = num;
  }
  
  public void setPartDesc(String desc)
  {
    partDesc = desc;
  }
  
  public void setQuantity(int quant)
  {
    if (quant >= 0)
    {
      quantity = quant;
    }
    else
    {
      quantity = 0;
    }
  }
  
  public void setPrice(double p)
  {
    if(p >= 0)
    {
      price = p;
    }
    else
    {
      price = 0;
    }
  }
  
  // Gets
  public String getPartNum()
  {
    return partNum;
  }
  
  public String getPartDesc()
  {
    return partDesc;
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  public double getPrice()
  {
    return price;
  }
  
  public void print()
  {
    System.out.printf("\tInvoice for part #%s\n", partNum);
    System.out.printf("Description:\t\t%s\n", partDesc);
    System.out.printf("Quantity :\t\t\t%d\n", quantity);
    System.out.printf("Price per part:\t\t$%.2f\n", price);
    System.out.printf("Total Invoice Ammount:\t$%.2f\n\n", getInvoiceAmount());
  }
}