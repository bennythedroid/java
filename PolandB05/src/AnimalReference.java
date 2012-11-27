public class AnimalReference {
    public static void main(String args[]) {
        Animal ref; // set up var for an Animal
        Cow aCow = new Cow("Bossy"); // makes specific objects
        Dog aDog = new Dog("Rover");
        Snake aSnake = new Snake("Earnie");

        // now reference each as an Animal
        ref = aCow;
        ref.speak();
        ref = aDog;
        ref.speak();
        ref = aSnake;
        ref.speak();
    }
}