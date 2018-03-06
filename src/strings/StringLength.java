package strings;
import java.util.Scanner;
public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalLength = 0;
		System.out.print("Enter first string: ");
		String getwords = input.nextLine();
		int num = getwords.length();
		totalLength += num;
		
		while (!getwords.equals("quit") ) {
			System.out.print("Enter a string: ");
			getwords = input.nextLine();
			num = getwords.length();	
			totalLength =totalLength + num; 
			
		}
		System.out.println("The total length is " + (totalLength - 4));
	    input.close();
	
	}

}