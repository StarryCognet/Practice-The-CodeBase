package com.lianxi.test3;

public class Phone extends DianZi{
    private String pCard;

    public Phone(String name, String type, Integer price) {
        super(name, type, price);
    }

    public Phone(String pCard) {
        this.pCard = pCard;
    }

    public Phone(String name, String type, Integer price, String pCard) {
        super(name, type, price);
        this.pCard = pCard;
    }

    public String getpCard() {
        return pCard;
    }

    public void setpCard(String pCard) {
        this.pCard = pCard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "pCard='" + pCard + '\'' +
                "} " + super.toString();
    }
}
