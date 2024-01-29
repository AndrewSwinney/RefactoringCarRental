package org.example;

public class CompactPrice extends Price{

    @Override
    int getPriceCode() {
        return Car.COMPACT;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        double result = 150;
        if (numberOfDaysRented > 3) {
            result += (numberOfDaysRented -3)*150;
        }
        return result;
    }
}
