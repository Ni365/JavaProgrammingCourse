package strings;
import java.util.Scanner;
public class StringEquality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String firstOne = input.nextLine();
		
		System.out.print("Enter second string: ");
		String secondOne = input.nextLine();
		
		if (firstOne.equals(secondOne)) {
			System.out.println("Equal");
		}
		
		else  {
			System.out.println("Not equal");
		}
		
		input.close();
	}

}
