package Car;

import java.math.BigDecimal;

public abstract class Car {
    private String colour;
    private int luggageCapacity;
    private int year;
    private BigDecimal dailyPayment;
    public abstract BigDecimal CostByDaily(int dayCount);
    public abstract BigDecimal CostByMonthly(int dayCount);
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getDailyPayment() {
        return dailyPayment;
    }

    public void setDailyPayment(BigDecimal dailyPayment) {
        this.dailyPayment = dailyPayment;
    }



    public Car(String colour, int luggageCapacity, int year,BigDecimal dailyPayment) {
        this.colour = colour;
        this.luggageCapacity = luggageCapacity;
        this.year = year;
        this.dailyPayment=dailyPayment;
    }

    @Override
    public abstract String toString();
}
