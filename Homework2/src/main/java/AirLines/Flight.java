package AirLines;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public  abstract   class Flight {
    public Flight(int capacity, BigDecimal fare, BigDecimal businessExtra, int businessSeatCount, boolean isInternational) {
        this.capacity = capacity;
        this.fare = fare;
        this.businessExtra = businessExtra;
        this.businessSeatCount = businessSeatCount;
        this.isInternational = isInternational;
        passengerCount=0;
        fullSeats=new  ArrayList<>();
    }
    public BigDecimal takeTicket(String seatNumber)
    {

        int seat=Integer.parseInt(String.valueOf(seatNumber.charAt(0)-65))+Integer.parseInt(String.valueOf(seatNumber.charAt(1)));

            if(isAvailable(seat))
            {

                System.out.println(seatNumber+"\talındı.");
                fullSeats.add(seat);
            }
            else
            {
                System.out.println(seatNumber+"\talınamadı.");
                return new BigDecimal(0);
            }

        System.out.println(fare);
        return isBusiness(seat)?fare:fare.add(businessExtra);
    }

    private boolean isBusiness(int seatNumber) {
        return seatNumber>(capacity-businessSeatCount);
    }

    private boolean isAvailable(int seatNumber) {
        return !fullSeats.contains(seatNumber);
    }

    public void ListAvailableSeats()
    {
        for(int i=0;i<capacity-businessSeatCount;i++)
        {

            if(isAvailable(i))
                System.out.print((char)(i/10+65)+String.valueOf(i%10)+"\t");
            else
                System.out.print("XX"+"\t");
            if(i%10==9)
                System.out.println();

        }
    }
    int capacity;
    BigDecimal fare;
    BigDecimal businessExtra;

    int passengerCount;

    int businessSeatCount;
    List<Integer> fullSeats;
    boolean isInternational;




}
