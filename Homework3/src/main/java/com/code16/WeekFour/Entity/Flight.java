package com.code16.WeekFour.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name = "flights")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column
    private double price;

    @Column
    private double businessExtra;

    @Column
    private int passengerCount;

    @Column
    private List<Integer> fullSeats;

    @Column
    private boolean isInternational;

    @Column
    private int capacity;

    @Column
    private int businessSeatCount;

}
