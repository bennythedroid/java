/**
 * Created by IntelliJ IDEA.
 * User: appleman
 * Date: Oct 20, 2009
 * Time: 2:06:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class BindingTest {
     Binding binding;
     Binding2 binding2;

    public  void printEnumCodeForBinding() {
        Binding3[] values = Binding3.values();

        for (int i = 0; i < values.length; i++) {
            Binding3 value = values[i];
            System.out.println("value = " + value + " - value.level = " + value.level);
        }
    }

    public  void printEnumValuesForBinding() {
        Binding[] values = Binding.values();

        for (int i = 0; i < values.length; i++) {
            Binding value = values[i];
            System.out.println("value = " + value);
        }
    }

    public  void printEnumValuesForBinding2() {
        Binding2[] values = Binding2.values();

        for (int i = 0; i < values.length; i++) {
            Binding2 value = values[i];
            System.out.println("value = " + value);
        }
    }

    public  void nonInitializedEnum() {
        System.out.println("binding = " + binding);
        binding = Binding.HIGH;
        System.out.println("binding = " + binding);
    }

    public  void lowerCaseEnum() {
        System.out.println("binding2 = " + binding2);
        binding2 = Binding2.MEDIUM;
        System.out.println("binding2 = " + binding2.toString());
    }
}

