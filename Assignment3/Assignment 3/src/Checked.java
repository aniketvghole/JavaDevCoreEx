import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner ;


public class Checked 
{

	public static void main(String[] args) 
	{
		System.out.println("hi	");
		displayFile("HELLO.text");
	}
	public static void displayFile(String name) 
{
	//open the file
	File file=new File(name);
	Scanner inputFile=null;
	try
	{
		System.out.println("1");
		inputFile= new Scanner(file);
		while (inputFile.hasNext())
		System.out.println(inputFile.nextLine());

	}
	catch(FileNotFoundException ex)
	{
		System.out.println("2");
		System.out.println(ex.getMessage());
	}
		// close the file
	inputFile.close();
	System.out.println("3");	
}
}
