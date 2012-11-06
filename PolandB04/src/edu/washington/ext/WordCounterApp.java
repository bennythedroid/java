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
		WordCounter wordcounter = new WordCounter();
		String source = args[0];
		String uniqueword = args[0];
		if(args.length > 0)
			source = args[0];
		if(args.length > 1){
			uniqueword = args[1];
		}else{
			uniqueword = null;
		}
		if(source != null)
			wordcounter.countWords(source);
			wordcounter.countUniqueWords(source);
		if(source != null && uniqueword != null)
			wordcounter.countWord(source, uniqueword);
		
		
		//WordCounter counter = new WordCounter(source, word);
		//WordCounter uniqueCounter = new WordCounter(source, uniqueword);
		//counter.countWords(source);
		//counter.countUniqueWords(source);
		//uniqueCounter.countWord(source, uniqueword);
}

}