package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(name="locale", defaultValue = "en", required = false)String locale,  ModelMap model) {
        model.addAttribute("cars", new CarService().getAllCars());
        ResourceBundle bundle = ResourceBundle.getBundle("cars" + locale);
        model.addAttribute("headline", bundle.getString("headline"));
        return "cars";
    }
}