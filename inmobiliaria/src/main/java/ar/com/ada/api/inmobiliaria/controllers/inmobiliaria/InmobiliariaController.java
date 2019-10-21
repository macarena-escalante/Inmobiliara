package ar.com.ada.api.inmobiliaria.controllers.inmobiliaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.models.request.InmobiliariaRequest;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;

/**
 * InmobiliariaController
 */
@RestController
public class InmobiliariaController {

    @Autowired
    InmobiliariaService inmobiliariaService;
    
    @PostMapping("/inmobiliarias")
    public PostResponse postnewInmobiliaria(@RequestBody InmobiliariaRequest req){

        PostResponse i = new PostResponse();
    
        inmobiliariaService.crearInmobiliaria(req.nombre, req.direccion, req.cuit, req.email);

        i.isOk = true;
        i.message = "Creaste una inmobiliaria con éxito.";
        return i;

    }

    @GetMapping("/inmobiliarias/{id}")
    public Inmobiliaria getInmobiliariaById(@PathVariable int id) {
        Inmobiliaria i = inmobiliariaService.buscarPorId(id);

        return i;
    }
}