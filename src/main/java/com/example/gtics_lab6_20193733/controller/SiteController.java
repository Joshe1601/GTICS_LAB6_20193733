package com.example.gtics_lab6_20193733.controller;

import com.example.gtics_lab6_20193733.entity.Location;
import com.example.gtics_lab6_20193733.entity.Site;
import com.example.gtics_lab6_20193733.repository.SiteRepository;
import com.example.gtics_lab6_20193733.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;

    @Autowired
    private LocationRepository locationRepository;


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
    public String nuevoSitio(Model model) {

        List<Location> listaLocations = locationRepository.findAll();
        model.addAttribute("listaLocations", listaLocations);
        return "nuevo-sitio";
    }

    @GetMapping(value ="/sitios/borrar/{id}")
    public String borrarSitio(Model model, @PathVariable Integer id, RedirectAttributes attr) {
        attr.addFlashAttribute("msg2", "Sitio " + siteRepository.findById(id) + " borrado exitosamente");
        siteRepository.deleteById(id);
        return "redirect:/sitios";
    }

    @PostMapping(value ="/sitios/guardar")
    public String guardarSitio(Model model, Site sitio, RedirectAttributes attr) {
        siteRepository.save(sitio);
        attr.addFlashAttribute("msg", "Sitio " + sitio.getSitename() + " creado exitosamente");
        return "redirect:/sitios";
    }





}
