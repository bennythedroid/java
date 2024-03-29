package edu.washington.ext;



public class WordCounterApp {
	
	/**
	 * @param args
	 * Two command line arguments: the first one needs to be in quotes, the string that will be used, the second optional argument
	 * is the unique word to be counted (countWord method).
	 * @param source 
	 * @param word 
	 */
	public static void main(String[] args) {
		String source = null;
		String uniqueword = null;
		StringBuilder word = null;
		WordCounter count = new WordCounter(source);
		WordCounter counter = new WordCounter(source, word);
		WordCounter uniqueCounter = new WordCounter(source, uniqueword);
		count.countWords(source);
		counter.countUniqueWords(source);
		uniqueCounter.countWord(source, uniqueword);
		
}

}