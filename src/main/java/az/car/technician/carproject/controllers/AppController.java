package az.car.technician.carproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {


    @GetMapping("/index")
    public String goHome(){
        return "index";
    }
}
