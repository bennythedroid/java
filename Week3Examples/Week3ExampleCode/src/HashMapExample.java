import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	public void execute() {
		System.out.println("Collection HashMap Test");

		// create a collection
		HashMap hash = new HashMap();

		// Adding
		hash.put(new String("Harriet"), new String("Bone"));
		hash.put(new String("Bailey"), new String("Big Chair"));
		hash.put(new String("Max"), new String("Tennis Ball"));

		// Sizing
		System.out.println("Map created, size=" + hash.size() + ", isEmpty="
				+ hash.isEmpty());

		// Test Containment/access
		String key = new String("Harriet");
		if (hash.containsKey(key))
			System.out.println("Map access: key=" + key + ", value="
					+ (String) hash.get(key));

		// Iteration using keys and values
		System.out.println("Map iteration (keys):");
		Set keys = hash.keySet();
		Iterator iter = keys.iterator();
		while (iter.hasNext())
			System.out.println("   " + iter.next());

		// clear
		hash.clear();
		System.out.println("Map cleared, size=" + hash.size() + ", isEmpty="
				+ hash.isEmpty());
	}
}
