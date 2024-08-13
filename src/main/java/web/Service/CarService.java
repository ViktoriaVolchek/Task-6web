package web.service;

import web.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        cars.add(new Car("RangeRover", "White", 777));
        cars.add(new Car("Mercedes", "Black", 171));
        cars.add(new Car("BMW", "Grey", 234));
        cars.add(new Car("Porsche", "Red", 456));
        cars.add(new Car("Toyota", "Yellow", 111));
        return  cars;
    }

    public List<Car> getCars(int count) {
        List<Car> carSC = new ArrayList<>(cars);
        return cars.stream()
                .limit(Math.min(count, carSC.size()))
                .collect(Collectors.toList());
    }
}