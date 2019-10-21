package ar.com.ada.api.inmobiliaria.services.operacion;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.operacion.Operacion;
import ar.com.ada.api.inmobiliaria.repositorys.inmueble.InmuebleRepository;
import ar.com.ada.api.inmobiliaria.repositorys.operacion.OperacionRepository;
import ar.com.ada.api.inmobiliaria.repositorys.usuario.UsuarioRepository;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;
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

    public Operacion agregarOperacion(BigDecimal monto, String tipo, Date fecha, int inmuebleId, int usuarioId){
       
        Inmueble i = inmuebleService.buscarInmueblePorId(inmuebleId);

        Usuario u = usuarioService.buscarPorId(usuarioId);

        Operacion o = new Operacion();
        o.setMonto(monto);
        o.setTipo(tipo);
        o.setFecha(new Date());
        o.set
        o.setUsuarioId(usuarioId);

        repoOperacion.save(o);

        return o;

    }
    
}