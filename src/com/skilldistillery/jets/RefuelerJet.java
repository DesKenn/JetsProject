package com.skilldistillery.jets;

public class RefuelerJet extends Jet implements Refueling{

	public RefuelerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		setModel(model);
		setSpeed(speed);
		setRange(range);
		setPrice(price);	}
	



	@Override
	public void fly() {
		double totalFlightTime = getRange() / getSpeed(); // Until fuel runs out
		System.out.println("Refueler jet info: model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange()
				+ ", price=" + getPrice());
		System.out.println("The " + getModel() + " runs out of fuel at " + totalFlightTime + "hours of flying.");		
	}

	@Override
	public void refuelJets() {
		System.out.println("The " + getModel() + " is now refueling other jets.");
		
	}

}