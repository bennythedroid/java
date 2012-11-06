package edu.washington.ext;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Character;
import java.lang.StringBuilder;

public class WordCounter {
	public Integer counter = 0;
	public String source;
	public HashSet<String> hashset;
	public StringBuilder word;
	public String uniqueword;

	public WordCounter(String source) {
		 counter = new Integer(counter);
	}
	public WordCounter(String source, StringBuilder word) {
		 counter = new Integer(counter);
	}
	public WordCounter(String source, String uniqueword) {
		counter = new Integer(counter);
	}
	/**
	 * 	
	 * @param line - the string parameter to get a total word count from.
	 */
	
	public int countWords(String source) {

		
		boolean word = false;
		int endOfLine = source.length() - 1;
		Integer counter = 0;
		
		for (int i = 0; i < source.length(); i++) {
			if (Character.isLetter(source.charAt(i)) == true && i != endOfLine) {
				word = true;
			//} else if (Character.charValue(line.charAt(i)) == "-" && i != endOfLine) {
			//	word = true;
			} else if (Character.isLetter(source.charAt(i)) == false && word == true) {
				counter++;
				word = false;
			} else if (Character.isLetter(source.charAt(i)) && i == endOfLine) {
				counter++;
			}
		}
		System.out.println(counter);
		return counter;
	}
			
	

	
/**
 * 
 * @param line - the string parameter that we will return the unique word count from. Randy recommends a HashSet.
 * Put it into a hashset. Hashsets don't allow duplicate elements. Then do a count. 
 */
	
	public int countUniqueWords(String line) {
		hashset = new HashSet<String>();
		word = new StringBuilder();
		int endOfLine = line.length() - 1;
		boolean isWord = false;
		String stringWord = null;
		Integer counter = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (Character.isLetter(line.charAt(i)) == true && i != endOfLine) {
				//System.out.println(i);
				word.append(line.charAt(i));
				isWord = true;
			} else if (Character.isLetter(line.charAt(i)) == false && isWord == true) {
				counter++;
				//System.out.println("Counter is: " + counter);
				stringWord = word.toString();
				//System.out.println("stringWord is now: " + stringWord);
				hashset.add(stringWord);
				//System.out.println(hashset);
				word = new StringBuilder();
				isWord = false;
			} else if (Character.isLetter(line.charAt(i)) && i == endOfLine) {
				counter++;
				stringWord = word.toString();
				hashset.add(stringWord);
			}
		}
		//System.out.println(counter);
		System.out.println("There are " + hashset.size() + " unique words in this string");
		System.out.println("These are the unique words in the string: " + hashset);
		return counter;
		
	}


/**
 * 
 * @param source - the string the word is to be counted from
 * @param word - the word to be counted
 * 
 */
	public void countWord(String source, String word) {

		String str = source;
		Pattern p = Pattern.compile("\\s"+word+"\\s");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()) {
			count++;
		}
		System.out.println("The word: " + "\"" + word + "\"" + " appears " + count + " times.");
		}
		
}