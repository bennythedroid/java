
public class Dog {
	private int counter = 0;

	
	public Dog() {
		this(0);
	}
	
	public Dog(int counter1) {
		counter = counter1;
		{ 
			{
				{
					int counter = 6;
					this.counter++;
					if (true) {
						
					}
				}
			}
		}
	}

	public int getCounter() {
		return counter;
	}

	public void bark() {
		System.out.println("Woff Woff"+counter);
		boolean temp = true;
		boolean temp1 = temp;
	}
	public void bark(int count) {
		counter = count;
		System.out.println("Woff Woff"+counter);
	}
}
