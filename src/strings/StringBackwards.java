package strings;
import java.util.Scanner;
public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String something = input.nextLine();
		
		reverse(something);

	}
	
	public static void reverse (String something) {
		
		
		String result = new StringBuffer(something).reverse().toString();
		
		System.out.println(result);
		return;
	}

}