package ar.com.ada.api.inmobiliaria.services.caracteristica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.amenitie.Amenitie;
import ar.com.ada.api.inmobiliaria.entities.caracteristica.Caracteristica;
import ar.com.ada.api.inmobiliaria.repositorys.caracteristica.CaracteristicaRepository;

/**
 * CaracteristicaService
 */
@Service
public class CaracteristicaService {

    @Autowired
    CaracteristicaRepository repoCaracteristica;


    public void guardarCaracteristica(Caracteristica caracteristica) {
        repoCaracteristica.save(caracteristica);
    }

    public Caracteristica registrarCaracteristica(String descripcion) {
        Caracteristica caracteristica = new Caracteristica();

        caracteristica.setDescripcion(descripcion);

        repoCaracteristica.save(caracteristica);
        return caracteristica;

    }

    public List<Caracteristica> getCaracteristica() {

        return repoCaracteristica.findAll();
    }
}