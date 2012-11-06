//Lecture 3 - Demonstration of returning ( and passing ) an array.

public class ReturnArray {
	public void execute() {
		int[][] intArray = getArray();
		printOut(intArray);
	}

	public int[][] getArray() {
		int[][] array = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = 10 * (i + 1) + j;
			}
		}
		return array;
	}

	public void printOut(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if (j < array[i].length - 1)
					System.out.print(' ');
			}
			if (i < array.length - 1)
				System.out.println();
		}
	}

}