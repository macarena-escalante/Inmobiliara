package ar.com.ada.api.inmobiliaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.models.request.AuthRequest;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;
import ar.com.ada.api.inmobiliaria.services.persona.LocatarioService;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * AuthController
 */
@RestController
public class AuthController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    InmobiliariaService inmobiliariaService;

    @Autowired
    LocatarioService locatarioService;

    @PostMapping("/usuarios/inmobiliarias/")
    public PostResponse postnewUsuarioInmob(@RequestBody AuthRequest req) {
        PostResponse p = new PostResponse();

        usuarioService.agregarUsuarioInmobiliaria(req.nombre, req.direccion, req.cuit, req.email, req.password);
        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;
    }

    @PostMapping("usuarios/locatarios/")
    public PostResponse postnewUsuarioLocat(@RequestBody AuthRequest req) {
        PostResponse p = new PostResponse();

        usuarioService.agregarUsuarioLocatario(req.nombre, req.dni, req.telefono, req.direccion, req.email, req.password);
        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;
    }
    /*

    @PostMapping("auth/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody LoginRequest authenticationRequest)
            throws Exception {

        usuarioService.login(authenticationRequest.username, authenticationRequest.password);

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.username);

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }
*/
}