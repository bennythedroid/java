/**
 * Created by IntelliJ IDEA.
 * User: appleman
 * Date: Oct 20, 2009
 * Time: 2:25:51 PM
 * To change this template use File | Settings | File Templates.
 */
public enum Binding2 {

    LOW,
    MEDIUM,
    HIGH; //; is optional

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
