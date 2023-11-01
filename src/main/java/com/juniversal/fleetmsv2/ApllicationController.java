package com.juniversal.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApllicationController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/widgets")
    public String widgets() {
        return "widgets";
    }

}
