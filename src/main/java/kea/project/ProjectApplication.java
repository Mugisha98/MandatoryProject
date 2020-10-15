package kea.project;

import kea.project.model.Car;
import kea.project.repository.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
        /*
        CarRepository cr = new CarRepository();
        cr.printCar();
         */

    }

}
