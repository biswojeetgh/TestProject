import java.util.*;
public class CollectionTest {
	public static void main(String args[]) {
		Collection<String> collection=new ArrayList<>();
		collection.add("Item1");
		collection.add("Item2");
		collection.add("Item3");
		System.out.println("Collection Size:"+collection.size());
		System.out.println("Contains Item 2:"+collection.contains("Item2"));
		collection.remove("Item2");
		System.out.println("After removing Item2,Collection size:"+collection.size());
		System.out.println("Is collection empty?:"+collection.isEmpty());
		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
