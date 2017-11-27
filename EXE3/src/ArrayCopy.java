
public class ArrayCopy {
	 public static void main(String args[]) {
	        int a[] = { 4, 5, 6, 7, 8, 9 };
	        int b[] = new int[a.length];

	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i];
	        
	        System.out.println("a ="+a[i]);
	        System.out.println("b ="+b[i]);
	        }
	    }
}