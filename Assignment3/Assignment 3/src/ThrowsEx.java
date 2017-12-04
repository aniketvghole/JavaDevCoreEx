
public class ThrowsEx {
	int division(int a, int b) throws ArithmeticException{  
		int t = a/b;
		return t;
	   }  
	   public static void main(String args[]){  
		ThrowsEx obj = new ThrowsEx();
		try{
		   System.out.println(obj.division(15,0));  
		}
		catch(ArithmeticException e){
		   System.out.println("shouldn't divide number by zero");
		}
	   }
}
