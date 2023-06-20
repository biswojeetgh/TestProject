import java.util.HashMap;
import java.util.Map;
public class MapTest {
	public static void main(String[] args) {
	    // Create a map
	    Map<String, Integer> map = new HashMap<>();
	    map.put("A", 1);
	    map.put("B", 2);
	    map.put("C", 3);
	    System.out.println("Size: " + map.size());
	    System.out.println("Value of A: " + map.get("A"));
	    System.out.println("Value of B: " + map.get("B"));
	    System.out.println("Value of C: " + map.get("C"));
	    System.out.println("Value of D: " + map.get("D"));
	    map.remove("B");
	    System.out.println("Size after removing B: " + map.size());
	    System.out.println("Value of B after removal: " + map.get("B"));
	    map.clear();
	    System.out.println("Size after clearing: " + map.size());
	    System.out.println("Is map empty? " + map.isEmpty());
	   }
}
