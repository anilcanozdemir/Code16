package AirLines;

import Services.FoodService;

import java.math.BigDecimal;

public class Pegasus extends Flight implements FoodService {

    public Pegasus(int capacity, BigDecimal fare, BigDecimal businessExtra, int businessSeatCount, boolean isInternational) {
        super(capacity, fare, businessExtra, businessSeatCount, isInternational);
    }

    @Override
    public void serveFood() {
        System.out.println("Pegasus her uçuşta yemek servis eder !.");
    }
}
