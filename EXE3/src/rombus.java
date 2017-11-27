
public class rombus {



	public static void main(String[] args) {
		
		
		int s=0;
		for(int i=1 ; i<9;i++)
		{
			if(i<=4)
			{
		for(int j=0;j<4-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1); k++)
		{
		System.out.print("x");
		}
		System.out.println();
		}

		else
		{
		for(int j=0;j<s+1;j++)
		{
			System.out.print(" ");
			
		}
		s++;
		for(int k=0 ; k<=(2*(7-i));k++)
		{System.out.print("x");}
		System.out.println();
		}
	}
	}
}
		