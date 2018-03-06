package calculation;
import java.util.Scanner;
import java.text.DecimalFormat;
public class CarSharing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		
		System.out.print("Enter driven kilometers: ");
		double drivenMeters = readDouble(input);
		
		
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelCom = readDouble(input);
		
		
		System.out.print("Enter fuel price per liter: ");
		double fuelprice = readDouble(input);
		
		
		System.out.print("Enter number of people: ");
		int people = input.nextInt();
		
		double result = drivenMeters/100*fuelCom*fuelprice/people;
		
		
		
		System.out.println("\n" + "Each of the " + people + " people should pay " + twoDecimals.format(result) + " euros.");
		
		input.close();

	}
	private static double readDouble(Scanner input) {         
		return Double.parseDouble(input.nextLine().replace(',', '.')); } 

}