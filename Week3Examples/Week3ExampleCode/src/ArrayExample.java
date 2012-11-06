class ArrayExample {
	public void execute() {
		char[] intArray = new char[5];

		// what do array elements get initialized to here?
		for (int i = 0; i < intArray.length; i++)
			System.out.println("intArray " + i + ": " + (int) intArray[i]);

		// now we're explicitly setting them to some values
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = (char) (i * 48);

		// what are elements now?
		for (int i = 0; i < intArray.length; i++)
			System.out.println("intArray " + i + ": " + intArray[i]);

		String[] stringArray = new String[5];

		// now we have an array of Objects (really references to Objects)
		// what do array elements get initialized to here?
		for (int i = 0; i < stringArray.length; i++)
			System.out.println("stringArray " + i + ": " + stringArray[i]);

		// now we're explicitly setting them to some values
		for (int i = 0; i < stringArray.length; i++)
			stringArray[i] = "element # " + i;

		// what are elements now?
		for (int i = 0; i < stringArray.length; i++)
			System.out.println("stringArray " + i + ": " + stringArray[i]);
	}

	void play() {
		String[][] names = new String[5][];
		for (int i = 0; i < names.length; i++) {
			names[i] = new String[i+1];
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println("Size = "+names[i].length);
		}

	}
	public static void main(String[] args) {
	   new ArrayExample().play();
	}
}
