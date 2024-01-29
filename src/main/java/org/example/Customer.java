package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;
    int frequentRentalPoints = 0;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : rentals) {
            result += "\t" + each.getCar().getMakeModel() + "\t" + each.getCharge() + "\n";
        }
        frequentRentalPoints +=getTotalFrequentRenterPoints();
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalCharge = 0;
        for (Rental each : rentals) {
            totalCharge += each.getCharge();
        }
        return totalCharge;
    }

    private int getTotalFrequentRenterPoints() {
        int TotalFrequentRenterPoints = 0;
        for (Rental each : rentals) {

            TotalFrequentRenterPoints += each.getFrequentRenterPoints();
        }
        return TotalFrequentRenterPoints;
    }

}


