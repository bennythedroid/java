public class SmellyCodeOne {
	double[] orders = new double[10];
	String name = "Theduke, Inc.";

	/**
	 * this is init of orders
	 */
	void initOrders() {
		for (int i = 0; i < 10; i++) {
			orders[i] = i * i * .5;
		}
	}

	void printOwing() {
		double outstanding = 0.0;

		// print banner
		System.out.println("********************************************");
		System.out.println("********** Customer Owes *******************");
		System.out.println("********************************************");

		// calculate outstanding
		for (int i = 0; i < orders.length; i++) {
			outstanding += orders[i];
		}

		// print details
		System.out.println("name  : " + name);
		System.out.println("amount: " + outstanding);

	}


	public static void main(String[] args) {
		SmellyCodeOne sn = new SmellyCodeOne();
		sn.initOrders();
		sn.printOwing();
	}

}
