import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String args[]) {
		
	      /*Creation of ArrayList: I'm going to add String elements so I made it of string type */
		
		  ArrayList<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  
		  obj.add("A");
		  obj.add("B");
		  obj.add("C");
		  obj.add("D");
		  obj.add("E");

		  /* Displaying array list elements */
		  
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  
		  obj.add(3, "F");
		  obj.add(4, "G");

		  /*Remove elements from array list like this*/
		  
		  obj.remove("D");
		  obj.remove("E");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  
		  obj.remove(0);

		  System.out.println("Current array list is:"+obj);
	   }
}
