package com.code16.WeekFour.Controller;

import com.code16.WeekFour.Entity.Flight;
import com.code16.WeekFour.Entity.Pegasus;
import com.code16.WeekFour.Entity.Thy;
import com.code16.WeekFour.Service.Contrats.Admin.AdminFlightService;
import com.code16.WeekFour.Service.Contrats.Admin.AdminPegasusService;
import com.code16.WeekFour.Service.Contrats.Admin.AdminTHYService;
import com.code16.WeekFour.Service.Contrats.User.UserFlightService;
import com.code16.WeekFour.Service.Contrats.User.UserPegasusService;
import com.code16.WeekFour.Service.Contrats.User.UserTHYService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/flights")
@RestController
@RequiredArgsConstructor
public class FlightsController {
    private final AdminFlightService adminFlightService;
    private final AdminPegasusService adminPegasusService;
    private final AdminTHYService adminTHYService;
    private final UserTHYService userTHYService;
    private final UserPegasusService userPegasusService;
    private final UserFlightService userFlightService;

/*
    @PostMapping("/add")
    public void add(@RequestBody Flight flight) {
        this.flightService.add(flight);
    }
    */
    /*
    FLIGHT SERVICE
     */

    @GetMapping("/getAll")
    public List<Flight> getAll() {
        return this.userFlightService.getAll();
    }

    @GetMapping("/getById")
    public Flight getByid(@RequestParam int id) {
        return this.userFlightService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam int id) {
        this.adminFlightService.delete(id);
    }

    /*
    PEGASUS SERVICE
     */
    @PostMapping("/addPegasus")
    public void add(@RequestBody Pegasus pegasus) {
        this.adminPegasusService.addPegasus(pegasus);
    }

    @GetMapping("/getAllPegasus")
    public List<Pegasus> getAllPegasus() {
        return this.userPegasusService.getAllPegasus();
    }

    @GetMapping("/getPegasusById")
    public Flight getPegasusByid(@RequestParam int id) {
        return this.userPegasusService.getPegasusById(id);
    }

    @PostMapping("/deletePegasus")
    public void deletePegasus(@RequestParam int id) {
        this.adminPegasusService.deletePegasus(id);
    }

    /*
    THY SERVICE
     */
    @PostMapping("/addTHY")
    public void add(@RequestBody Thy thy) {
        this.adminTHYService.addTHY(thy);
    }

    @GetMapping("/getAllTHY")
    public List<Thy> getAllThy() {
        return this.userTHYService.getAllTHY();
    }

    @GetMapping("/getTHYById")
    public Flight getThyByid(@RequestParam int id) {
        return this.userTHYService.getTHYById(id);
    }

    @PostMapping("/deleteTHY")
    public void deleteThy(@RequestParam int id) {
        this.adminTHYService.deleteTHY(id);
    }
}
