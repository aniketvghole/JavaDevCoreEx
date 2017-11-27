import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		int i, no,temp = 0;
		
		System.out.println("Enter the no you wanna check = ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		
		for(i=2;i<no;i++)
			{
				if(no%i==0)
				{
					
				temp++;
				break;
				}
			}
			if(temp==0) 
			{
			System.out.println("NO is prime");	
			}
			else
			{
				System.out.println("No is not prime");
			}
	}

}
