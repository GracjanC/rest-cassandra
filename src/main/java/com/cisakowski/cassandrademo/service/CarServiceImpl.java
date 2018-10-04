package com.cisakowski.cassandrademo.service;

import com.cisakowski.cassandrademo.model.Car;
import com.cisakowski.cassandrademo.repository.CarCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private final CarCrudRepository carCrudRepository;

    public CarServiceImpl(CarCrudRepository carCrudRepository) {
        this.carCrudRepository = carCrudRepository;
    }

    @Override
    public List<Car> getAll() {
        return carCrudRepository.findAll();
    }

    @Override
    public Car save(Car car) {
        return carCrudRepository.save(car);
    }
}
