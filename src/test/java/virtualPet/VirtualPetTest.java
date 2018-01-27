package virtualPet;

import org.junit.Test;
import org.junit.Assert;

public class VirtualPetTest {

	@Test
	public void shouldHaveInitialHunger() {

		VirtualPet underTest = new VirtualPet();

		int hunger = underTest.getHunger();

		Assert.assertEquals(20, hunger);
	}

	@Test
	public void shouldHaveInitialThirst() {

		VirtualPet underTest = new VirtualPet();

		int thirst = underTest.getThirst();

		Assert.assertEquals(20, thirst);
	}

	@Test
	public void shouldHaveInitialSleep() {

		VirtualPet underTest = new VirtualPet();

		int sleep = underTest.getSleep();

		Assert.assertEquals(20, sleep);
	}

	@Test
	public void shouldAddNeeds() {
		VirtualPet underTest = new VirtualPet();

		int hunger = underTest.getHunger();
		underTest.tick();
		int newHunger = underTest.getHunger();

		Assert.assertEquals(hunger + 2, newHunger);
	}

	@Test
	public void shouldSubtractHunger() {

		VirtualPet underTest = new VirtualPet();

		int hunger = underTest.getHunger();
		underTest.feed();
		int newHunger = underTest.getHunger();

		Assert.assertEquals(hunger - 8, newHunger);
	}

	@Test
	public void shouldSubtractThirst() {

		VirtualPet underTest = new VirtualPet();

		int thirst = underTest.getThirst();
		underTest.drink();
		int newThirst = underTest.getThirst();

		Assert.assertEquals(thirst - 12, newThirst);
	}

	@Test
	public void shouldSubtractSleep() {

		VirtualPet underTest = new VirtualPet();

		int sleep = underTest.getSleep();
		underTest.sleep();
		int newSleep = underTest.getSleep();

		Assert.assertEquals(sleep - 15, newSleep);
	}

	@Test
	public void checkForDeath() {

		VirtualPet underTest = new VirtualPet();

		int hunger = underTest.getHunger();
		int thirst = underTest.getThirst();
		int sleep = underTest.getSleep();
		boolean check = underTest.isHeDead();

		Assert.assertFalse(check);
	}

	@Test
	public void checkForQuit() {
		VirtualPet underTest = new VirtualPet();

		boolean check = underTest.isItQuit("quit");

		Assert.assertFalse(check);

	}

}
