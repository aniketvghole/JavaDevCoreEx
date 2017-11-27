
public class Fibonacci {           // 1 1 2 3 5 ..... 200
									//x y z
	public static void main(String args[])
	{
		int x,y,z;
		x=0;
		y=1;
		z=1;
		System.out.print(y+"  "+z+"  ");
	
		while(x<=200)
		{ 
			{x=y+z;
			System.out.print(x +" "); }
			y=z;
			x=y;
			
		}
	}

}
