
	import java.util.Scanner;

	public class DuplicateArray {

		public static void main(String[] args) {
			int n;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter array no ");
			n=sc.nextInt();
			int array1 []= new int [n];
			for (int a=0; a<n;a++)
			{
			 array1[a]=sc.nextInt();
			}
		for(int i=0; i<n;i++)
		{
			for(int j=i+1; j<n;j++)
			{
				if(array1[i]==array1[j])
				{
					System.out.println(array1[i]+"is reapeated");
					
				}
			}	
		}
		}

	}
	
	
