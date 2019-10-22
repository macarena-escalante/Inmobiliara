package ar.com.ada.api.inmobiliaria.controllers.operacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.models.request.OperacionRequest;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;
import ar.com.ada.api.inmobiliaria.services.operacion.OperacionService;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * OperacionController
 */
@RestController
public class OperacionController {

    @Autowired
    OperacionService operacionService;


    @Autowired
    InmuebleService inmuebleService;

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/operaciones")
    public PostResponse postNewOperacion(@RequestBody OperacionRequest req) {

        PostResponse r = new PostResponse();

        operacionService.agregarOperacion(req.monto, req.tipo, req.inmuebleId, req.usuarioId);

        r.message = "Operación registrada con éxito";

        return r;
    }

}
