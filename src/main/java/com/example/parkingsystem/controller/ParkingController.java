package com.example.parkingsystem.controller;

import com.example.parkingsystem.model.Car;
import com.example.parkingsystem.model.ParkingPlace;
import com.example.parkingsystem.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    @Autowired
    ParkingService parkingService;

    @RequestMapping("/all")
    public Map<ParkingPlace, Car> getAll() {
        return parkingService.getAll();
    }

//    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
//    public Car newCar(Car car) {
//        return parkingService.getAll();
//    }
}
