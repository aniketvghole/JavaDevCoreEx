
public class Fibonacci {           // 1 1 2 3 5 ..... 200
									//x y z
	
		public static void main(String[] args) {
			int a=1,b=1;
	  		while(a<200 && b<200)
			{
				System.out.println(a);
				a=a+b;
				System.out.println(b);
				b=a+b;
			}
	  		}	
		}
			
	
