package com.example.gtics_lab6_20193733.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

    @GetMapping(value ="/")
    public String defaultPage() {
        return "index";
    }

    @GetMapping(value ="/sitios")
    public String principalSitios() {
        return "lista-sitios";
    }

    

}
