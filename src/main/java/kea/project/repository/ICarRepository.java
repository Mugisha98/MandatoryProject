package kea.project.repository;

import kea.project.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends CrudRepository<Car,Integer> {
}
