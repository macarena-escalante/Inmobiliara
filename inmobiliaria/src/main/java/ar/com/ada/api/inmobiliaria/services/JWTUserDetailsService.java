package ar.com.ada.api.inmobiliaria.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * JWTUserDetailsService
 */
public class JWTUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario u = usuarioService.buscarPorEmail(email);

        if (u != null) {
            return new User(u.getEmail(), u.getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
    }
}