package ar.com.ada.api.inmobiliaria.controllers.instalacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.inmobiliaria.services.instalacion.InstalacionService;

/**
 * InstalacionController
 */
@RestController
public class InstalacionController {

    @Autowired
    InstalacionService instalacionService;
    
    @PostMapping("/amenities")
    public PostResponse postRegistrarAmenitie(@RequestBody AmenitieRequest req) {

        PostResponse a = new PostResponse();
        instalacionService.registrarAmenitie(req.descripcion);
        
        a.isOk = true;
        a.message = "Amenitie registrada con éxito";
        return a;

    }

    @GetMapping("/amenities")
    public List<AmenitieDeInmueble> getAmenities() {

        List<AmenitieDeInmueble> listaAmenities = instalacionService.getAmenities();

        return listaAmenities;
    }

    @GetMapping("/amenities/{id}")
    public AmenitieDeInmueble getAmenitieById(@PathVariable int id) {

        AmenitieDeInmueble amenitie = instalacionService.buscarAmenitiePorId(id);
        return amenitie;

    }
    
}