public class BeerSongTwo {
	private int beerNum = 99;
	private String word = "bottles";

	public static void main(String[] args) {
		new BeerSongTwo().execute();
	}

	public void execute() {
		while (beerNum > 0) {
			printOne();
			beerNum = beerNum - 1;
			checkSingular();
			printLastMsg();
		}
	}

	private void printLastMsg() {
		if (beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
		} else {
			System.out.println("No more bottles of beer on the wall");
		}
		System.out.println("");
	}

	private void printOne() {
		System.out.println(beerNum + " " + word + " of beer on the wall");
		System.out.println(beerNum + " " + word + " of beer ");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
	}

	private void checkSingular() {
		if (beerNum == 1) {
			word = "bottle"; // singular, as in ONE bottle.
		}
	}

}
