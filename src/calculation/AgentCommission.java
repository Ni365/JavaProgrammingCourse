package calculation;
import java.text.DecimalFormat;
import java.util.Scanner;
public class AgentCommission {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		
	     System.out.print("Enter selling price: ");
	     double price = readDouble(input);
	     double roundedPrice = Math.round(price*100)/100.0;
	     
	     double comPercentage = 0.0344;
		 double commission = roundedPrice*comPercentage;
	    
	    
	    //method1
	    if (commission > 2400) {
	    	System.out.println("The commission is " + twoDecimals.format(commission) + " euros.");
	    }
		
	    else if (commission <= 2400) {
	    	System.out.println("The commission is 2400,00 euros." );
	    	
	    }

		else {
			System.out.println("Please give the correct information");
		}
	    
	    
	    input.close();
	    
	}
	
	private static double readDouble(Scanner input) {         
		return Double.parseDouble(input.nextLine().replace(',', '.')); }

}
