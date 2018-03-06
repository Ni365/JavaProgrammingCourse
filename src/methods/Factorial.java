package methods;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
		System.out.print("Enter a non-negative integer:");
		 int num = Integer.parseInt(input.nextLine());
		if (num < 0 ) {
			System.out.println("Please enter a non-negative integer.");
		}
		else if (num > 0) {
			System.out.println(num + "! = " + factorial(num));
		}
		
		else if (num == 0) {
			System.out.println(num + "! = " + 1);
		}
	
		}catch(NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
		}
		

        input.close();
        
       
	}
	
	private static int factorial(int num) {
		
		int fact = 1;
		
		if (num < 0) {
			fact = 1;
		}
		else if (num > 0){
		 for (int i=1; i <= num; i++) {
			 fact = fact *i;
		 }
		}
		else {
			
		}
		
		return fact;
		
		
	}

	
}