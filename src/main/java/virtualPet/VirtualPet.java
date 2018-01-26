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
		sleep = incomingSleep - 10;
		return sleep;
	}

	public int feed(int incomingHunger) {
		hunger = incomingHunger + 5;
		return hunger;
	}

	public int drink(int incomingThirst) {
		thirst = incomingThirst+10;
		return incomingThirst;
	}

	public int sleep(int incomingSleep) {
		sleep = incomingSleep+15;
		return sleep;
	}

}
