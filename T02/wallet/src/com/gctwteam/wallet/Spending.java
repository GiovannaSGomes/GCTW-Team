package com.gctwteam.wallet;

public class Spending {
    private float value;
    private String title;
    private String paymentMethod;

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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void addSpending(Spending spending, BankAccount account, float value){

        System.out.println("Subtrair da conta");
    }

    public void removeSpending(Spending spending, BankAccount account, float value){

        System.out.println("Remover registro");
    }
}
