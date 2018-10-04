package com.cisakowski.cassandrademo.controller;

import com.cisakowski.cassandrademo.model.Car;
import com.cisakowski.cassandrademo.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAll() {
        return carService.getAll();
    }

    @PostMapping
    public Car add(@RequestBody Car car) {
        return carService.save(car);
    }
}
