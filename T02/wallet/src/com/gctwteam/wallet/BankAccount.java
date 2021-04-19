package com.gctwteam.wallet;

public class BankAccount {
    private String type;
    private String institution;
    private Double initialBalance;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void addAccount(BankAccount account){

        System.out.println("ADICIONAR AO BANCO");
    }

    public void removeAccount(BankAccount account){

        System.out.println("REMOVER AO BANCO");
    }


}
