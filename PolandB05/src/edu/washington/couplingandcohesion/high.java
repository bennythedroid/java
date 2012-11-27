package edu.washington.couplingandcohesion;
class CoffeeCup3 {
    private int totalCoffee;

    public void add(int amount) {
        totalCoffee += amount;
    }

    public int oneSip(int sipSize) {
        int sip = sipSize;

        if (totalCoffee < sipSize)
            sip = totalCoffee;
        totalCoffee -= sip;
        return sip;
    }

    public int spillEntireContents() {
        int all = totalCoffee;
        totalCoffee = 0;
        return all;
    }
}
