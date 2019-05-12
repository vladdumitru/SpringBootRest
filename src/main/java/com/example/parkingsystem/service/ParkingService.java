package com.example.parkingsystem.service;

import com.example.parkingsystem.model.Car;
import com.example.parkingsystem.model.ParkingPlace;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ParkingService {

    Map<ParkingPlace, Car> parkings = new HashMap<>();

    public ParkingService() {
        ParkingPlace parkingPlace1 = new ParkingPlace();
        parkingPlace1.setId(1);
        parkingPlace1.setArea("South");
        ParkingPlace parkingPlace2 = new ParkingPlace();
        parkingPlace1.setId(2);
        parkingPlace1.setArea("North");
        Car car1 = new Car();
        car1.setDriver("Vlad");
        car1.setId(1);
        car1.setNumber("B234HAM");
        Car car2 = new Car();
        car1.setDriver("Mihai");
        car1.setId(2);
        car1.setNumber("B12VKS");

        parkings.put(parkingPlace1, car1);
        parkings.put(parkingPlace2, car2);
    }

    public Map<ParkingPlace,Car> getAll() {
        return parkings;
    }
}
