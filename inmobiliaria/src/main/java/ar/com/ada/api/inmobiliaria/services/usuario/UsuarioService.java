package ar.com.ada.api.inmobiliaria.services.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.repositorys.usuario.UsuarioRepository;
import ar.com.ada.api.inmobiliaria.security.Crypto;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repoUsuario;
    @Autowired
    InmobiliariaService inmobiliariaService; 

    public void agregarUsuarioInmobiliaria(Inmobiliaria i, String password) {

        Usuario u = new Usuario();
        u.setEmail(i.getEmail());
        u.setPassword(Crypto.encrypt(password, u.getEmail()));

        i.setUsuario(u);
        inmobiliariaService.save(i);
        i.getUsuario();

    }



    public List<Usuario> getUsuarios() {

        return repoUsuario.findAll();
    }

    public Usuario buscarPorId(int id) {

        Optional<Usuario> u = repoUsuario.findById(id);

        if (u.isPresent())
            return u.get();
        return null;
    }

    public Usuario buscarPorEmail (String email) {
       return repoUsuario.findByEmail(email);
            
    }


    public void eliminar(){

    }

    public void modificar(){

    }

    public void actualizar(){
        
    }
}