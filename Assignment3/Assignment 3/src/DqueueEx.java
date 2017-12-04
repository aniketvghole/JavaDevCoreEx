import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DqueueEx {
	 public static void main(String[] args)
	    {
	        Deque deque = new LinkedList<>();
	 
	        // Add elements to the queue
	        
	        deque.add("B");  		// add to tail
	        deque.addFirst("A");
	        deque.addLast("D");
	        deque.push("C"); 		//add to head
	        
	        System.out.println(deque + "\n");
	        System.out.println();
	 
	        // Iterate through the queue elements.
	        
	        System.out.println("Standard Iterator");
	        System.out.println();
	        
	        Iterator iterator = deque.iterator();
	        while (iterator.hasNext())
	            System.out.println("\t" + iterator.next());
	        System.out.println();
	 
	 
	        // Reverse order iterator
	        
	        Iterator reverse = deque.descendingIterator();
	        System.out.println("Reverse Iterator \n");
	        while (reverse.hasNext())
	            System.out.println("\t" + reverse.next());
	        System.out.println();
	 
	        // Peek returns the head, without deleting it from the deque
	        
	        System.out.println("Peek (Head element) " + deque.peek());
	        System.out.println("After peek: " + deque);
	        System.out.println();
	 
	        // Pop returns the head, and removes it from the deque
	        
	        System.out.println("Pop (Head element) " + deque.pop());
	        System.out.println("After pop: " + deque);
	        System.out.println();
	 
	        // We can check if a specific element exists in the deque
	        
	        System.out.println("Contains element A : " + deque.contains("A"));
	        System.out.println();
	 
	        // We can remove the first / last element.
	        deque.removeFirst();
	        deque.removeLast();
	        System.out.println("Deque after removing "+"first and last: "+deque);
	 
	    }
}
