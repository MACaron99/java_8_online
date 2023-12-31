package org.example.service.imp;

import org.example.dao.CarGarage;
import org.example.dao.imp.CarGarageImp;
import org.example.entity.Car;
import org.example.service.CarMechanic;

import java.util.Collection;

public class CarMechanicImp implements CarMechanic {

    private final CarGarage carGarage = new CarGarageImp();

    @Override
    public void create(Car car) {
        carGarage.create(car);
    }

    @Override
    public void update(Car car) {
        carGarage.update(car);
    }

    @Override
    public void delete(Long id) {
        carGarage.delete(id);
    }

    @Override
    public boolean exists(Long id) {
        return carGarage.exists(id);
    }

    @Override
    public Collection<Car> findAll() {
        return carGarage.findAll();
    }

    @Override
    public Collection<Car> findMany(Long[] ids) {
        return carGarage.findMany(ids);
    }
}