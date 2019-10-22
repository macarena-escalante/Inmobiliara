package ar.com.ada.api.inmobiliaria.models.response;

import java.math.BigDecimal;

/**
 * InmuebleResponse
 */
public class InmuebleResponse {

    public String tipo;
    public String direccion;
    public int locatarioId;
    public BigDecimal seña;
    public int locadorId;

    public String message = "";
}