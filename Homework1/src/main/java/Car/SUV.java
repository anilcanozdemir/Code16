package Car;

import java.math.BigDecimal;
import java.time.Year;

public class SUV extends Car {
    public SUV(String colour, int luggageCapacity, int year, BigDecimal dailyPayment) {
        super(colour, luggageCapacity, year,dailyPayment);
    }
    @Override
    public BigDecimal CostByDaily(int dayCount) {
        return getDailyPayment().multiply(new BigDecimal(dayCount));
    }

    @Override
    public BigDecimal CostByMonthly(int dayCount) {
        int age= Year.now().getValue()-getYear();
        System.out.println("SUVLARDA AYLIK KİRALAR YAŞINA GÖRE İNDİRİMLİ!");
        if(age >5 && age<=15)
        {
            return getDailyPayment().multiply(new BigDecimal(dayCount*30)).multiply(new BigDecimal("0.90"));
        }
        else if(age >15 && age<=25)
        {
            return getDailyPayment().multiply(new BigDecimal(dayCount*30)).multiply(new BigDecimal("0.85"));
        }
        else if(age >25)
        {
            return getDailyPayment().multiply(new BigDecimal(dayCount*30)).multiply(new BigDecimal("0.70"));
        }
        else
            return getDailyPayment().multiply(new BigDecimal(dayCount*30));
    }


    @Override
    public String toString() {
        return "SUV"+"\t"+this.getYear()+"\t"+this.getLuggageCapacity()+"\t"+this.getColour()+"\t"+getDailyPayment();
    }
}
