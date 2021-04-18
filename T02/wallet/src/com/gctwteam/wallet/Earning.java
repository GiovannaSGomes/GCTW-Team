package com.gctwteam.wallet;

public class Earning {
    private float value;
    private String title;
    private String type;
    private String bank;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void addEarning(Earning earning, BankAccount account, float value){

        System.out.println("Add Na conta");
    }

    public void removeEarning(Earning earning, BankAccount account, float value){

        System.out.println("Remover registro");
    }    
}
