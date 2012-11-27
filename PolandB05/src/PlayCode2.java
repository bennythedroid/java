
public class PlayCode2 {
	public final static int ADD = 0;
    public final static int RELEASE_SIP = 1;
    public final static int SPILL = 2;

    private int totalCoffee;

    public int modify(int action, int amount) {
        int returnValue = 0;

        switch (action) {
        case ADD: // add amount of coffee
            add(amount);
            break; // return zero, but meaningless
        case RELEASE_SIP:
            returnValue = releaseSip(amount);
            break;
        case SPILL:
            returnValue = spill();
            break;
        default:
            break;
        }
        return returnValue;
    }

	private int spill() {
		int returnValue;
		returnValue = totalCoffee;
		totalCoffee = 0;
		return returnValue;
	}

	private int releaseSip(int amount) {
		int returnValue;
		int sip = amount;
		if (totalCoffee < amount)
		    sip = totalCoffee;
		totalCoffee -= sip;
		returnValue = sip;
		return returnValue;
	}

	private void add(int amount) {
		totalCoffee += amount;
	}
}
