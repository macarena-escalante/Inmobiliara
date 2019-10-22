package ar.com.ada.api.inmobiliaria.entities.operacion;

import java.math.BigDecimal;
import java.util.Date;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;

/**
 * Reserva
 */
public class Reserva extends Operacion {

    public Reserva(int operacionId, BigDecimal monto, Date fecha, String tipo, Usuario usuario, Inmueble inmueble) {
        super(operacionId, monto, fecha, tipo, usuario, inmueble);
    }

    public Reserva() {
    }

}