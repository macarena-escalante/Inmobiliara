package ar.com.ada.api.inmobiliaria.services.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.persona.LocadorRepository;

/**
 * LocadorService
 */
@Service
public class LocadorService {

    @Autowired
    LocadorRepository repoLocador;

    
}