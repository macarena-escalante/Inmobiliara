package ar.com.ada.api.inmobiliaria.controllers.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * UsuarioController
 */
@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
}