package ar.com.ada.api.inmobiliaria.services.inmueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.inmobiliaria.InmobiliariaRepository;

/**
 * InmuebleService
 */
@Service
public class InmuebleService {

    @Autowired
    InmobiliariaRepository repoInmobiliaria;
}