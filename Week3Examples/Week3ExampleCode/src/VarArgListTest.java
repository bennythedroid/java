public class VarArgListTest {
	public void dumpList(int... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("i=" + n[i]);
		}
		System.out.println("\n------\n");
		for (int i : n) {
			System.out.println("i=" + i);
		}
	}

	public void execute() {
		int[] parmArray = { 3, 1, 2, 3 };
		dumpList(parmArray);

	}
}
