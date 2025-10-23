package com.pluralsight;

public class Room {

    private int numOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isOccupied;

    public Room(int numOfBeds, double price, boolean isDirty, boolean isOccupied) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied = isOccupied;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isAvailable(){
       return !(isDirty || isOccupied);
    }
}
