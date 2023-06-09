package Car;

import java.math.BigDecimal;

public class Sedan extends Car {
    public Sedan(String colour, int luggageCapacity, int year, BigDecimal dailyPayment) {
        super(colour, luggageCapacity, year,dailyPayment);;
    }
    @Override
    public BigDecimal CostByDaily(int dayCount) {
        return getDailyPayment().multiply(new BigDecimal(dayCount));
    }

    @Override
    public BigDecimal CostByMonthly(int dayCount) {
        System.out.println("SEDANLARDA AYLIK KİRALAR YÜZDE 15 İNDİRİMLİ!");
        return getDailyPayment().multiply(new BigDecimal(dayCount*30)).multiply(new BigDecimal("0.85"));
    }



    @Override
    public String toString() {
        return "Sedan"+"\t"+this.getYear()+"\t"+this.getLuggageCapacity()+"\t"+this.getColour()+"\t"+getDailyPayment();
    }
}
