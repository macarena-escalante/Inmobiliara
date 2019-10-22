package ar.com.ada.api.inmobiliaria.controllers.operacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;
import ar.com.ada.api.inmobiliaria.models.request.OperacionRequest;
import ar.com.ada.api.inmobiliaria.models.response.PostResponse;
import ar.com.ada.api.inmobiliaria.services.inmueble.InmuebleService;
import ar.com.ada.api.inmobiliaria.services.operacion.AlquilerService;
import ar.com.ada.api.inmobiliaria.services.operacion.OperacionService;
import ar.com.ada.api.inmobiliaria.services.operacion.ReservaService;
import ar.com.ada.api.inmobiliaria.services.usuario.UsuarioService;

/**
 * OperacionController
 */
@RestController
public class OperacionController {

    @Autowired
    OperacionService operacionService;

    @Autowired
    ReservaService reservaService;

    @Autowired
    AlquilerService alquilerService;

    @Autowired
    InmuebleService inmuebleService;

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/operaciones")
    public PostResponse postNewOperacion(@RequestBody OperacionRequest req) {

        PostResponse r = new PostResponse();

        operacionService.agregarOperacion(req.monto, req.tipo, req.inmuebleId, req.usuarioId);

        r.message = "Operación registrada con éxito";

        return r;
    }

    @PostMapping("/inmuebles/{id}/usuarios/{id}/reservas")
    public PostResponse postNewReserva(@PathVariable int id, @RequestBody OperacionRequest req) {

        PostResponse r = new PostResponse();

        Inmueble i = inmuebleService.buscarInmueblePorId(id);

        Usuario u = usuarioService.buscarPorId(id);

        reservaService.agregarReserva(req.monto, i, u);

        r.message = "Reserva registrada con éxito";

        return r;
    }

    @PostMapping("inmuebles/{id}/usuarios/{id}/alquileres")
    public PostResponse postNewAlquiler(@PathVariable int id, @RequestBody OperacionRequest req) {

        PostResponse r = new PostResponse();

        Inmueble i = inmuebleService.buscarInmueblePorId(id);

        Usuario u = usuarioService.buscarPorId(id);

        alquilerService.agregarAlquiler(req.monto, i, u);

        r.message = "Alquiler registrado con éxito";

        return r;
    }

    @PutMapping("/inmuebles/{id}/reservas/{id}")
    public PostResponse putReservaDelInmueble(@PathVariable int id, @RequestBody OperacionRequest req){

        PostResponse r = new PostResponse();

        Inmueble i = inmuebleService.buscarInmueblePorId(id);

        reservaService.modificarReservaPorId(id, req.monto, i);

        r.message = "Reserva modificada con éxito";

        return r;
    }
}
