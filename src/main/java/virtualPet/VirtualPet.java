package virtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int sleep;

	public int getHunger() {
		return hunger;
	}

	public VirtualPet() {
		hunger = 20;
		thirst = 20;
		sleep = 20;
	}

	public int getThirst() {
		return thirst;
	}

	public int getSleep() {
		return sleep;
	}

	public void feed() {
		if (hunger - 8 < 0) {
			hunger = 0;
		} else {
			hunger -= 8;
			thirst += 2;
			sleep += 1;
		}
	}

	public void drink() {
		if (thirst - 12 < 0) {
			thirst = 0;
		} else {
			thirst -= 12;
			hunger += 2;
		}
	}

	public void sleep() {
		if (sleep - 15 < 0) {
			sleep = 0;
		} else {
			sleep -= 15;
			thirst -= 2;
		}

	}

	public boolean isHeDead() {
		if (hunger < 100 && thirst < 100 && sleep < 100) {
			return false;
		}
		return true;
	}

	public boolean isItQuit(String string) {
		if (string.equalsIgnoreCase("quit")) {
			return false;
		}
		return true;
	}

	public void tick() {
		hunger += 2;
		thirst += 3;
		sleep += 4;
	}

}
