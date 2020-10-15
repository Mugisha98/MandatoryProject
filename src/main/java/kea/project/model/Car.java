package kea.project.model;

import javax.persistence.*;

@Entity
@Table(name="Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;

    private String carBrand;
    private String carModel;
    private int carYear;
    private String carColor;

    @ManyToOne
    Factory factorys;

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
