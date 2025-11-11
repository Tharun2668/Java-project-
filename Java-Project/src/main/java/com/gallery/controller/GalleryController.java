package com.gallery.controller;

import com.gallery.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class GalleryController {
    
    @GetMapping("/")
    public String showGallery(Model model) {
        // Sample car data
        List<Vehicle> cars = Arrays.asList(
            new Vehicle("Sports Car", "/images/cars/car1.jpg", "Car"),
            new Vehicle("Family SUV", "/images/cars/car2.jpg", "Car"),
            new Vehicle("Luxury Sedan", "/images/cars/car3.jpg", "Car")
        );
        
        // Sample bike data
        List<Vehicle> bikes = Arrays.asList(
            new Vehicle("Sports Bike", "/images/bikes/bike1.jpg", "Bike"),
            new Vehicle("Cruiser", "/images/bikes/bike2.jpg", "Bike"),
            new Vehicle("Adventure Bike", "/images/bikes/bike3.jpg", "Bike")
        );
        
        model.addAttribute("cars", cars);
        model.addAttribute("bikes", bikes);
        
        return "gallery";
    }
}
