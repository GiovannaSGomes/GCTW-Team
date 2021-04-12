package com.gctwteam.wallet;

public class BankAccount {
    String type;
    String institution;
    Float initialBalance;

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

    public Float getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Float initialBalance) {
        this.initialBalance = initialBalance;
    }
}
