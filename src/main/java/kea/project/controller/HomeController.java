package kea.project.controller;

import kea.project.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ICarRepository iCarRepository;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("Cars",iCarRepository.readAll());
        return "index";
    }

}

