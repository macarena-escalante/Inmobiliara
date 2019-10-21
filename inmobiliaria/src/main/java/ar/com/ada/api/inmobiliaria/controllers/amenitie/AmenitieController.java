package ar.com.ada.api.inmobiliaria.controllers.amenitie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.amenitie.Amenitie;
import ar.com.ada.api.inmobiliaria.services.amenitie.AmenitieService;



/**
 * AmenitieController
 */
@RestController
public class AmenitieController {

    @Autowired
    AmenitieService amenitieService;

    @GetMapping("/amenities")
    public List<Amenitie> getEmpleados() {

        List<Amenitie> listaAmenities = amenitieService.getAmenities();

        return listaAmenities;
    }

    @GetMapping("/ameneties/{id}")
    public Amenitie getAmenitieById(@PathVariable int id){

        Amenitie amenitie = amenitieService.buscarAmenitiePorId(id);
        return amenitie;

    }
    
    
    
}