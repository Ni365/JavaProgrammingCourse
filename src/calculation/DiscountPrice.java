package calculation;
import java.text.DecimalFormat;
import java.util.Scanner;                                    
 
public class DiscountPrice { 
 
public static void main(String[] args) { 
	
	 
	
	 Scanner input = new Scanner(System.in);  
	 DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
     //Get the original price
	 System.out.print("Enter original price: ");
	 //Print original price from user
	 double price = readDouble(input);
     //Final original price  
     double originalPrice = Math.round(price*100)/100.0;
	 
     //Get the discount
	 System.out.print("Enter discount percentage: ");
	 //Print
	 double discount = readDouble(input);
	 
	 
	 // Final price
	
     double result = originalPrice*(100-discount)*0.01;
	 
	 System.out.println("The final price is " + twoDecimals.format(result));
    input.close();                                        
 } 

private static double readDouble(Scanner input) {         
	return Double.parseDouble(input.nextLine().replace(',', '.')); }
}
  