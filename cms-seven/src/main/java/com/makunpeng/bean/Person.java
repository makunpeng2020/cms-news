package com.makunpeng.bean;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private String card;
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	private List<BankCard> bankCards;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BankCard> getBankCards() {
		return bankCards;
	}
	public void setBankCards(List<BankCard> bankCards) {
		this.bankCards = bankCards;
	}
	
	public Person(int id, String name, String card, List<BankCard> bankCards) {
		super();
		this.id = id;
		this.name = name;
		this.card = card;
		this.bankCards = bankCards;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", card=" + card + ", bankCards=" + bankCards + "]";
	}
}
