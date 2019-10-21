package ar.com.ada.api.inmobiliaria.controllers.inmueble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.inmueble.DepartamentoService;

/**
 * DepartamenteController
 */
@RestController
public class DepartamenteController {

    @Autowired
    DepartamentoService departamentoService;
}
    