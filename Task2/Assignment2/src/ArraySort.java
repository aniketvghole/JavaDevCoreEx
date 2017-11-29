import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] num = {3,1,2,5,4};
		String[] site = {"gmail", "yahoo","aol","hotmail","git"};
		System.out.println("Orignal array is"+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("Sorted array is"+Arrays.toString(num));
		System.out.println();
		System.out.println("Orignal array is"+Arrays.toString(site));
		Arrays.sort(site);
		System.out.println("Orignal array is"+Arrays.toString(site));
	}

}
