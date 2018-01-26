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

	public int tickHunger(int incomingHunger) {
		hunger = incomingHunger - 3;
		return hunger;

	}

	public int tickThirst(int incomingThirst) {
		thirst = incomingThirst - 7;
		return thirst;
	}

	public int tickSleep(int incomingSleep) {
		sleep = sleep - 10;
		// sleep = incomingSleep - 10;
		return sleep;
	}

	public int feed(int incomingHunger) {
		hunger = incomingHunger + 5;
		return hunger;
	}

	public int drink(int incomingThirst) {
		thirst = incomingThirst + 10;
		return thirst;
	}

	public int sleep(int incomingSleep) {
		sleep = incomingSleep + 15;
		return sleep;
	}

	public boolean isHeDead(int incomingHunger, int incomingThirst, int incomingSleep) {
		if (incomingHunger > 0 && incomingThirst > 0 && incomingSleep > 0) {
			return true;
		}
		return false;
	}

	public boolean isItQuit(String string) {
		if (string.equalsIgnoreCase("quit")) {
			return false;
		}
		return true;
	}
	
//	public void tick() {
//		sleep -= 10;
//		hunger -= 10;
//	}

}
