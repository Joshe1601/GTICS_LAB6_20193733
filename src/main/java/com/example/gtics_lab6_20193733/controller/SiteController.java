package com.example.gtics_lab6_20193733.controller;

import com.example.gtics_lab6_20193733.entity.Site;
import com.example.gtics_lab6_20193733.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;


    @GetMapping(value ="/")
    public String defaultPage() {
        return "index";
    }

    @GetMapping(value ="/sitios")
    public String principalSitios(Model model) {
        List<Site> listaSitios = siteRepository.findAll();
        model.addAttribute("listaSitios", listaSitios);
        return "lista-sitios";
    }

    @GetMapping(value ="/sitios/nuevo")
    public String nuevoSitio() {
        return "nuevo-sitio";
    }



}
