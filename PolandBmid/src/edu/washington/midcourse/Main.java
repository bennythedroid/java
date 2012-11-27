package edu.washington.midcourse;

import edu.washington.midcourse.util.Rot13;

public class Main {

	/**
	 * @param args
	 * This is the main method for the Rot13 application. We will take a string from the command line and
	 * 'encrypt' it by rotating it's ascii values 13 places through the alphabetic sequence a-z/A-Z.
	 */
	public static void main(String[] args) {
		//String string = args[0];
		if (args.length < 1) {
			System.out.println("Hey you need to provide a string");
		}else{
			Rot13.encrypt(args[0]);
		}
	}
}
