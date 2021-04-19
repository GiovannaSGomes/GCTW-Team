package com.gctwteam.wallet;

public class Profile {
	private String name;
	private String username;
	private String email;
	private String[] bankAccounts;
	private String[] cards;
	private Earning earning;
	private Spending spending;
	private Profile balance;
	private Faq faq;
	
	public Earning getEarning() {
		return earning;
	}
	public void setEarning(Earning earning) {
		this.earning = earning;
	}
	public Spending getSpending() {
		return spending;
	}
	public void setSpending(Spending spending) {
		this.spending = spending;
	}
	public Faq getFaq() {
		return faq;
	}
	public void setFaq(Faq faq) {
		this.faq = faq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(String[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public String[] getCards() {
		return cards;
	}
	public void setCards(String[] cards) {
		this.cards = cards;
	}
	public Profile getBalance() {
		return balance;
	}
	public void setBalance(Profile balance) {
		this.balance = balance;
	}
	
	public float calculateBalance(float earning, float spending) {
		return earning - spending; 
	}
	
	public String getInfos(String field) {
		String value = "";
		switch (field) {
			case "Bank Accounts":
				for(int i = 0; i > bankAccounts.length; i++) {
					value = value + "," + bankAccounts[i];
				}
				break;
				
			case "cards":
				for(int i = 0; i > cards.length; i++) {
					value = value + "," + cards[i];
				}
				break;
				
			case "Faq":
				System.out.println(faq);
				break;
			case "Profile":
				value = "nome: " + name + "\n"
						+ "username: " + username + "\n"
						+ "email: " + email + "\n"
						+ "balance: " + balance;
		}
		return value;
	}
	
	
}