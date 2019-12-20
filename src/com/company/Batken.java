package com.company;

public class Batken extends District {


    public Batken(int population, int createdYear, double square, String nameManager, String name) {
        super(population, createdYear, square, nameManager, name);
    }

    @Override
    public void devise() {
        System.out.println("The away starts from Batken to Kyrgyzstan");
    }

    @Override
    public void religion() {
        System.out.println("Islam");
    }

    @Override
    public void language() {
        System.out.println("Kyrgyz");
    }

    @Override
    public void brandOfMessage() {
        System.out.println("Apricot");
    }


}
