package kea.project.model;

import javax.persistence.*;
import java.util.List;

@Entity //Creates a h2 database with the class variables as columns
@Table(name="Factorys") //Table name in h2 database
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int factoryId;

    private String factoryName;
    private String factoryStreetName;
    private String factoryCity;
    private int factoryZipcode;
    private String factoryCountry;

    @OneToMany(mappedBy = "FACTORYS") //The name of the table in h2 database
    List<Car> cars;

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
