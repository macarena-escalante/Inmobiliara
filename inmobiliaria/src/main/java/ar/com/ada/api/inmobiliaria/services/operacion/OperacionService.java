package ar.com.ada.api.inmobiliaria.services.operacion;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.operacion.Operacion;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.repositorys.operacion.OperacionRepository;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;
import ar.com.ada.api.inmobiliaria.services.persona.LocatarioService;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * OperacionService
 */
@Service
public class OperacionService {

    @Autowired
    OperacionRepository repoOperacion;

    @Autowired
    InmuebleService inmuebleService;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    LocatarioService locatarioService;

    public void guardarOperacion(Operacion operacion) {
        repoOperacion.save(operacion);
    }

    public void agregarOperacion(BigDecimal monto, String tipo, int inmuebleId, int usuarioId) {

        Inmueble i = inmuebleService.buscarInmueblePorId(inmuebleId);

        Usuario u = usuarioService.buscarPorId(usuarioId);

        Operacion o = new Operacion();
        o.setMonto(monto);
        o.setTipo(tipo);
        o.setFecha(new Date());
        o.setInmueble(i);
        o.setUsuario(u);

        repoOperacion.save(o);
    }

    public Operacion operacionReserva(BigDecimal monto, int inmuebleId, int usuarioId) {

        Usuario u = usuarioService.buscarPorId(usuarioId);

        Inmueble i = inmuebleService.buscarInmueblePorId(inmuebleId);
        i.setEstado("Reservado");
        i.setLocatario(u.getLocatario());
        inmuebleService.guardarInmueble(i);

        Operacion operacion = new Operacion();
        operacion.setFecha(new Date());
        operacion.setMonto(monto);
        operacion.setInmueble(i);
        operacion.setUsuario(u);
        operacion.setTipo("Reserva");
        guardarOperacion(operacion);

        return operacion;

    }

    public Operacion operacionAlquiler(BigDecimal monto, int inmuebleId, int usuarioId) {

        Usuario u = usuarioService.buscarPorId(usuarioId);

        Inmueble i = inmuebleService.buscarInmueblePorId(inmuebleId);
        i.setEstado("Alquilado");
        i.setLocatario(u.getLocatario());
        inmuebleService.guardarInmueble(i);

        if (u.getLocatario() != null && i.getEstado() == "Disponible") {
            Operacion operacion = new Operacion();
            operacion.setFecha(new Date());
            operacion.setMonto(monto);
            operacion.setInmueble(i);
            operacion.setUsuario(u);
            operacion.setTipo("Alquiler");
            guardarOperacion(operacion);

            return operacion;
        }

        return null;
    }
/*
    public Operacion operacionAlquilerConReserva(BigDecimal monto, int inmuebleId, int usuarioId) {

        Usuario u = usuarioService.buscarPorId(usuarioId);

        Inmueble i = inmuebleService.buscarInmueblePorId(inmuebleId);

        i.setEstado("Alquilado");
        i.setLocatario(u.getLocatario());
        inmuebleService.guardarInmueble(i);

        if (i.getLocatario() == u.getLocatario()) {
            Operacion operacion = new Operacion();
            operacion.setFecha(new Date());
            operacion.setMonto(monto);
            operacion.setInmueble(i);
            operacion.setUsuario(u);
            operacion.setTipo("Alquiler");
            guardarOperacion(operacion);

            return operacion;
        }
        return null;
    }
    */
}