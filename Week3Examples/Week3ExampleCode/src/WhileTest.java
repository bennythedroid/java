//: control/WhileTest.java
// Demonstrates the while loop.

public class WhileTest {
	 boolean condition() {
		boolean result = Math.random() < 0.90;
		System.out.print(result + ", ");
		return result;
	}

	public void execute() {
		while (condition())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
	}

	public  void execute2() {
		int tester = 6;
		while ((tester = getNewTester()) == 6) {
			System.out.println("tester");
		}
	}

	public  int getNewTester() {
		return 5;
	}

	public static void main(String[] args) {
		new WhileTest().execute();
		new WhileTest().execute2();
		System.out.println("Finished");
	}

} /* (Execute to see output) */// :~
