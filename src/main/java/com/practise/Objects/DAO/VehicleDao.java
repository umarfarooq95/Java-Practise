package com.practise.Objects.DAO;

import com.practise.Objects.Vehicle;

import java.util.List;

public interface VehicleDao {
    void insert(Vehicle vehicle);
    void insert(Iterable<Vehicle> vehicles);
    void update(Vehicle vehicle);
    void delete(Vehicle vehicle);
    Vehicle findByVehicleNo(String vehicleNo);
    List<Vehicle> findAll();
}
