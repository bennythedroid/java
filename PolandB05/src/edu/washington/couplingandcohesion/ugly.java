package edu.washington.couplingandcohesion;
class Example1c {
    public static void main(String[] args) {
        // This is truely ugly
        SnowBoard.r = 10;
        Liquidc.convertOzToMl();
        int m10Oz = SnowFlying.s;
        System.out.println("Ml for 10 oz is: " + m10Oz);
    }
}

class Liquidc {
    private static final double ML_PER_OUNCE = 355.0 / 23.0;
    private static final double OUNCES_PER_ML = 12.0 / 355.0;

    public static void convertOzToMl() {
        double d = SnowBoard.r * ML_PER_OUNCE;
        d += 0.5; // round up
        SnowFlying.s = (int) d;
    }
}

class SnowBoard {
    public static int r;
    // ....
}

class SnowFlying {
    public static int s;
    // ....
}
