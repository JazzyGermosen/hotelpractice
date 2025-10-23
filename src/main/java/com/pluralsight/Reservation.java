package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNight;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numOfNight, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNight = numOfNight;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfNight() {
        return numOfNight;
    }

    public void setNumOfNight(int numOfNight) {
        this.numOfNight = numOfNight;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        if (isWeekend){
            return (price * numOfNight * 1.1);
        }
        return (price * numOfNight);
    }
}
