/**
 * Created by IntelliJ IDEA.
 * User: appleman
 * Date: Oct 20, 2009
 * Time: 2:44:44 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Binding3 {

    LOW(0), MEDIUM(1), HIGH(2); //; is optional

    int level = 0;

    Binding3(int level) {
        this.level = level;
    }
    

    public String toString() {
        return super.toString().toLowerCase();
    }
}
