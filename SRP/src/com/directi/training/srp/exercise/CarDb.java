package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarDb {

    private static final List<Car> _carsDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
    );

    public static List<Car> GetAllCars() {
        return _carsDb;
    }

    public Car getFromDb(final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}