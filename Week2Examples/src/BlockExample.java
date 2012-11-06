

public class BlockExample {
	public void sampleBlock() {
		int x = 10;
		{
			// start of block
			int y = 50;
			System.out.println("Inside the block:");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}
}
