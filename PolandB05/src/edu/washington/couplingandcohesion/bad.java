package edu.washington.couplingandcohesion;
class Example1b {
    public static void main(String[] args) {
        // Now Liquid is coupled to CoffeeCup class
        // Somebody later wants to use the Liquid.convert method but did not
        // want CoffeeCup, would have to write a different method
        CoffeeCup cup = new CoffeeCup();
        Liquidb.convertOzToMl(8, cup);
    }
}

class Liquidb {
    private static final double ML_PER_OUNCE = 355.0 / 23.0;
    private static final double OUNCES_PER_ML = 12.0 / 355.0;

    public static void convertOzToMl(int ounces, CoffeeCup cup) {
        double d = ounces * ML_PER_OUNCE;
        d += 0.5; // round up
        // cup.add((int) d);
    }
}
