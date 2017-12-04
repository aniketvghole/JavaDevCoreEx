import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String args[]) {

	       /* Linked List Declaration */
		
	       LinkedList<String> obj = new LinkedList<String>();

	       /*add(String Element) is used for adding the elements to the linked list*/
	       
	       obj.add("1");
	       obj.add("2");
	       obj.add("3");
	       obj.add("4");
	       obj.add("5");

	       /*Display Linked List Content*/
	       
	       System.out.println("Linked List Content: " +obj);
	       System.out.println();

	       /*Add First and Last Element*/
	       
	       obj.addFirst("A");
	       obj.addLast("E");
	       
	       System.out.println("LinkedList Content after addition: " +obj);
	       System.out.println();

	       /*This is how to get and set Values*/
	       
	       Object firstvar = obj.get(0);
	       System.out.println("First element: " +firstvar);
	       System.out.println();
	       obj.set(0, "Z");
	       
	       Object firstvar2 = obj.get(0);
	       System.out.println("First element after update by set method: " +firstvar2);
	       System.out.println();

	       /*Remove first and last element*/
	       
	       obj.remove(1);
	       obj.remove(5);
	       
	       System.out.println("LinkedList after deletion element: " +obj);
	       System.out.println();

	       /* Add to a Position and remove from a position*/
	       
	       obj.add(0, "X");
	       obj.remove(3);
	       
	       System.out.println("Final Content: " +obj); 
	     }
}
