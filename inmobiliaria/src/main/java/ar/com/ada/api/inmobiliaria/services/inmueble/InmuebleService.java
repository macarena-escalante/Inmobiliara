package ar.com.ada.api.inmobiliaria.services.inmueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import ar.com.ada.api.inmobiliaria.Repo.inmobiliaria.InmobiliariaRepository;
=======
import ar.com.ada.api.inmobiliaria.Repo.inmueble.InmuebleRepository;
import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
>>>>>>> d85d716dff387a612139dec2435d079ec3aa6b9a

/**
 * InmuebleService
 */
@Service
public class InmuebleService {

    @Autowired
<<<<<<< HEAD
    InmobiliariaRepository repoInmobiliaria;
=======
    InmuebleRepository inmuebleRepo;

     public List<Inmueble> getInmuebles() {

        return inmuebleRepo.findAll();
    }
>>>>>>> d85d716dff387a612139dec2435d079ec3aa6b9a
}