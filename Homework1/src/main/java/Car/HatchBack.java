package Car;

import java.math.BigDecimal;

public class HatchBack extends Car {
    @Override
    public BigDecimal CostByDaily(int dayCount) {
        return getDailyPayment().multiply(new BigDecimal(dayCount));
    }

    @Override
    public BigDecimal CostByMonthly(int dayCount) {

        System.out.println("HatchBack aylık olarak kiralanamaz.");
        return CostByDaily(dayCount);

    }

    public HatchBack(String colour, int luggageCapacity, int year, BigDecimal dailyPayment) {
        super(colour, luggageCapacity, year,dailyPayment);
    }

    @Override
    public String toString() {
        return "HatchBack"+"\t"+this.getYear()+"\t"+this.getLuggageCapacity()+"\t"+this.getColour()+"\t"+getDailyPayment();
    }
}
