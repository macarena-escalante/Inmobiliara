package ar.com.ada.api.inmobiliaria.services.operacion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.operacion.Alquiler;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.repositorys.operacion.AlquilerRepository;

/**
 * AlquilerService
 */
@Service
public class AlquilerService {

    @Autowired
    AlquilerRepository repoAlquiler;

    public Alquiler agregarAlquiler(BigDecimal monto, Inmueble inmueble, Usuario usuario){

        Alquiler a = new Alquiler();
        a.setMonto(monto);
        a.setTipo("Alquiler");
        a.setFecha(new Date());
        a.setInmueble(inmueble);
        a.setUsuario(usuario);

        repoAlquiler.save(a);
        return a;
    }
    
    public Alquiler buscarAlquilerPorId(int id) {

        Optional<Alquiler> a = repoAlquiler.findById(id);

        if (a.isPresent())
            return a.get();
        return null;
    }

    public Alquiler modificarAlquilerPorId(int id, BigDecimal monto, Inmueble inmueble){

        Alquiler a = buscarAlquilerPorId(id);
        a.setMonto(monto);
        a.setFecha(new Date());
        a.setInmueble(inmueble);

        repoAlquiler.save(a);
        return a;
    }

    public Alquiler darDeBajaAlquiler(int id, Inmueble inmueble, Usuario usuario){

        Alquiler a = buscarAlquilerPorId(id);
        a.setTipo("Alquiler concluido");
        a.setFecha(new Date());
        a.setInmueble(inmueble);
        a.setUsuario(usuario);

        repoAlquiler.save(a);

        return a;
    }
    
}