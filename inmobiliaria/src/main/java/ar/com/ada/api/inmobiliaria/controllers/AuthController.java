package ar.com.ada.api.inmobiliaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.models.request.LoginRequest;
import ar.com.ada.api.inmobiliaria.models.request.UsuarioRequest;
import ar.com.ada.api.inmobiliaria.models.response.JwtResponse;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.security.jwt.JWTTokenUtil;
import ar.com.ada.api.inmobiliaria.services.JWTUserDetailsService;
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

    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    @Autowired
    private JWTUserDetailsService userDetailsService;

    @PostMapping("/usuarios/inmobiliarias/{id}")
    public PostResponse postnewUsuarioInmob(@RequestBody UsuarioRequest req, @PathVariable int id) {
        PostResponse p = new PostResponse();
        
        Inmobiliaria inmobiliaria = inmobiliariaService.buscarPorId(id);

        usuarioService.agregarUsuarioInmobiliaria(inmobiliaria, req.password, req.email);
        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;
    }

    @PostMapping("/usuarios/locatarios/{id}")
    public PostResponse postnewUsuarioLocat(@RequestBody UsuarioRequest req, @PathVariable int id) {
        PostResponse p = new PostResponse();
       
        usuarioService.agregarUsuarioLocatario(req.locatarioId, req.password);
        p.isOk = true;
        p.message = "Creaste un usuario con éxito.";
        return p;
    }

    @PostMapping("auth/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody LoginRequest authenticationRequest)
            throws Exception {

        usuarioService.login(authenticationRequest.username, authenticationRequest.password);

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.username);

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

}