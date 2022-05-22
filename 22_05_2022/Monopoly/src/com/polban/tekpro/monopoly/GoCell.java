package com.polban.tekpro.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	@Override
	protected boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
