package ar.com.ada.api.inmobiliaria.services.inmueble;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.inmobiliaria.Inmobiliaria;
import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.persona.Locatario;
import ar.com.ada.api.inmobiliaria.repositorys.inmueble.InmuebleRepository;
import ar.com.ada.api.inmobiliaria.services.inmobiliaria.InmobiliariaService;

/**
 * InmuebleService
 */
@Service
public class InmuebleService {

    @Autowired
    InmuebleRepository repoInmueble;

    @Autowired
    InmobiliariaService inmobiliariaService;

    public List<Inmueble> getInmuebles() {

        return repoInmueble.findAll();
    }

    public Inmueble registrarInmuebleConInmobiliaria(String direccion, BigDecimal precio, String estado,
            double superficie, int antiguedad, int inmobiliariaId, String tipoInmueble) {

        Inmueble inmueble = new Inmueble();
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        inmueble.setDireccion(direccion);
        inmueble.setPrecio(precio);
        inmueble.setEstado(estado);
        inmueble.setSuperficie(superficie);
        inmueble.setAntiguedad(antiguedad);
       
        inmueble.setTipoInmueble(tipoInmueble);

        repoInmueble.save(inmueble);

        return inmueble;

    }

    public Inmueble buscarInmueblePorId(int id) {
        Optional<Inmueble> i = repoInmueble.findById(id);

        if (i.isPresent())
            return i.get();
        return null;
    }

    public Inmueble modificarLocatarioEnInmueble(int id, Locatario locatario) {

        Inmueble i = buscarInmueblePorId(id);
        i.setLocatario(locatario);

        repoInmueble.save(i);

        return i;

    }
    public Inmueble modificarPrecioEnInmueble(int id, BigDecimal precio) {

        Inmueble i = buscarInmueblePorId(id);
        i.setPrecio(precio);

        repoInmueble.save(i);

        return i;

    }

}