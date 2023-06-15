package AirLines;

import Services.FoodService;

import java.math.BigDecimal;

public class THY extends Flight implements FoodService {
    public THY(int capacity, BigDecimal fare, BigDecimal businessExtra, int businessSeatCount, boolean isInternational) {
        super( capacity,  fare,  businessExtra,  businessSeatCount,  isInternational);
    }

    @Override
    public void serveFood() {
        if(isInternational)
        {
            System.out.println("THY YurtDışı Uçuşlarda yemek servis edilir.");
        }
        else
            System.out.println("THY Yurtiçi Uçuşlarda yemek servisi yoktur.");
    }
    @Override
    public BigDecimal takeTicket(String seatNumber)
    {
        System.out.println("THY BİLETLER YÜZDE 10 İNDİRİMLİ !");
       return super.takeTicket(seatNumber).multiply(new BigDecimal("0.9"));
    }
}
