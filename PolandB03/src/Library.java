/*
 * Add the appropriate import statements.
Complete the declaration of the checkoutBooks HashMap. Use generics to specify the key and value types. In this case, the key is isbn number of book and value is an list of 1 or more patrons that have borrowed this book.
Implement the constructor to initialize the HashMap.
Implement the checkoutBook(String,String) method. This is an isbn for book and one patron thats checking it out
Define and implement the checkoutBook(String,String variable argument list) method declaration and implement the method. This is an isbn for a book and any number of patrons that are checking it out.
Define and Implement the returnBook(String,String) method. Is isbn for book and person return the book
Define and Implement the printCheckoutBooksByIsbn(String) method by isbn number only
Optional, Define and implement printAllCheckoutBooks() method
Verification Verify the Library class works properly using an java test file. Create a junit V4 file in the source folder, named LibraryTest. Minimally, see the following at Code Block - Verification Code just below assignment 3 on main page. This can be copy/paste into LibraryTest file/class.
 */
// Add the appropriate imports

import java.util.*;
import com.google.common.collect.*;

/**
*
* @author appleman modified by ben poland
* I would like to point out that for this assignment, I strayed from using only hashmaps. I used this as an opportunity
* to dig into the google guava libraries for the first time, and used the multimap class for a MUCH simpler 
* implementation of these methods. Let me say I'm very impressed by these libraries and look forward to digging into
* resources like this in the future.
*/
public class Library {
String book;
String person;
HashMap<String, ArrayList<String>> checkoutBooks;
ListMultimap<String, String> multimap = ArrayListMultimap.create();

/**
 * 
 * @param book  - a string for the isbn
 * @param person   - a string for the patron
 * I thought I would need two different constructors. Turns out I only need the first, with a simple instantiation of 
 * a hashmap.
 */
	public Library(String book, String person) {
		checkoutBooks = new HashMap();
	}
	
	public Library(String book, ArrayList<String> person) {
		checkoutBooks = new HashMap();
	}
/**
 * 
 * @param book
 * @param person
 * to checkout a book for a patron. They are entered into the map as a key value pair.
 */
	public void checkoutBook(String book, String person) {
		multimap.put(book, person);
	}
/**
 * 
 * @param book
 * @param person
 * takes the book being returned and the patron returning it and removes them from the map.
 */
    public void returnBook(String book, String person) {
    	multimap.remove(book, person);
    	System.out.println("The book with the following isbn was returned: " + book + " by this person: " + person);
    }
/**
 * 
 * @param book
 * This method does a get from the map and returns all patrons who have that isbn checked out based on the key (book)
 * provided.
 */
    public void printCheckoutBooksByIsbn(String book) {
    	List<String> x = multimap.get(book);
    	System.out.println("Book with isbn: " + book + " is checked out to the following: " + x);
    }  
}
