package com.code16.WeekFour.Repository;

import com.code16.WeekFour.Entity.Flight;
import com.code16.WeekFour.Entity.Pegasus;
import com.code16.WeekFour.Entity.Thy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
    Flight getById(int id);

    @Query("SELECT pegasus FROM Pegasus pegasus")
    List<Pegasus> findAll(Pegasus pegasus);


    @Query("SELECT thy FROM Thy thy")
    List<Thy> findAll(Thy thy);


    Pegasus findPegasusById(int id);


    Thy findTHYById(int id);
}
