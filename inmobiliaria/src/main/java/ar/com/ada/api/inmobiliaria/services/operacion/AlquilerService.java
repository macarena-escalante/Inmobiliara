package ar.com.ada.api.inmobiliaria.services.operacion;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.operacion.Alquiler;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.repositorys.operacion.OperacionRepository;

/**
 * AlquilerService
 */
@Service
public class AlquilerService {

    @Autowired
    OperacionRepository repoOperacion;

    public Alquiler agregarAlquiler(BigDecimal monto, Inmueble inmueble, Usuario usuario){

        Alquiler a = new Alquiler();
        a.setMonto(monto);
        a.setTipo("Alquiler");
        a.setFecha(new Date());
        a.setInmueble(inmueble);
        a.setUsuario(usuario);

        repoOperacion.save(a);
        return a;
    }
    public Alquiler buscarAlquilerPorId(int id) {

        Alquiler a = repoOperacion.findByIdAlquiler(id);
        return a;
    }

    public Alquiler modificarAlquilerPorId(int id, BigDecimal monto, Inmueble inmueble){

        Alquiler a = buscarAlquilerPorId(id);
        a.setMonto(monto);
        a.setFecha(new Date());
        a.setInmueble(inmueble);

        repoOperacion.save(a);
        return a;
    }

    public Alquiler darDeBajaAlquiler(int id, Inmueble inmueble, Usuario usuario){

        Alquiler a = buscarAlquilerPorId(id);
        a.setTipo("Alquiler concluido");
        a.setFecha(new Date());
        a.setInmueble(inmueble);
        a.setUsuario(usuario);

        repoOperacion.save(a);

        return a;
    }
    
}