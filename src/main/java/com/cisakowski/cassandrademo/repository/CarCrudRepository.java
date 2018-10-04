package com.cisakowski.cassandrademo.repository;

import com.cisakowski.cassandrademo.model.Car;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface CarCrudRepository extends CassandraRepository<Car, UUID> {
}
