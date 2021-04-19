package com.gctwteam.wallet;

public class Profile {
	private String name;
	private String username;
	private String email;
	private BankAccount[] bankAccounts;
	private Card[] cards;
	private Earning earnings[];
	private Spending spendings[];
	private double balance;
	private Faq faq;
	
	public Earning[] getEarnings() {
		return earnings;
	}
	public void setEarnings(Earning[] earnings) {
		this.earnings = earnings;
	}
	public Spending[] getSpendings() {
		return spendings;
	}
	public void setSpendings(Spending[] spendings) {
		this.spendings = spendings;
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
	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double calculateBalance() {
		double accountsBalance = 0;
		double finalEarnings = 0;
		double finalSpendings = 0;
		
		for (int i = 0; i < bankAccounts.length; i++) {
			accountsBalance = accountsBalance + bankAccounts[i].getInitialBalance();
		}
		
		for (int i = 0; i < earnings.length; i++) {
			finalEarnings = finalEarnings + earnings[i].getValue();
		}
		
		for (int i = 0; i < spendings.length; i++) {
			finalSpendings = finalSpendings + spendings[i].getValue();
;		}
		
		return finalEarnings - finalSpendings + accountsBalance; 
	}
	
	public String getInfos(String field) {
		String value = "";
		switch (field) {
			case "Bank Accounts":
				for(int i = 0; i < bankAccounts.length; i++) {
					value = value + bankAccounts[i].getInstitution()
							+ "\nSaldo inicial: " + bankAccounts[i].getInitialBalance()
							+ "\nTipo: " + bankAccounts[i].getType()
							+ "\n\n";
				}
				break;
				
			case "Cards":
				for(int i = 0; i < cards.length; i++) {
					value = value + cards[i].getBrand() + ""
							+ "\nNumero: " + cards[i].getNumber()
							+ "\n\n";
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
				break;
			
			case "Earnings":
				for(int i = 0; i < earnings.length; i++) {
					value = value + earnings[i].getTitle() 
							+ "\nValor: " + earnings[i].getValue()
							+ "\n\n";
				}
				break;
			
			case "Spendings":
				for(int i = 0; i < spendings.length; i++) {
					value = value + spendings[i].getTitle() 
							+ "\nValor: " + spendings[i].getValue()
							+ "\n\n";
				}
				break;
		}
		return value;
	}
	
	
}