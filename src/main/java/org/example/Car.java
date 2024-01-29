package org.example;

public class Car {

    public static final int COMPACT = 1;
    public static final int STANDARD = 2;
    public static final int LUXURY = 3;

    private String makeModel;
    private Price price;

    public Car(String makeModel, int priceCode) {
        this.makeModel = makeModel;
        setPriceCode(priceCode);
    }

    int getFrequentRenterPoints(int numberOfDaysRented) {
        return price.getFrequentRenterPoints(numberOfDaysRented);
    }

    double getCharge(int numberOfDaysRented) {
        return price.getCharge(numberOfDaysRented);
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case COMPACT:
                price = new CompactPrice();
                break;
            case STANDARD:
                price = new StandardPrice();
                break;
            case LUXURY:
                price = new LuxuryPrice();
                break;
            default:
                throw new IllegalArgumentException("Illegal Price Code");
        }
    }
}
