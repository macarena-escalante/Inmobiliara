package ar.com.ada.api.inmobiliaria.controllers.inmueble;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.models.request.InmuebleRequest;
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
        
        inmuebleService.registrarInmuebleConInmobiliaria(req.direccion, req.precio, req.estado, req.superficie, req.antiguedad, req.id, req.tipoInmueble);

        return r;
    }

        @PostMapping("inmuebles/locadores")
        public PostResponse postRegistroInmuebleConLocadores(@RequestBody InmuebleRequest req) {

        PostResponse r = new PostResponse();
        
        inmuebleService.registrarInmuebleConInmobiliaria(req.direccion, req.precio, req.estado, req.superficie, req.antiguedad, req.id, req.tipoInmueble);

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

}