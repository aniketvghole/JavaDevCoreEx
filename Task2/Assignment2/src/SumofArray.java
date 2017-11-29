import java.util.Scanner;

public class SumofArray {
	public static void main(String args[]) {

int[] array = new int[10];
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter an array");

for(int i = 0;i<10;i++) {
	array[i] = sc.nextInt();
}
	for(int num : array) {
		sum=sum+num;
	}
	System.out.println("Sum of array is "+sum);
	} 
}


