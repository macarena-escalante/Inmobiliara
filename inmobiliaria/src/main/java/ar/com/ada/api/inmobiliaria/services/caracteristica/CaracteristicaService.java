package ar.com.ada.api.inmobiliaria.services.caracteristica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.repositorys.caracteristica.CaracteristicaRepository;

/**
 * CaracteristicaService
 */
@Service
public class CaracteristicaService {

    @Autowired
    CaracteristicaRepository repoCaracteristica;
}