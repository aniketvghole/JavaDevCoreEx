import java.util.Scanner;

public class ArrayLengthRace 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the first string");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("Enter the second string");
		String b=sc.nextLine();
		int a1=a.length();
		int b1=b.length();
		
		if(a1>b1)
			System.out.println("The larger array is "+a);
		else if(a1<b1)
			System.out.println("The larger array is "+b);
		else if(a1==b1)
			System.out.println("The arrays are of same lenght: " +a);
		System.out.println("and "+b);
		
				
	}

}
