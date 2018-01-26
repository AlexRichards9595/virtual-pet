package virtualPet;

import org.junit.Test;
import org.junit.Assert;

public class VirtualPetTest {
	

	
	
	@Test
	public void shouldHaveInitialHunger() {
		// arange
		VirtualPet underTest = new VirtualPet();
		// act
		int hunger = underTest.getHunger();
		// assert
		Assert.assertEquals(50, hunger);
	}

	@Test
	public void shouldHaveInitialThirst() {
		// arange
		VirtualPet underTest = new VirtualPet();
		// act
		int thirst = underTest.getThirst();
		// assert
		Assert.assertEquals(50, thirst);
	}

	@Test
	public void shouldHaveInitialSleep() {
		// arange
		VirtualPet underTest = new VirtualPet();
		// act
		int sleep = underTest.getSleep();
		// assert
		Assert.assertEquals(50, sleep);
	}
	@Test
	public void shouldSubstractHunger() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int hunger = underTest.getHunger();
		underTest.tickHunger(hunger);
		int newHunger = underTest.getHunger();
		//assert
		Assert.assertEquals(hunger-3, newHunger);
	}
	@Test
	public void shouldSubstractThirst() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int thirst = underTest.getThirst();
		underTest.tickThirst(thirst);
		int newThirst = underTest.getThirst();
		//assert
		Assert.assertEquals(thirst-7, newThirst);
	}
	@Test
	public void shouldSubstractSleep() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int sleep = underTest.getSleep();
		underTest.tickSleep(sleep);
		int newSleep = underTest.getSleep();
		//assert
		Assert.assertEquals(sleep-10, newSleep);
	}
	
	@Test
	public void shouldAddHunger() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int hunger = underTest.getHunger();
		underTest.feed(hunger);
		int newHunger = underTest.getHunger();
		//assert
		Assert.assertEquals(hunger+5, newHunger);
	}
	
	@Test
	public void shouldAddThirst() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int thirst = underTest.getThirst();
		underTest.drink(thirst);
		int newThirst = underTest.getThirst();
		//assert
		Assert.assertEquals(thirst+10, newThirst);
	}
	@Test
	public void shouldAddSleep() {
		//arange
		VirtualPet underTest = new VirtualPet();
		//act 
		int sleep = underTest.getSleep();
		underTest.sleep(sleep);
		int newSleep = underTest.getSleep();
		//assert
		Assert.assertEquals(sleep+15, newSleep);
	}
}
