package ar.com.ada.api.inmobiliaria.controllers.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.models.request.UsuarioRequest;
import ar.com.ada.api.inmobiliaria.models.response.Response;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * UsuarioController
 */
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    InmobiliariaService inmobiliariaService;

    @PostMapping("/usuarios/inmobiliarias/{id}")
    public Response postnewUsuarioInmob(@RequestBody UsuarioRequest req, @PathVariable int id){

        Response p = new Response();
        Inmobiliaria inmobiliaria = inmobiliariaService.buscarPorId(id);
    
        usuarioService.agregarUsuarioInmobiliaria(inmobiliaria, req.password, req.email);

        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;

    }

    @PostMapping("/usuarios/locatario/{id}")
    public Response postnewUsuarioLocat(@RequestBody UsuarioRequest req, @PathVariable int id){

        Response p = new Response();
        Locatario l = locatarioService.
    
        usuarioService.agregarUsuarioInmobiliaria(inmobiliaria, req.password, req.email);

        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;

    }
}