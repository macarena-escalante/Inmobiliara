package ar.com.ada.api.inmobiliaria.controllers.inmueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;

/**
 * InmuebleController
 */
@RestController
public class InmuebleController {
    @Autowired
    InmuebleService inmuebleService;

    
        @GetMapping("/inmuebles")
        public List<Inmueble> getInmuebles() {

        List<Inmueble> listaInmuebles = inmuebleService.getInmuebles();

        return listaInmuebles;

        
    }  
}