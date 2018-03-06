package strings;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter first number (zero ends): ");
		double num = readDouble(input);
		double sum = 0;
			
		if (num == 0) {
			 System.out.println("Nothing to calculate");
		} 
		else if(num != 0) {
			int i = 0;
			while (num != 0) {
				i++;
				sum += num;
				System.out.print("Enter next number (zero ends): ");
				num = readDouble(input);
			}
			
			double average = sum / i;
			System.out.println("The average is " + twoDecimals.format(average));
			input.close();
			
			}	
		}
	
	private static double readDouble(Scanner input) {
	 return Double.parseDouble(input.nextLine().replace(',', '.')); 
	}

	}
