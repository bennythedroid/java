/**
 *
 */

/**
 * @author appleman
 * 
 */
public class Snake extends Animal {
    String words = null;

    /**
     * @param string
     */
    public Snake(String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println("Speak=" + words);

    }
}
