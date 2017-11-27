import java.util.Scanner; // Armstrong

public class Armstrong {

	public static void main(String args[])
    {
        int n, no, num=0, rem;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = sc.nextInt();
		
        no = n;
		
        while(no != 0)
        {
            rem = no%10;
            num = num + rem*rem*rem;
            no = no/10;
        }
        if(num == n)
        {
            System.out.print(" Is Armstrong ");
        }
        else
        {
            System.out.print("Not an Armstrong ");
        }
	
}
}
