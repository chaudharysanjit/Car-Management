package com.example.carmanager;

public class Car
{
    private int id;
    private String manufacture;
    private String color;
    private int price;
    private float engine;

    public Car()
    {

    }

    public Car(int id, String manufacture, String color, int price, float engine) {
        this.id=id;
        this.manufacture = manufacture;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }
}
