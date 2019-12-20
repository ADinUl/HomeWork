package com.company;

public abstract class PopulatedLocality {

    private int population;
    private int createdYear;
    private double square;
    private String nameManager;
    private String name;


    public PopulatedLocality() {

    }

    public PopulatedLocality(int population, int createdYear, double square, String nameManager, String name) {
        this.population = population;
        this.createdYear = createdYear;
        this.square = square;
        this.nameManager = nameManager;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    public double getSquare() {
        return square;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCreatedYear(int createdYear) {
        this.createdYear = createdYear;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setNameManager() {
        this.nameManager = nameManager;
    }

    public abstract void devise();
    public abstract void religion();
    public abstract void language();
    public abstract void brandOfMessage();

    public void information() {
        System.out.println(name);
        religion();
        language();
        brandOfMessage();
    }
//    public void lifeStyle() { }

}
