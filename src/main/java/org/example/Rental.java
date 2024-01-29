package org.example;


public class Rental {

    private Car car;
    private int daysRented;

    public Rental(Car car, int daysRented) {
        this.car = car;
        this.daysRented = daysRented;
    }

    int getFrequentRenterPoints() {
        return getCar().getFrequentRenterPoints(getDaysRented());
    }

    double getCharge() {
        return getCar().getCharge(getDaysRented());
    }

    public Car getCar() {
        return car;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
