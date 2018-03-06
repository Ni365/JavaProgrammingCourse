package calculation;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DrivingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		
		System.out.print("Enter driven kilometers: ");
		int DriveKilo = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter amount of fuel consumed: ");
		double consumed = readDouble(input);
	    
	    
	    System.out.print("Enter fuel price per liter: ");
	    double perLiter = readDouble(input);
	    
	    
	    double result = perLiter/(DriveKilo/consumed);;
	    
	    
	     
	    System.out.println("\n" + "The cost per kilometer is " + twoDecimals.format(result) + " euros.");
		
	    input.close();

	}
	
	private static double readDouble(Scanner input) {         
		return Double.parseDouble(input.nextLine().replace(',', '.')); 
	}

}