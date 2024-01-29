package org.example;

public class StandardPrice extends Price {

    @Override
    int getPriceCode() {
        return Car.STANDARD;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        double result = 200;
        if (numberOfDaysRented > 2) {
            result += (numberOfDaysRented - 2) * 150;
        }
        return result;
    }
}
