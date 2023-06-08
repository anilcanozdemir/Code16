package Car;

import java.math.BigDecimal;

public class CarFactory {

    public Car getCar(String type,String colour, int luggageCapacity, int year, BigDecimal dailyPayment)
    {
        switch (type) {
            case "SUV" -> {
                return new SUV(colour, luggageCapacity, year,dailyPayment);
            }
            case "Sedan" -> {
                return new Sedan(colour, luggageCapacity, year,dailyPayment);
            }
            case "HatchBack" -> {
                return new HatchBack(colour, luggageCapacity, year,dailyPayment);
            }
        }
        return null;
    }
}
