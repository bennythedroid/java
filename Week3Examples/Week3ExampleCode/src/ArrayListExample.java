import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListExample {
	public void execute() {
		System.out.println("Testing the ArrayList - List");

		// create a collection
		ArrayList list = new ArrayList();

		// Adding
		String[] toys = { "Shoe", "Ball", "Frisbee" };
		list.addAll(Arrays.asList(toys));

		// Sizing
		System.out.println("List created, size=" + list.size() + ", isEmpty="
				+ list.isEmpty());

		// Iteration using indexes
		System.out.println("List iteration (unsorted):");
		for (int i = 0; i < list.size(); i++)
			System.out.println("   " + list.get(i));

		// Reverse Iteration using ListIterator
		System.out.println("List iteration (reverse):");
		ListIterator iterator = list.listIterator(list.size());
		while (iterator.hasPrevious())
			System.out.println("   " + iterator.previous());

		// Remove
		list.remove(0);
		System.out.println("List deleting 0 index:");
		System.out.println("    " + list);
		list.clear();
	}
}
