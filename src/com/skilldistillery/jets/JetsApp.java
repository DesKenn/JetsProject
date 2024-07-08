package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApp {
	// two fields max

	private AirField airfield = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launchApp();

	}

	public void launchApp() {

		boolean keepGoing = true;

		while (keepGoing) {

			System.out.println("Jet Action Menu");
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Refuel jets");
			System.out.println("7. Add a jet to Fleet ");
			System.out.println("8. Remove a jet from Fleet ");
			System.out.println("9. Quit ");

			int userChoice = kb.nextInt();
			Jet newJet;

			switch (userChoice) {
			case 1:
				airfield.listJets();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				airfield.fastestJet();
				break;
			case 4:
				airfield.jetRange();
				break;
			case 5:
				airfield.loadingCargo();
				break;
			case 6:
				airfield.RefuelingJets();
				break;
			case 7:

				System.out.println(
						"Pick 1 to add a Refueling jet " + ", pick 2 for a Cargo jet OR 3 for a Passenger Jet.");
				int userJetPick = kb.nextInt();

				System.out.print("Enter model: ");
				String model = kb.next();

				System.out.print("Enter speed in MPH: ");
				double speed = kb.nextDouble();

				System.out.print("Enter range in miles: ");
				int range = kb.nextInt();

				System.out.print("Enter price: ");
				Long price = kb.nextLong();

				switch (userJetPick) {

				case 1:
					newJet = new RefuelerJet(model, speed, range, price);
					newJet.setModel(model);
					newJet.setSpeed(speed);
					newJet.setRange(range);
					newJet.setPrice(price);
					airfield.addJet(newJet);
					break;
				case 2:
					newJet = new CargoJet(model, speed, range, price);
					newJet.setModel(model);
					newJet.setSpeed(speed);
					newJet.setRange(range);
					newJet.setPrice(price);
					airfield.addJet(newJet);
					break;
				case 3:
					newJet = new PassengerJet(model, speed, range, price);
					newJet.setModel(model);
					newJet.setSpeed(speed);
					newJet.setRange(range);
					newJet.setPrice(price);
					airfield.addJet(newJet);

					break;
				default:
					System.err.println("Please pick a number 1-3.");
					break;
				}
				break;
			case 8:
				airfield.jetMenu();
				ArrayList<Jet> jetArray = airfield.getJets();

				if (jetArray.size() <= 0) {
					System.out.println("All of the jets are removed");
					break;
				}

				System.out.println("Select a jet to remove (enter the number corresponding to the jet):");
				int jetToRemove =  kb.nextInt()- 1 ;

				if (jetToRemove > jetArray.size() - 1 || jetToRemove < -1) {
					System.out.println("The selected number is not in range");
					kb.nextLine();

				}
				jetArray.remove(jetToRemove);
				System.out.println(jetArray.get(jetToRemove) + " has been removed from the fleet.");

				break;
			case 9:
				System.out.println("Exiting Jet Action Menu");
				keepGoing = false;
				break;
			default:
				System.err.println("Please input a number 1-9.");

				break;

			}
		}
		kb.close();
	}
}