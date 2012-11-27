package edu.washington.midcourse.util;

/**
 * 
 * @author bpoland
 * Class containing the method that will encrypt the string.
 *
 */
public class Rot13 {
/**
 * 
 * @param string - this will be the string that we pass to the main method in the Main class from the command line.
 * We will create a new StringBuilder that will allow us to build a new string based on the rotated ascii values from 
 * the original string. The rotation is accomplished by an enhanced for loop, which will first put our string into a charArray,
 * which will allow us to individually deal with the characters' ascii values. If the character is between 65 and 90 on the
 * ascii chart, putting it in the range of A-Z, we'll increase its value by 13. If doing so puts the value of the character 
 * beyond Z and thus no longer a capital letter, we'll decrease its value by 26 to put it back in range of A-Z and simulating
 * a loop back through that range. It is the same concept in the else if for any letter character between a-z.
 * Each character is then appended to our StringBuilder.
 * @return - the char array data within out StringBuilder is then returned as a String.
 */
	public static String encrypt(String string) {
		StringBuilder returnValue = new StringBuilder();
		for (char a : string.toCharArray()) {
			if (a >= 'A' && a <= 'Z') {
				a += 13;
				if (a > 'Z') {
					a -= 26;
				}
			} else if (a >= 'a' && a <= 'z') {
				a +=13;
				if (a > 'z') {
					a -= 26;
				}
			}
			returnValue.append(a);
		}
		System.out.println(returnValue);
		return returnValue.toString();
	}
}
