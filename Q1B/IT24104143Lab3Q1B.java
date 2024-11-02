import java.util.Scanner;
 
 public class IT24104143Lab3Q1B{
 public static void main (String[] args){

   Scanner Scanner = new Scanner(System.in);
   System.out.print("Enter the price of 1kg of rice :");
   double priceperkg = Scanner.nextDouble();
   System.out.print("Enter the number of kilograms you want to buy :");
   double quantity = Scanner.nextDouble();
   
 // double Discount = 0.1;
  
  double totalAmountWithDiscount = priceperkg*quantity - priceperkg*quantity*0.1;
  System.out.println("    ");
  System.out.println("The total amount with 10% discount is :   " + totalAmountWithDiscount);
  }
 }