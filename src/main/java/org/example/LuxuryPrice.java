package org.example;

public class LuxuryPrice extends Price{

    @Override
    int getPriceCode() {
        return Car.LUXURY;
    }

    @Override
    double getCharge(int numberOfDaysRented) {
        return numberOfDaysRented * 500;
    }

    @Override
    int getFrequentRenterPoints(int numberOfDaysRented) {
        if ((getPriceCode() == Car.LUXURY) && numberOfDaysRented > 1) {
            return 2;
        }else{
            return 1;
        }
    }
}
