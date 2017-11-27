import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        
        float first = reader.nextFloat();
        float second = reader.nextFloat();

        System.out.print("Enter an operator +, -, *, /  ");
        char operator = reader.next().charAt(0);

        float result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            
            default:
                System.out.print("Error! operator is not correct");
                return;
        }

        System.out.println(first+" "+operator+" "+second+"="+result);
    }
	
}
