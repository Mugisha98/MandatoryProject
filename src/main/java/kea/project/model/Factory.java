package kea.project.model;

import javax.persistence.*;
import java.util.List;

@Entity //Creates a h2 database with the class variables as columns
@Table(name="Factorys") //Table name in h2 database
public class Factory {

    @Id //the id column in the h2 database
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID must be unique
    private int factoryId;

    @Column //the column in the h2 database
    private String factoryName;
    @Column
    private String factoryStreetName;
    @Column
    private String factoryCity;
    @Column
    private int factoryZipcode;
    @Column
    private String factoryCountry;

    //The 'mappedBy = "factorys"' attribute specifies that
    // the 'private Factory factorys;' field in Car owns the
    // relationship (i.e. contains the foreign key for the query to
    // find all cars for a factory.)
    @OneToMany(mappedBy = "factorys")
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Factory() {
    }

    public Factory(int factoryId, String factoryName, String factoryStreetName, String factoryCity, int factoryZipcode, String factoryCountry) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.factoryStreetName = factoryStreetName;
        this.factoryCity = factoryCity;
        this.factoryZipcode = factoryZipcode;
        this.factoryCountry = factoryCountry;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryStreetName() {
        return factoryStreetName;
    }

    public void setFactoryStreetName(String factoryStreetName) {
        this.factoryStreetName = factoryStreetName;
    }

    public String getFactoryCity() {
        return factoryCity;
    }

    public void setFactoryCity(String factoryCity) {
        this.factoryCity = factoryCity;
    }

    public int getFactoryZipcode() {
        return factoryZipcode;
    }

    public void setFactoryZipcode(int factoryZipcode) {
        this.factoryZipcode = factoryZipcode;
    }

    public String getFactoryCountry() {
        return factoryCountry;
    }

    public void setFactoryCountry(String factoryCountry) {
        this.factoryCountry = factoryCountry;
    }
}
