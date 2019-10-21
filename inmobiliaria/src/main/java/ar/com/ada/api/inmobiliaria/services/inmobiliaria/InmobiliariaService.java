package ar.com.ada.api.inmobiliaria.services.inmobiliaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.repositorys.*;
import ar.com.ada.api.inmobiliaria.repositorys.inmobiliaria.InmobiliariaRepository;
import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;

/**
 * InmobiliariaService
 */
@Service

public class InmobiliariaService {

    @Autowired
    InmobiliariaRepository repoInmobiliaria;

   public void save(Inmobiliaria i) {
        repoInmobiliaria.save(i);
    }

    public Inmobiliaria crearInmobiliaria (String nombre, String direccion, String cuit){
        
        Inmobiliaria i = new Inmobiliaria();
        i.setNombre(nombre);
        i.setDireccion(direccion);
        i.setCuit(cuit);

        repoInmobiliaria.save(i);
        return i;
    }
}