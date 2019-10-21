package ar.com.ada.api.inmobiliaria.services.operacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.Repo.operacion.OperacionRepository;

/**
 * OperacionService
 */
@Service
public class OperacionService {

    @Autowired
    OperacionRepository repoOperacion;
    
}