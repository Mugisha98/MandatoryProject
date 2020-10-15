package kea.project.controller;

import kea.project.model.Car;
import kea.project.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController
{
    @Autowired
    ICarRepository iCarRepository;

    @GetMapping("/overview")
    private String readAllCars(Model model)
    {
        model.addAttribute("Cars",iCarRepository.readAll());
        return"carOverview";
    }

    @GetMapping("/new-car")
    public String createCar(Model model){
        model.addAttribute("newCar", new Car());
        return "createCar";
    }

    @PostMapping("/new-car")
    public String createdCar(@ModelAttribute Car newCar){
        iCarRepository.create(newCar);
        return "carOverview";
    }



}
