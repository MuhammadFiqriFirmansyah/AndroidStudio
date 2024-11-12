package com.kii.BakeryApp;

public class Cake {
    private String name;
    private String description;
    private String price;
    private int imageResource;

    public Cake(String name, String description, String price, int imageResource) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResource = imageResource;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getPrice() { return price; }
    public int getImageResource() { return imageResource; }
}
