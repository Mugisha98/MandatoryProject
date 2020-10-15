package kea.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Car {

    @Id
    private int carId;

    private String carBrand;
    private String carModel;
    private String carYear;
}
