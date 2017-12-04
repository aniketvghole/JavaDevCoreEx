import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInt {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer,String>();

		mp.put(1,"java");// every key+value pair is stored against a hash code
		mp.put(2,"C++");
		mp.put(3,"Oracle");
		mp.put(4,".NET");
		mp.put(5,"yahoo");

		for (Iterator<Entry<Integer, String>> iterator = mp.entrySet().iterator(); iterator.hasNext();) 
		{
			Entry<Integer, String> m = iterator.next();
			System.out.println(m.getKey()+" "+ m.getValue());
		}

	}

}
