package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car")
    public String index(Model model) {
        model.addAttribute("carsList", carService.getAllCars());
        return "car/index"; 
    }

    @GetMapping("/car/create")
    public String create(Model model) {
        model.addAttribute("car", new Car());
        return "car/create";
    }

    @PostMapping("/car/save")
    public String save(@ModelAttribute("car") Car car) {
        carService.saveCar(car);
        return "redirect:/car"; 
    }

    @GetMapping("/car/delete/{id}")
    public String delete(@PathVariable Long id) {
        carService.deleteCarById(id);
        return "redirect:/car";
    }

    @GetMapping("/car/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "car/edit";
    }
}