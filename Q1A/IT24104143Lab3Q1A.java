import java.util.Scanner;
public class IT24104143Lab3Q1A{
   
   public static void main(String[] args){
    
	Scanner Scanner= new Scanner(System.in);
    
	 
	 System.out.print("Enter the price of 1kg of rice:");
	 
	 double pricePerKg = Scanner.nextDouble();
	 
	 System.out.print("Enter the nember of kilograms you want to buy:");
	 
	 double quantity = Scanner.nextDouble();
	 
	 double totalAmount = pricePerKg*quantity;
	 System.out.println("The total amount is: " + totalAmount);
     }
}