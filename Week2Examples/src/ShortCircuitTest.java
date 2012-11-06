

public class ShortCircuitTest {

	public ShortCircuitTest() {
	}

	/**
	 * @param msg
	 *            to print to the console
	 * @return always true
	 */
	public boolean isTrue(String msg) {
		System.out.println("in isTrue   (arg = '" + msg + "')");
		return true;
	}

	/**
	 * 
	 * @param msg
	 *            to print to the console
	 * @return always false
	 */
	public boolean isFalse(String msg) {
		System.out.println("in isFalse   (arg = '" + msg + "')");
		return false;
	}

	private void firstFalseSecondTrueUsingOr() {
		if (isFalse("left") || isTrue("right")) {
			System.out.println("Expression is true.");
		} else {
			System.out.println("Expression is false.");
		}
		System.out.println("All done for firstFalseSecondTrueUsingOr.\n\n");
	}

	private void allTrueUsingOr() {
		if (isTrue("left") || isTrue("right")) {
			System.out.println("Expression is true.");
		} else {
			System.out.println("Expression is false.");
		}
		System.out.println("All done for allTrueUsingOr.\n\n");
	}

	private void firstFalseSecondTrueUsingAnd() {
		if (isFalse("left") && isTrue("right")) {
			System.out.println("Expression is true.");
		} else {
			System.out.println("Expression is false.");
		}
		System.out.println("All done for firstFalseSecondTrueUsingAnd.\n\n");
	}

	private void allTrueUsingAnd() {
		if (isTrue("left") && isTrue("right")) {
			System.out.println("Expression is true.");
		} else {
			System.out.println("Expression is false.");
		}
		System.out.println("All done for allTrueUsingAnd.\n\n");
	}

	/**
	 * Runs an example to test the different flavors of && and ||
	 * 
	 * @param args
	 *            not used at this time
	 */
	public static void main(String[] args) {
		ShortCircuitTest sct = new ShortCircuitTest();

		sct.allTrueUsingAnd();
		sct.firstFalseSecondTrueUsingAnd();
		sct.allTrueUsingOr();
		sct.firstFalseSecondTrueUsingOr();

	}
}
