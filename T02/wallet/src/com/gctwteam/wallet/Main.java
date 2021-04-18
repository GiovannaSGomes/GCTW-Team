package com.gctwteam.wallet;

import com.gctwteam.wallet.*;

class main {

	public static void main(String[] args){
		//Faq test
		Fac faq = new Fac();
		faq.setTitle("O que é ações?");
		faq.setAnswer(
				"Ações, também chamadas simplesmente de \"papéis\", são as parcelas que compõem o capital" +
						"social de uma empresa, ou seja, são as unidades de títulos emitidas por sociedades anônimas."
		);
		System.out.println(faq.getTitle());
		System.out.println(faq.getAnswer());

		//User test
		User user = new User();

		user.setName("Cris");
		user.setEmail("cris@gmail.com");
		user.setUserName("@cris");
		user.setPassword("abc123");
		user.setImage("google.com");

		System.out.println("\n### user ###");
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		System.out.println(user.getImage());

		//signUp teste
		System.out.println("\n#### signUp ###");
		SignUp signUp = new SignUp();
		signUp.signUp(user);
		//System.out.println(signUp.signUp());

		//profile test
		System.out.println("\n### Profile ###");
		Profile profile = new Profile();
		profile.showProfile("aaa@aaa.com");

		//card test
		System.out.println("\n### Card ###");
		Card card = new Card();

		card.setBrand("Visa");
		card.setNumber(123456789);

		System.out.println(card.getBrand());
		System.out.println(card.getNumber());

		//addCard test
		System.out.println("\n### addCart ###");
		CardMethods cardMethods = new CardMethods();

		cardMethods.addCard(card);

		//removeCard test
		System.out.println("\n### addCard ###");
		CardMethods cardMethods2 = new CardMethods();

		cardMethods2.removeCard(card);

		//BankAccount teste
		System.out.println("\n### BankAccount ###");
		BankAccount bankAccount = new BankAccount();

		bankAccount.setInstitution("NuBank");
		bankAccount.setInitialBalance(100.20f);

		System.out.println(bankAccount.getInstitution());
		System.out.println(bankAccount.getInitialBalance());

		//MethodsBankAccount test
		System.out.println("\n### MethodsBankAccount ###");

		BankAccountMethods bankAccountMethods = new BankAccountMethods();

		bankAccountMethods.addAccount(bankAccount);
		bankAccountMethods.removeAccount(bankAccount);

		//Spending teste
		Spending spending = new Spending();

		spending.setValue(100);
		spending.setTitle("Teste");
		spending.setPaymentMethod("D");
		spending.setType("sei la");

		System.out.println(spending.getValue());
		System.out.println(spending.getTitle());
		System.out.println(spending.getPaymentMethod());
		System.out.println(spending.getType());

		//SpendingMethods
		System.out.println("\n### SpendingMethods ###");

		SpendingMethods spendingMethods = new SpendingMethods();

		spendingMethods.addSpending(spending, bankAccount, 100);
		spendingMethods.removeSpending(spending, bankAccount, 100);

		//Earning test
		System.out.println("\n### Earning ###");

		Earning earning = new Earning();

		earning.setBank("a");
		earning.setTitle("a");
		earning.setType("a");
		earning.setValue(100);

		System.out.println(earning.getType());
		System.out.println(earning.getTitle());
		System.out.println(earning.getBank());
		System.out.println(earning.getValue());

		//EarningMethods
		System.out.println("\n### EarningMethods ###");

		EarningMethods earningMethods = new EarningMethods();

		earningMethods.addSpending(earning, bankAccount, 100);
		earningMethods.removeSpending(earning, bankAccount, 100);
	}
}
