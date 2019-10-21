package ar.com.ada.api.inmobiliaria.services.inmueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.inmueble.InmuebleRepository;
import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;

/**
 * InmuebleService
 */
@Service
public class InmuebleService {

    @Autowired
    InmuebleRepository inmuebleRepo;

     public List<Inmueble> getInmuebles() {

        return inmuebleRepo.findAll();
    }
}