package ar.com.ada.api.inmobiliaria.controllers.caracteristica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.caracteristica.CaracteristicaService;

/**
 * CaracteristicaController
 */
@RestController
public class CaracteristicaController {

    @Autowired
    CaracteristicaService caracteristicaService;

    
}