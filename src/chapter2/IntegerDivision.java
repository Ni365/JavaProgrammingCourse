package chapter2;

import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter dividend: ");
		int dividend = input.nextInt();
		
		System.out.print("Enter divisor: ");
		int divisor =input.nextInt();
		
		int result = dividend / divisor;
	
		int remainder = dividend / (2*divisor);
		
		if (result > 1) {	
        System.out.println(dividend + "/" + divisor + "=" + result + "," + " the remainder is " + remainder);
	    
		}
		
		else if (result < 1) {
			System.out.println(dividend + "/" + divisor + "=" + result + "," + " the remainder is " + dividend );
		}
		
		input.close();
	}

}
