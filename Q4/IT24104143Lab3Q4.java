
import java.util.Scanner;
 public class IT24104143Lab3Q4{
 public static void main(String [] args){
 Scanner Scanner = new Scanner(System.in);
  System.out.print("Enter a five-digit number  :");
  int number = Scanner.nextInt();
  int digit1 = (number/10000);
  int digit2 = (number/1000)%10;
  int digit3 = (number/100)%10;
  int digit4 = (number/10)%10;
  int digit5 = (number%10);
  System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
  
   }
 }