package calculation;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TicketPrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter price for a single ticket: ");
		double priceSingle = readDouble(input);
		
        
		System.out.print("Enter price for a season ticket: ");
		double priceSeason = readDouble(input);
		
		
		System.out.print("Enter the number of bus trips per month: ");
		int days = input.nextInt();
		
		double singleTicket = priceSingle*days;
		
		if (singleTicket > priceSeason) {
			
	    double difference1 = singleTicket-priceSeason;
		
		System.out.println("Buying a season ticket is " + twoDecimals.format(difference1) + " euros cheaper.");
			
		}
		
		else if (singleTicket < priceSeason) {
		
		double difference2 = priceSeason-singleTicket;
		
		System.out.println("Buying single tickets is " + twoDecimals.format(difference2) + " euros cheaper."); }
		
		else if (singleTicket == priceSeason) {
		System.out.println("There is no difference in the price.");
		}
		
	    input.close();
	}
	
	private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
	
}