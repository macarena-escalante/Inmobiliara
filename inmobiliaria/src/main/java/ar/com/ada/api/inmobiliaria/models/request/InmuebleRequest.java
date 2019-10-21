package ar.com.ada.api.inmobiliaria.models.request;

import java.math.BigDecimal;

/**
 * InmuebleRequest
 */
public class InmuebleRequest {

    String direccion;

    BigDecimal precio;

    String estado;

    double superficie;
    
    int antiguedad;
   
    String tipoInmueble;
}