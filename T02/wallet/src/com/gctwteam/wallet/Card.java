package com.gctwteam.wallet;

public class Card {
    private String brand;
    private Integer number;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void addCard(Card cartao){

        System.out.println("ADICIONAR AO BANCO");
   }

   public void removeCard(Card cartao){

       System.out.println("IMPLEMENTAR LOGICA");
   }
}

