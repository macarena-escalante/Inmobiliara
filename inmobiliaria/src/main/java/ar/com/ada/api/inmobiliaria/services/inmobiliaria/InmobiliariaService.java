package ar.com.ada.api.inmobiliaria.services.inmobiliaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.inmobiliaria.InmobiliariaRepository;
import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;

/**
 * InmobiliariaService
 */
@Service

public class InmobiliariaService {

    @Autowired
    InmobiliariaRepository repoInmobiliaria;

   public void save(Inmobiliaria i) {
        repo.save(i);
    }

    public Inmobiliaria crearInmobiliaria (String nombre, String direccion, String cuit){
        
        Inmobiliaria i = new Inmobiliaria();
        i.setNombre(nombre);
        i.setDireccion(direccion);
        i.setCuit(cuit);

        repo.save(i);
        return i;
    }
}