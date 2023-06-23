package com.code16.WeekFour.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@PrimaryKeyJoinColumn(name = "pegasusId")
@Table(name = "Pegasus")
@Getter
@Setter
public class Pegasus extends Flight {
}
