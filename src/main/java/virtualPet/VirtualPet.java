package virtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int sleep;

	public int getHunger() {
		return hunger;
	}

	public VirtualPet() {
		hunger = 50;
		thirst = 50;
		sleep = 50;
	}

	public int getThirst() {
		return thirst;
	}

	public int getSleep() {
		return sleep;
	}

	public void feed() {
		hunger += 5;
	}

	public void drink() {
		thirst += 10;
	}

	public void sleep() {
		sleep += 15;

	}

	public boolean isHeDead() {
		if (hunger > 0 && thirst > 0 && sleep > 0) {
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
		hunger -= 2;
		thirst -= 4;
		sleep -= 5;
	}

}
