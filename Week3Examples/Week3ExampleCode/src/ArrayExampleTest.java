import static org.junit.Assert.*;

import org.junit.Test;


public class ArrayExampleTest {

	@Test
	public void testExecute() {
		ArrayExample ae = new ArrayExample();
		ae.execute();
	}

	@Test
	public void testPlay() {
		ArrayExample ae = new ArrayExample();
		System.out.println("\nStarting play\n");
		ae.play();
	}

}
