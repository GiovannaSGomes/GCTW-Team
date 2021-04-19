package com.gctwteam.wallet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Menu menu = new Menu();
		String[] fields = {"Bank Accounts", "Cards", "Faq", "Profile"};
		menu.setFields(fields);
		
		Earning earning = new Earning();
		earning.setBank("Nubank");
		earning.setTitle("Salario");
		earning.setValue(1200);
		
		Spending spending = new Spending();
		spending.setPaymentMethod("Debito da conta");
		spending.setTitle("Gasolina");
		spending.setValue(50);
		
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
		profile.setEarning(earning);
		profile.setSpending(spending);
		
		menu.setProfile(profile);
		
		System.out.print(menu);
		int option = ler.nextInt();
		
		System.out.print(profile.getInfos(fields[option]));
		
	}
}
