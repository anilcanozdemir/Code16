package com.code16.WeekFour.Service.Concrete;

import com.code16.WeekFour.Entity.Flight;
import com.code16.WeekFour.Entity.Pegasus;
import com.code16.WeekFour.Entity.Thy;
import com.code16.WeekFour.Repository.FlightRepository;
import com.code16.WeekFour.Service.Contrats.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class User implements UserService {

    private final FlightRepository flightRepository;

    @Override
    public List<Flight> getAll() {
        return this.flightRepository.findAll();

    }

    @Override
    public Flight getById(int id) {
        Optional<Flight> flight = this.flightRepository.findById(id);
        return flight.orElse(null);
    }

    @Override
    public double takeTicket(int flightId, String seatNumber) {
        Optional<Flight> flight = this.flightRepository.findById(flightId);
        if (flight.isPresent()) {
            Flight unpacked=flight.get();
            int seat=Integer.parseInt(String.valueOf(seatNumber.charAt(0)-65))+Integer.parseInt(String.valueOf(seatNumber.charAt(1)));

            if(isAvailable(unpacked,seat))
            {
                unpacked.getFullSeats().add(seat);
               this.flightRepository.save(unpacked);
                return isBusiness(unpacked,seat)?unpacked.getPrice():unpacked.getPrice()+unpacked.getBusinessExtra();
            }

        }
        return 0;
    }

    @Override
    public String ListAvailableSeats(int flightId) {
        Optional<Flight> flight = this.flightRepository.findById(flightId);
        if (flight.isPresent()) {
            Flight unpacked = flight.get();
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(unpacked.getId()).append("ID li uçuş\n").append("EKONOMİ\t\n");

            for(int i=0;i<unpacked.getCapacity()-unpacked.getBusinessSeatCount();i++)
            {

                if(isAvailable(unpacked,i))
                    stringBuilder.append((char) (i / 10 + 65)).append(String.valueOf(i % 10)).append("\t");
                else
                    stringBuilder.append("XX"+"\t");
                if(i%10==9)
                    stringBuilder.append("\n");

            }
            stringBuilder.append("\nBUSINESS :\n");
            for(int i=unpacked.getCapacity()-unpacked.getBusinessSeatCount();i<=unpacked.getCapacity();i++)
            {

                if(isAvailable(unpacked,i))
                    stringBuilder.append((char) (i / 10 + 65)).append(String.valueOf(i % 10)).append("\t");
                else
                    stringBuilder.append("XX"+"\t");
                if(i%10==9)
                    stringBuilder.append("\n");

            }
            return stringBuilder.toString();
        }
        return null;
    }

    private boolean isBusiness(Flight flight, int seat) {
        return seat>(flight.getCapacity()-flight.getBusinessSeatCount());
    }

    private boolean isAvailable(Flight flight, int seat) {
        return !flight.getFullSeats().contains(seat);
    }

    @Override
    public List<Pegasus> getAllPegasus() {
        return this.flightRepository.findAll(new Pegasus());
    }

    @Override
    public Pegasus getPegasusById(int id) {
        Optional<Pegasus> pegasus = Optional.ofNullable(this.flightRepository.findPegasusById(id));
        return pegasus.orElse(null);
    }


    @Override
    public List<Thy> getAllTHY() {
        return this.flightRepository.findAll(new Thy());
    }

    @Override
    public Thy getTHYById(int id) {
        Optional<Thy> thy = Optional.ofNullable(this.flightRepository.findTHYById(id));
        return thy.orElse(null);
    }

}
