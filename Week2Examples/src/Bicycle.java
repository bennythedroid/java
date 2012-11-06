

class Bicycle {

	int cadence;
	int speed = 0;
	int gear = 1;

	public Bicycle() {
		this(0);
	}

	public Bicycle(int cadence) {
		this.cadence = cadence;
	}

	void changeCadence(int cadence) {
		this.cadence = cadence;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void changeGear(String newValue) {
		// gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:"
				+ gear);
	}
}
