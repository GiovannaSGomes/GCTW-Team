package com.gctwteam.wallet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Menu menu = new Menu();
		String[] fields = {"Bank Accounts", "Earnings", "Spendings", "Cards", "Faq", "Profile"};
		menu.setFields(fields);
		
		//Dados abstratos
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setInitialBalance(1200.00);
		bankAccount1.setInstitution("Nubank");
		bankAccount1.setType("Corrente");
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setInitialBalance(600.00);
		bankAccount2.setInstitution("Bradesco");
		bankAccount2.setType("Poupanca");
		
		BankAccount[] bankAccounts = {bankAccount1, bankAccount2};
		
		Card card1 = new Card();
		card1.setBrand("Mastercard");
		card1.setNumber("5500 6600 7700 8800");
		
		Card card2 = new Card();
		card2.setBrand("Visa");
		card2.setNumber("5500 6600 7700 9900");
		
		Card[] cards = {card1, card2};
		
		Earning earning1 = new Earning();
		earning1.setBank("Nubank");
		earning1.setTitle("Salario");
		earning1.setValue(1200);
		
		Earning earning2 = new Earning();
		earning2.setBank("Nubank");
		earning2.setTitle("PLR");
		earning2.setValue(2000);
		
		Earning[] earnings = {earning1, earning2};
		
		Spending spending1 = new Spending();
		spending1.setPaymentMethod("Debito da conta");
		spending1.setTitle("Gasolina");
		spending1.setValue(50);
		
		Spending spending2 = new Spending();
		spending2.setPaymentMethod("Debito da conta");
		spending2.setTitle("Compras na padaria");
		spending2.setValue(20);
		
		Spending[] spendings = {spending1, spending2};
				
		Faq faq = new Faq();
		faq.setTitle("*** Faq - Frequently asked questions ***");
		faq.setDescription("O que são ações?");
		faq.setAnswer(
				"Ações, também chamadas simplesmente de \"papéis\", são as parcelas que compõem o capital" +
						"social de uma empresa, ou seja, são as unidades de títulos emitidas por sociedades anônimas."
		);

		System.out.println("*** Wallet ***");
		System.out.println("\nCadastre-se:");
		
		
		//leitura de dados
		User user = new User();
		Profile profile = new Profile();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = ler.nextLine();
		
		System.out.print("Email: ");
		String email = ler.nextLine();
		
		System.out.print("User: ");
		String username = ler.nextLine();
		
		System.out.print("Password: ");
		String pass = ler.nextLine();
		
		
		user.setUsername(username);
		user.setPassword(pass);
		
		profile.setUsername(username);
		profile.setName(name);
		profile.setFaq(faq);
		profile.setEmail(email);
		profile.setEarnings(earnings);
		profile.setSpendings(spendings);
		profile.setBankAccounts(bankAccounts);
		profile.setCards(cards);
		profile.setBalance(profile.calculateBalance());
		
		
		menu.setProfile(profile);
		
		System.out.print(menu);
		int option = ler.nextInt();
		
		System.out.print(profile.getInfos(fields[option]));
		
	}
}
