package kea.project.repository;

import kea.project.model.Car;

import java.util.ArrayList;

public class CarRepository {

    public void printCar() {
        ArrayList<Car> cars = new ArrayList<>();
        Car audi = new Car(12, "Audi", "Etron", 2020, "Red");
        cars.add(audi);
        System.out.println(cars.size());
        System.out.println(cars.toString());
    }
}
