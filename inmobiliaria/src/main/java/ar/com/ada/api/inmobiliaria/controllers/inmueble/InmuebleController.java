package ar.com.ada.api.inmobiliaria.controllers.inmueble;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.models.request.InmuebleRequest;
import ar.com.ada.api.inmobiliaria.models.response.InmuebleResponse;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;

/**
 * InmuebleController
 */
@RestController
public class InmuebleController {
    @Autowired
    InmuebleService inmuebleService;

    @PostMapping("inmuebles/inmobiliarias")
    public PostResponse postRegistroInmuebleConInmobiliaria(@RequestBody InmuebleRequest req) {

        PostResponse r = new PostResponse();
        r.message = "El inmueble se registró con éxito";
        inmuebleService.registrarInmuebleConInmobiliaria(req.direccion, req.precio, req.estado, req.superficie,
                req.antiguedad, req.id, req.tipoInmueble);

        return r;
    }

    @PostMapping("inmuebles/locadores")
    public PostResponse postRegistroInmuebleConLocador(@RequestBody InmuebleRequest req) {

        PostResponse r = new PostResponse();
        r.message = "El inmueble se registró con éxito";
        inmuebleService.registrarInmuebleConLocador(req.direccion, req.precio, req.estado, req.superficie,
                req.antiguedad, req.id, req.tipoInmueble);

        return r;
    }

    @GetMapping("/inmuebles")
    public List<Inmueble> getInmuebles() {

        List<Inmueble> listaInmuebles = inmuebleService.getInmuebles();

        return listaInmuebles;

    }

    @GetMapping("/inmuebles/{id}")
    public Inmueble getInmuebleById(@PathVariable int id) {

        Inmueble inmueble = inmuebleService.buscarInmueblePorId(id);

        return inmueble;

    }

    @GetMapping("/inmuebles/alquileres")
    public List<InmuebleResponse> getInmueblesByAlquiler() {
        List<InmuebleResponse> inmueblecitos = new ArrayList<InmuebleResponse>();

        for (Inmueble t : inmuebleService.getInmuebles()) {
            if (t.getEstado().equals("alquilado")) {
                InmuebleResponse i = new InmuebleResponse();
                i.direccion= t.getDireccion();
                i.locadorId= t.getLocador().getLocadorId();
                i.locatarioId= t.getLocatario().getLocatarioId();
                i.message= "ALQUILADO";

                inmueblecitos.add(i);
            }
            
        }

        return inmueblecitos;
    }

}