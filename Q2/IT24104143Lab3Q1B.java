import java.util.Scanner;
 public class IT24104143Lab3Q1B {
 public static void main(String [] args){
   Scanner Scanner = new Scanner(System.in);
    System.out.print("Enter the monthly salary :");
    double monthlySalary = Scanner.nextDouble();
    System.out.print("Enter the number of OT hours  :");
    double numberOfOThours = Scanner.nextDouble();
    System.out.print("Enter the OT hourly rate  :");
    double oThourlyrate = Scanner.nextDouble();
	
  // OT Amount = number Of OT hours*OT hourly rate
   double OTAmount = numberOfOThours*oThourlyrate;
  double TotalsalaryincludingOT = (monthlySalary+OTAmount);
  System.out.println("The total Salary including OT is :" + TotalsalaryincludingOT);
   }
 }
  