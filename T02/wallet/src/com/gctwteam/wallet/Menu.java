package com.gctwteam.wallet;
import java.util.Scanner;

public class Menu {
	public String[] fields;
	public Profile profile;

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}
	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0 ; i < fields.length; i++) {
			result = result + i + "-" + fields[i] + "\n";
		}
		
		return "\n\nOlá " + profile.getName() +  
				"\n\n*** Menu ***\n" + result + 
				"\nDigite o numero correspondente a opcao desejada: ";
	}


}
