package ar.com.ada.api.inmobiliaria.controllers.operacion;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.models.request.OperacionRequest;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;
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
    InmobiliariaService inmobiliariaService;

    UsuarioService usuarioService;

    @PostMapping
    public PostResponse postNewOperacion(@RequestBody OperacionRequest req){

        PostResponse p = new PostResponse();

        Inmueble i = inmobiliariaService.buscarPorId(id);

        Usuario u = usuarioService.buscarPorId(id);

        operacionService.agregarOperacion(req.monto, req.tipo, req.fecha, inmuebleId, usuarioId);
    }
}