package ar.com.ada.api.inmobiliaria.services.operacion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.operacion.Reserva;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.repositorys.operacion.ReservaRepository;

/**
 * ReservaService
 */
@Service
public class ReservaService {

    @Autowired
    ReservaRepository repoReserva;

    public Reserva agregarReserva(BigDecimal monto, Inmueble inmueble, Usuario usuario){

        Reserva r = new Reserva();
        r.setMonto(monto);
        r.setTipo("Reserva");
        r.setFecha(new Date());
        r.setInmueble(inmueble);
        r.setUsuario(usuario);

        repoReserva.save(r);
        return r;
    }

    public Reserva buscarReservaPorId(int id) {
        
        Optional<Reserva> r = repoReserva.findById(id);

        if (r.isPresent())
            return r.get();
        return null;
    }

    public Reserva modificarReservaPorId(int id, BigDecimal monto, Inmueble inmueble){

        Reserva r = buscarReservaPorId(id);
        r.setMonto(monto);
        r.setFecha(new Date());
        r.setInmueble(inmueble);

        repoReserva.save(r);
        return r;
    }

    public Reserva darDeBajaReserva(int id, Inmueble inmueble, Usuario usuario){

        Reserva r = buscarReservaPorId(id);
        r.setTipo("Reserva cancelada");
        r.setFecha(new Date());
        r.setInmueble(inmueble);
        r.setUsuario(usuario);

        repoReserva.save(r);

        return r;
    }
    
}