public class SmellyCodeTwo {
	double[] orders = new double[10];
	String name = "Theduke, Inc.";

	void initOrders() {
		for (int i = 0; i < 10; i++) {
			orders[i] = i * i * .5;
		}
	}

	void printOwing() {
		printBanner();
		double outstanding = calculateOutstanding(0.0);
		printDetails(outstanding);
	}

	private void printDetails(double outstanding) {
		// print details
		System.out.println("name  : " + name);
		System.out.println("amount: " + outstanding);
	}

	private double calculateOutstanding(double outstanding) {
		// calculate outstanding
		for (int i = 0; i < orders.length; i++) {
			outstanding += orders[i];
		}
		return outstanding;
	}

	private void printBanner() {
		// print banner
		System.out.println("********************************************");
		System.out.println("********** Customer Owes *******************");
		System.out.println("********************************************");
	}

	public static void main(String[] args) {
		SmellyCodeTwo sn = new SmellyCodeTwo();
		sn.initOrders();
		sn.printOwing();
	}

}
