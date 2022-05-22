package com.polban.tekpro.monopoly;

public class CardCell extends Cell {
    private int type;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public void playAction() {
    }
    
    public int getType() {
        return type;
    }

	@Override
	protected boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}
