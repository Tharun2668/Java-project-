package com.gallery.model;

public class Vehicle {
    private String name;
    private String imagePath;
    private String type;
    
    public Vehicle(String name, String imagePath, String type) {
        this.name = name;
        this.imagePath = imagePath;
        this.type = type;
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
