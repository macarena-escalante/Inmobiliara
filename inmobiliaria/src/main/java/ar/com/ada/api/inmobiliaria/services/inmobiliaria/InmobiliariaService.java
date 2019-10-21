package ar.com.ada.api.inmobiliaria.services.inmobiliaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.repositorys.inmobiliaria.InmobiliariaRepository;

/**
 * InmobiliariaService
 */
@Service

public class InmobiliariaService {

    @Autowired
    InmobiliariaRepository repoInmobiliaria;

    public Inmobiliaria buscarPorId(int id) {

        return repoInmobiliaria.findById(id);
    }

   public void save(Inmobiliaria i) {
        repoInmobiliaria.save(i);
    }

    public Inmobiliaria crearInmobiliaria (String nombre, String direccion, String cuit, String email){
        
        Inmobiliaria i = new Inmobiliaria();
        i.setNombre(nombre);
        i.setDireccion(direccion);
        i.setCuit(cuit);
        i.setEmail(email);

        repoInmobiliaria.save(i);
        return i;
    }
}