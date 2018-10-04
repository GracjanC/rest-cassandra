package com.cisakowski.cassandrademo.service;

import com.cisakowski.cassandrademo.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car save(Car car);
}
