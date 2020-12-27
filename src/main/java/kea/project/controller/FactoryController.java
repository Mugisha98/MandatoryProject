package kea.project.controller;

import kea.project.repository.IFactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/*
@Controller
public class FactoryController
{
    @Autowired
    IFactoryRepository iFactoryRepository;

    @GetMapping("/factory-overview")
    public String readAllFactory(Model model)
    {
        model.addAttribute("Factorys",factoryRepository.readAll());
        return "factoryOverview";
    }
    @GetMapping("/new-")
}

*/