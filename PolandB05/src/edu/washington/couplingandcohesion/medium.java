package edu.washington.couplingandcohesion;
class CoffeeCup2 {
    private int totalCoffee;

    public void add(int amount) {
        totalCoffee += amount;
    }

    public int remove(boolean all, int amount) {
        int returnValue = 0;

        if (all) {
            returnValue = totalCoffee;
            totalCoffee = 0;
        } else {
            int sip = amount;
            if (totalCoffee < amount)
                sip = totalCoffee;
            totalCoffee -= sip;
            returnValue = sip;
        }
        return returnValue;
    }
}
