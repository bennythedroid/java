/**
 *
 */

/**
 * @author appleman
 * 
 */
public class Dog extends Animal {
    String words = null;

    /**
     * @param string
     */
    public Dog(String words) {
        this.words = words;
    }

    public void speak() {
        System.out.println("Speak=" + words);

    }
}
