/**
 *
 */

/**
 * @author appleman
 * 
 */
public class Cow extends Animal {
    String words = null;

    /**
     * @param string
     */
    public Cow(String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println("Speak=" + words);

    }
}
