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
		PassengerJet pj = new PassengerJet("Boeing", 100, 4530, 100000);
		CargoJet cj = new CargoJet("C-17", 300, 45, 300000);

		jets.add(cj);
		jets.add(cj);
		jets.add(rj);
		jets.add(rj);
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
}
