package ar.com.ada.api.inmobiliaria.services.amenitie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.repositorys.amenitie.AmenitieRepository;

/**
 * AmenitieService
 */
@Service
public class AmenitieService {

    @Autowired
    AmenitieRepository repoAmenitie;
    
}