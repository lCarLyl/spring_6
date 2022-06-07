package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCars;

@Controller
public class CarController {
    @Autowired
    private ServiceCars serviceCars;

    @GetMapping(value ="cars")
    public String showCars(@RequestParam(value = "count",defaultValue = "0", required = false) int value, ModelMap model) {
        model.addAttribute("car_list", serviceCars.getCarsList(value));
        return "cars";
    }

}
