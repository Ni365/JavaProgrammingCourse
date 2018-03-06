package strings;
import java.util.Scanner;
public class DescendingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
        int getUser = input.nextInt();
        
       int i = getUser;
       while (i < getUser && i > 0 || i == getUser && i > 0) { 
        	System.out.print(i + " ");
        	i--;
        	}
        
       
		
	input.close();
	}
}
