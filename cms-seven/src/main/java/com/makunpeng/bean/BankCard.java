package com.makunpeng.bean;

public class BankCard {
	private String carId;
	private String cardName;
	public BankCard() {
		// TODO Auto-generated constructor stub
		super();
	}
	public BankCard(String carId, String cardName) {
		super();
		this.carId = carId;
		this.cardName = cardName;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	@Override
	public String toString() {
		return "BankCard [carId=" + carId + ", cardName=" + cardName + "]";
	}

}
