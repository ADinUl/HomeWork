package com.company;

public abstract class District extends PopulatedLocality {

    private String levelCity;
    private double heightSeaLevel;


    public District(int population, int createdYear, double square, String nameManager, String name) {
        super(population, createdYear, square, nameManager, name);
    }


    public String getLevelCity() {
        return levelCity;
    }

    public double getHeightSeaLevel() {
        return heightSeaLevel;
    }

    public void setLevelCity(String levelCity) {
        this.levelCity = levelCity;
    }

    public void setHeightSeaLevel(double heightSeaLevel) {
        this.heightSeaLevel = heightSeaLevel;
    }
}
