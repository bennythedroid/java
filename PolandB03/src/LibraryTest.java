
import org.junit.Test;


/**
*
* @author appleman
*/
public class LibraryTest {
	Library library;

    @Test
    public void printTest() {
        addSomeEntries();
        printSomeEntries();
        returnSomeItems();
        printSomeEntries();
    }

    void addSomeEntries() {
    	library = new Library("1", "2");
        library.checkoutBook("000", "Cay Horstman");
        library.checkoutBook("000", "Sharron Morrow");
        library.checkoutBook("001", "Gail House");
        library.checkoutBook("001", "Julie Hill");
        library.checkoutBook("002", "Jimmy Dean");
        library.checkoutBook("002", "Sherry Crow");
        System.out.println(library.multimap);
    }

    void printSomeEntries() {
        library.printCheckoutBooksByIsbn("000");
        library.printCheckoutBooksByIsbn("001");
        library.printCheckoutBooksByIsbn("002");
    }

    void returnSomeItems() {
        library.returnBook("001", "Gayle Walker");
        library.returnBook("001", "Julie Hill");
        library.printCheckoutBooksByIsbn("001");

    }

}
