package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

//	This class cannot have any additional fields

	private ArrayList<Jet> jets;

	// constructor
	public AirField() {

		jets = new ArrayList<>();

		// String model, double speed, int range, long price
		RefuelerJet rj = new RefuelerJet("KC-135", 400, 45, 200000);
		RefuelerJet rj2 = new RefuelerJet("KC-46", 800, 35, 250000);
		PassengerJet pj = new PassengerJet("Boeing", 100, 4530, 100000);
		CargoJet cj = new CargoJet("C-17", 300, 45, 300000);
		CargoJet cj2 = new CargoJet("C-130", 500, 65, 200000);

		jets.add(cj);
		jets.add(cj2);
		jets.add(rj);
		jets.add(rj2);
		jets.add(pj);

	}

	// Do not create a getJets() method.
	// add jet method that accepts an argument for a jet and adds it to the list.
	public void addJet(Jet newJet) {
		for (int i = 0; i < jets.size(); i++) {
			{
				jets.add(newJet);
				Jet last = jets.get(jets.size() - 1);

				System.out.println(last);
				return;
			}

		}

	}

	public void listJets() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i));
		}

	}

	public void flyAllJets() {

		for (int i = 0; i < jets.size(); i++) {
			jets.get(i).fly();

		}
	}

	public void fastestJet() {

		Jet fastestjet = jets.get(0);

		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestjet.getSpeed()) {
				fastestjet = jet;
			}
		}
		System.out.println("The fastest jet is " + fastestjet);


	}

	public void jetRange() {

		Jet jetRange = jets.get(0);

		for (Jet jet : jets) {

			if (jet.getRange() > jetRange.getRange()) {
				jetRange = jet;

			}
		}
		System.out.println(jetRange);
	}

	public void loadingCargo() {

		for (int i = 0; i < jets.size(); i++) {

			if (jets.get(i) instanceof Jet && jets.get(i) instanceof CargoJet) {

				System.out.println("The " + jets.get(i).getModel() + " is now loading cargo.");
			}
//			
//		
		}
	}
	public void RefuelingJets() {
		for (int i = 0; i < jets.size(); i++) {

			if (jets.get(i) instanceof Jet && jets.get(i) instanceof RefuelerJet) {

				System.out.println("The " + jets.get(i).getModel() + " is now refueling other jets.");
			}
//			
//		
		}
	}

	public void jetMenu() {
        System.out.println("Jet Fleet:");
        for (int i = 0; i < jets.size(); i++) {
            System.out.println((i ) + ". " + jets.get(i).getModel());
        }

	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}

}
