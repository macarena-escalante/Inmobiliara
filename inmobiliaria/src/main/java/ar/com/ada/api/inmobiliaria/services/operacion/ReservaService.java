package ar.com.ada.api.inmobiliaria.services.operacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.repositorys.operacion.OperacionRepository;

/**
 * ReservaService
 */
@Service
public class ReservaService {

    @Autowired
    OperacionRepository repoOperacion;

    
}