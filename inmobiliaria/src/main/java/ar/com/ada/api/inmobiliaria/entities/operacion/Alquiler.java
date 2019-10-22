package ar.com.ada.api.inmobiliaria.entities.operacion;

import java.math.BigDecimal;
import java.util.Date;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;

/**
 * Alquiler
 */
public class Alquiler extends Operacion {

    public Alquiler(int operacionId, BigDecimal monto, Date fecha, String tipo, Usuario usuario, Inmueble inmueble) {
        super(operacionId, monto, fecha, tipo, usuario, inmueble);
    }

    public Alquiler() {
    }

}