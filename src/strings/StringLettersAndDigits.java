package strings;
import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String thing = input.nextLine();
		
		
		
		int  charCount= 0;
		for (int i = 0; i < thing.length(); i++) {
			if((thing.charAt(i) >='a' && thing.charAt(i)<='z') || (thing.charAt(i)>='A' && thing.charAt(i)<='Z'))
			    charCount++;
		}
		System.out.println(charCount + " letter(s)");
		
		System.out.println(thing.replaceAll("\\D", "").length() + " digit(s)");
			
			
		
	}

}