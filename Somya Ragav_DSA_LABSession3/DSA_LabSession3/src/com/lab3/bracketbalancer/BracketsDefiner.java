package com.lab3.bracketbalancer;

public class BracketsDefiner {
	
	private Character openChar;
	private Character closeChar;
	
	public BracketsDefiner(Character openChar, Character closeChar) {
		
		this.openChar = openChar;
		this.closeChar = closeChar;
	}
	
	public Character getOpenChar() {
		return openChar;
	}
	public void setOpenChar(Character openChar) {
		this.openChar = openChar;
	}
	public Character getCloseChar() {
		return closeChar;
	}
	public void setCloseChar(Character closeChar) {
		this.closeChar = closeChar;
	}
}



