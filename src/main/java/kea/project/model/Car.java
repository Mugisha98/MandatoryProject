package kea.project.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    @Column
    private String carBrand;
    @Column
    private String carModel;
    @Column
    private int carYear;
    @Column
    private String carColor;

    // Specifies the Car table does not contain an factory column, but
    // an factory_id column with a foreign key. And creates a join to
    // lazily fetch the factory
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factory_id")
    private Factory factorys;

    public Factory getFactorys() {
        return factorys;
    }

    public void setFactorys(Factory factorys) {
        this.factorys = factorys;
    }

    public Car() {
    }

    public Car(int carId, String carBrand, String carModel, int carYear, String carColor) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
