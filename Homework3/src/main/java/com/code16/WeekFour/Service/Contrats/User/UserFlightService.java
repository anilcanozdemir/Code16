package com.code16.WeekFour.Service.Contrats.User;

import com.code16.WeekFour.Entity.Flight;

import java.util.List;

public interface UserFlightService {

    List<Flight> getAll();

    Flight getById(int id);
    double takeTicket(int flightId,String seatNumber);

    String ListAvailableSeats(int flightId);

}
