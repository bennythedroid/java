package edu.washington.ext;

import org.junit.Test;

public class WordCounterTest {

	WordCounter wordcounter;
	
	@Test
    public void printTest() {
        testWordCounter();
        testUniqueWordCounter();
        testWordCount();
    }
	
	public void testWordCounter() {
		wordcounter = new WordCounter();
		wordcounter.countWords("We hold these truths to be selfevident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty, and the pursuit of Happiness. That to secure these rights, Governments are instituted among Men, deriving their just powers from the consent of the governed. That whenever any Form of Government becomes destructive of these ends, it is the Right of the People to alter or to abolish it, and to institute new Government, laying its foundation on such principles and organizing its powers in such form, as to them shall seem most likely to effect their Safety and Happiness.");
	}
	

	public void testUniqueWordCounter() {
		wordcounter = new WordCounter();
		wordcounter.countUniqueWords("We hold these truths to be selfevident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty, and the pursuit of Happiness. That to secure these rights, Governments are instituted among Men, deriving their just powers from the consent of the governed. That whenever any Form of Government becomes destructive of these ends, it is the Right of the People to alter or to abolish it, and to institute new Government, laying its foundation on such principles and organizing its powers in such form, as to them shall seem most likely to effect their Safety and Happiness.");
	}

	
	public void testWordCount() {
		wordcounter = new WordCounter();
		wordcounter.countWord("We hold these truths to be selfevident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty, and the pursuit of Happiness. That to secure these rights, Governments are instituted among Men, deriving their just powers from the consent of the governed. That whenever any Form of Government becomes destructive of these ends, it is the Right of the People to alter or to abolish it, and to institute new Government, laying its foundation on such principles and organizing its powers in such form, as to them shall seem most likely to effect their Safety and Happiness.", "to");
	}

}
