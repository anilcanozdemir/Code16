package com.code16.WeekFour.Service.Concrete;

import com.code16.WeekFour.Entity.Flight;
import com.code16.WeekFour.Entity.Pegasus;
import com.code16.WeekFour.Entity.Thy;
import com.code16.WeekFour.Repository.FlightRepository;
import com.code16.WeekFour.Service.Contrats.Admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Admin  implements AdminService {


    private final FlightRepository flightRepository;

    @Override
    public void delete(int id) {
        Flight flight = this.flightRepository.getById(id);
        this.flightRepository.delete(flight);
    }

    @Override
    public void addPegasus(Pegasus pegasus) {
        this.flightRepository.save(pegasus);
    }

    @Override
    public void updatePegasus(Pegasus pegasus) {
        this.flightRepository.save(pegasus);
    }


    @Override
    public void deletePegasus(int id) {
        Pegasus pegasus = this.flightRepository.findPegasusById(id);
        this.flightRepository.delete(pegasus);
    }

    @Override
    public void addTHY(Thy thy) {
        this.flightRepository.save(thy);
    }

    @Override
    public void updateTHY(Thy thy) {
        this.flightRepository.save(thy);
    }


    @Override
    public void deleteTHY(int id) {
        Thy thy = this.flightRepository.findTHYById(id);
        this.flightRepository.delete(thy);
    }
}
