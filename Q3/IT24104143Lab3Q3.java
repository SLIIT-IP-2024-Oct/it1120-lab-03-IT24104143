import java.util.Scanner;
public class IT24104143Lab3Q3{
public static void main (String [] args){
  Scanner Scanner = new Scanner(System.in);
  System.out.print("Enter the rupee amount  :");
  int rupeeamount = Scanner.nextInt();
  int notes5000 = rupeeamount/5000;
  int amount1 = rupeeamount-(notes5000*5000);
  int notes1000 = amount1/1000;
  int amount2 = amount1-(notes1000*1000);
  int notes500 =amount2/500;
  int amount3 = amount2-(notes500*500);
  int notes200 = amount3/200;
  int amount4 = amount3-(notes200*200);
  int notes100 = amount4/100;
  int amount5 = amount4-(notes100*100);
  int notes50 = amount5/50;
  int amount6 = amount5-(notes50*50);
  int notes20 = amount6/20;
  int amount7 = amount6-(notes20*20);
  int coins10 = amount7/10;
  int amount8 = amount7-(coins10*10);
  int coins5 = amount8/5;
  int amount9 = amount8-(coins5*5);
  int coins2 = amount9/2;
  int amount10 = amount9-(coins2*2);
  int coins1 = amount10/1;
  int amount11 = amount10-(coins1*1);
  
 
  System.out.println("           ");
  System.out.println("5000 notes - "+ notes5000);
  System.out.println("1000 notes - "+ notes1000);
  System.out.println(" 500 notes - "+ notes500);
  System.out.println(" 200 notes - "+ notes200);
  System.out.println(" 100 notes - "+ notes100);
  System.out.println("  50 notes - "+ notes50);
  System.out.println("  20 notes - "+ notes20);
  System.out.println("  10 notes - "+ coins10);
  System.out.println("   5 coins - "+ coins5);
  System.out.println("   2 coins - "+ coins2);
  System.out.println("   1 coins - "+ coins1);
  }
}
  
  
  
