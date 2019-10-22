package ar.com.ada.api.inmobiliaria.repositorys.operacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.api.inmobiliaria.entities.operacion.Alquiler;
import ar.com.ada.api.inmobiliaria.entities.operacion.Operacion;
import ar.com.ada.api.inmobiliaria.entities.operacion.Reserva;

/**
 * OperacionRepository
 */
@Repository
public interface OperacionRepository extends JpaRepository <Operacion , Integer> {

    Reserva findByIdReserva(int id);

    Alquiler findByIdAlquiler(int id);
    
}