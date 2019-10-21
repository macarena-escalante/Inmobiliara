package ar.com.ada.api.inmobiliaria.services.usuario;

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
        u.setGetEmail(i.getEmail());
        u.setUserEmail(i.getEmail());
        u.setPassword(Crypto.encrypt(password, u.getUserEmail()));

        i.setUsuario(u);
        inmobiliariaService.save(i);
        i.getUsuario();

    }

    // repo.save(u);

    public List<Usuario> getUsuarios() {

        return repo.findAll();
    }

    public Usuario buscarPorId(int id) {

        Optional<Usuario> u = repo.findById(id);

        if (u.isPresent())
            return u.get();
        return null;
    }

    public Usuario buscarPorUsername (String username) {
       return repo.findByUsername(username);
            
    }

    public Usuario buscarPorEmail (String userEmail) {
        return  repo.findByuserEmail(userEmail); 

    }

    public void buscar(){

    }


    public void eliminar(){

    }

    public void modificar(){

    }

    public void actualizar(){
        
    }
}