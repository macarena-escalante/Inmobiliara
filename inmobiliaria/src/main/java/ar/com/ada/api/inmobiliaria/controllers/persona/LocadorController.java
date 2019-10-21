package ar.com.ada.api.inmobiliaria.controllers.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.persona.LocadorService;

/**
 * LocadorController
 */
@RestController
public class LocadorController {

    @Autowired
    LocadorService locadorService;
    
}