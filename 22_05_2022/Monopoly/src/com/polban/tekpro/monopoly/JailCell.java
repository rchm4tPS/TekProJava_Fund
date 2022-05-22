package com.polban.tekpro.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	
	public JailCell() {
		setName("Jail");
	}
	
	public void playAction() {
		
	}

	@Override
	protected boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
