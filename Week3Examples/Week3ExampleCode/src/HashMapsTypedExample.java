import java.util.HashMap;

public class HashMapsTypedExample {
	public void execute() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("speed", 20);
		System.out.println("hm=" + hm);
		System.out.println("speed="+hm.get("speed"));
		System.out.println("nokey="+hm.get(""));
	}
}
