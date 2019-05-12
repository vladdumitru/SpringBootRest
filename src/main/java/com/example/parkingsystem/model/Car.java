package com.example.parkingsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalTime;

@Data
//@Entity
public class Car {
    int id;
    String number;
    String driver;
    LocalTime initialTime;


}
