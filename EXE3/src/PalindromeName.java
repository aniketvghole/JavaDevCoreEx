import java.util.Scanner;

public class PalindromeName {

	
	   public static void main(String args[])
	   {
	      String og, rev = ""; 
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      og = sc.nextLine();
	 
	      int length = og.length(); // method
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + og.charAt(i);
	 
	      if (og.equals(rev))   //method
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 
	   }
	}


