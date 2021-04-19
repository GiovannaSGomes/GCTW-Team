package com.gctwteam.wallet;

public class Card {
    private String brand;
    private String number;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void addCard(Card cartao){

        System.out.println("ADICIONAR AO BANCO");
   }

   public void removeCard(Card cartao){

       System.out.println("IMPLEMENTAR LOGICA");
   }
}

