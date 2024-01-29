package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Andrew");
    }

    @Test
    void testEmptyStatement() {
        assertEquals("Rental Record for Andrew\nAmount owed is 0.0\nYou earned 0 frequent renter points", customer.statement());
    }

    @Test
    void testRentStandardCarFor1Day() {
        customer.addRental(new Rental(new Car("Toyota", Car.STANDARD), 1));
        assertEquals("Rental Record for Andrew\n\tToyota\t200.0\nAmount owed is 200.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    void testRentStandardCarFor3Days() {
        customer.addRental(new Rental(new Car("VW Golf", Car.STANDARD), 3));
        assertEquals("Rental Record for Andrew\n\tVW Golf\t350.0\nAmount owed is 350.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    void testRentLuxuryCarFor1Day() {
        customer.addRental(new Rental(new Car("Audi", Car.LUXURY), 1));
        assertEquals("Rental Record for Andrew\n\tAudi\t500.0\nAmount owed is 500.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    void testRentLuxuryCarFor2Days() {
        customer.addRental(new Rental(new Car("Audi", Car.LUXURY), 2));
        assertEquals("Rental Record for Andrew\n\tAudi\t1000.0\nAmount owed is 1000.0\nYou earned 2 frequent renter points", customer.statement());
    }

    @Test
    void testRentCompactCarFor1Day() {
        customer.addRental(new Rental(new Car("Honda", Car.COMPACT), 1));
        assertEquals("Rental Record for Andrew\n\tHonda\t150.0\nAmount owed is 150.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    void testRentCompactCarFor4Days() {
        customer.addRental(new Rental(new Car("Honda", Car.COMPACT), 4));
        assertEquals("Rental Record for Andrew\n\tHonda\t300.0\nAmount owed is 300.0\nYou earned 1 frequent renter points", customer.statement());
    }

    @Test
    void testRentMultipleCars() {
        customer.addRental(new Rental(new Car("Toyota", Car.STANDARD), 2));
        customer.addRental(new Rental(new Car("Audi", Car.LUXURY), 1));
        assertEquals("Rental Record for Andrew\n\tToyota\t200.0\n\tAudi\t500.0\nAmount owed is 700.0\nYou earned 2 frequent renter points", customer.statement());
    }
}

