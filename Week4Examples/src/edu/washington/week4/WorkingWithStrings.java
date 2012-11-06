package edu.washington.week4;

public class WorkingWithStrings {
	public static void main(String[] args) {
		(new WorkingWithStrings()).executeTests();
	}

	private  void executeTests() {
		stringTestOne();
		stringTestTwo(); 
		stringTestThree();
		stringTestFour();
		stringBufferTestOne();
	}

	private  void stringTestOne() {
		String textone = "Java";
		String texttwo = textone;
		boolean result = (textone == texttwo);
		// result is true
		System.out.println("stringTestOne: result = " + result);
	}
	
	private  void stringTestTwo() {
		String textone = "Java";
		String texttwo = "Java";
		boolean result = textone.equals(texttwo);
		System.out.println("stringTestTwo: result = " + result);
	}

	private  void stringTestThree() {
		String textone = "Java"; 
		String texttwo = new String("Java");
		boolean result = (textone == texttwo); 
		System.out.println("stringTestThree: result = " + result);
		//result is false
	}
	
	private void stringTestFour() {
		String textone = "Java";
		String texttwo = "Java";
		boolean result = (textone == texttwo);
		System.out.println("stringTestFour: result = " + result);
	}

	private void stringBufferTestOne() {
		String one = "This"+"is"+"my"+"tests";
		String two = (new StringBuffer()).append("This").append("is").append("my").append("tests").toString();
		System.out.println("One="+one);
		System.out.println("two="+two);
	}
}
