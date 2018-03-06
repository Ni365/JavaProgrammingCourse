package methods;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MethodsThird {

	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
	  DecimalFormat twoDecimals = new DecimalFormat("0.00");
	  
       System.out.print("Enter gross salary: ");
       double grossSalary = readDouble(input);
       System.out.print("Enter income tax rate: ");
       double taxRate = readDouble(input);
       
       double netSalary = calculateNetSalary(grossSalary, taxRate );
       
       System.out.print("\n");
       System.out.println("The net salary is " + twoDecimals.format(netSalary));
	}
	


	public static double calculateNetSalary(double grossSalary, double taxRate) {
		
		
	    return grossSalary * (1-taxRate*0.01);
		
	}
	
	private static double readDouble(Scanner input) {         
		return Double.parseDouble(input.nextLine().replace(',', '.')); } }