package edu.washington.couplingandcohesion;

class CoffeeCup {
    public final static int ADD = 0;
    public final static int RELEASE_SIP = 1;
    public final static int SPILL = 2;

    private int totalCoffee;

    public int modify(int action, int amount) {
        int returnValue = 0;

        switch (action) {
        case ADD: // add amount of coffee
            totalCoffee += amount;
            break; // return zero, but meaningless
        case RELEASE_SIP:
            int sip = amount;
            if (totalCoffee < amount)
                sip = totalCoffee;
            totalCoffee -= sip;
            returnValue = sip;
            break;
        case SPILL:
            returnValue = totalCoffee;
            totalCoffee = 0;
            break;
        default:
            break;
        }
        return returnValue;
    }
}
