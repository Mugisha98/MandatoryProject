package kea.project.repository;

import kea.project.model.Car;
import kea.project.model.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarRepositoryImpl implements ICarRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Car car) {
        String sql = "INSERT INTO CARS(CAR_BRAND, CAR_COLOR, CAR_MODEL, CAR_YEAR,FACTORY_ID)" +
                "VALUES (?,?,?,?,?);";
        jdbcTemplate.update(sql,
                car.getCarBrand(),car.getCarColor(),car.getCarModel(),
                car.getCarYear(),car.getFactorys());
    }

    @Override
    public Car read(int id) {
        return null;
    }

    @Override
    public List<Car> readAll() {
        List<Car> carsList = new ArrayList<>();
        Factory factory = new Factory();
        //Execute the sql statement by sending a sql request to the database
        String sql = "SELECT * FROM CARS";
        sqlRowSet = jdbcTemplate.queryForRowSet(sql);
        //Returns the result of the request from the database
        while (sqlRowSet.next()){
            carsList.add(new Car(
                    sqlRowSet.getInt("CAR_ID"),
                    sqlRowSet.getString("CAR_BRAND"),
                    sqlRowSet.getString("CAR_MODEL"),
                    sqlRowSet.getInt("CAR_YEAR"),
                    sqlRowSet.getString("CAR_COLOR"), factory
            ));
        }
        return carsList;
    }


}
