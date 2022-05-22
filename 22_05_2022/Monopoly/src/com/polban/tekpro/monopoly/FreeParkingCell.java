package com.polban.tekpro.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	@Override
	protected boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
