package kea.project.repository;

import kea.project.model.Car;
import java.util.List;

public interface ICarRepository {
    void create(Car car);
    Car read(int id);
    List<Car> readAll();
}
