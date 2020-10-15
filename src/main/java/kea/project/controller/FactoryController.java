package kea.project.controller;

import kea.project.repository.IFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FactoryController
{
    /*
    @Autowired
    IFactoryRepository factoryRepository;

    @GetMapping("/factory-overview")
    public String readAllFactory(Model model)
    {
        model.addAttribute("factory",factoryRepository.readAll());
        return "factoryOverview";
    }*/
}

