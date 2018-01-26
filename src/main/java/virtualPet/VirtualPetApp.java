package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet();
		String userInput = "";

		System.out.println("Welcome to Digipet!");
		System.out.println("Your digipet is Steve the Sloth!\n");

		while (!myPet.isHeDead() && myPet.isItQuit(userInput)) {
			System.out.println("Steve the Sloth");
			System.out.println("Hunger: " + myPet.getHunger());
			System.out.println("Thirst: " + myPet.getThirst());
			System.out.println("Sleep: " + myPet.getSleep());
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. Feed Steve");
			System.out.println("2. Water Steve");
			System.out.println("3. Put Steve to sleep");
			System.out.println("4. Do nothing");
			System.out.println();
			userInput = input.nextLine();

			if (userInput.equals("1")) {
				myPet.feed();
			}
			if (userInput.equals("2")) {
				myPet.drink();
			}
			if (userInput.equals("3")) {
				myPet.sleep();
			}

			myPet.tick();

		}
		System.out.println("Game over. Goodbye...");

		input.close();

	}

}
