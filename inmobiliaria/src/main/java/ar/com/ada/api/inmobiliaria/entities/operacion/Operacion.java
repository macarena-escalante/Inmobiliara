package ar.com.ada.api.inmobiliaria.entities.operacion;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.usuario.Usuario;

/**
 * Operacion
 */
@Entity
@Table(name= "operacion")
public class Operacion {

    @Id
    @Column(name = "operacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int operacionId;

    private BigDecimal monto;

    private Date fecha;

    private String tipo;

    @Column(name= "inmueble_id")
    private Inmueble inmuebleId;

    @Column(name= "usuario_id")
    private Usuario usuarioId;

    public int getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(int operacionId) {
        this.operacionId = operacionId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getInmuebleId() {
        return inmuebleId;
    }

    public void setInmuebleId(int inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Operacion(BigDecimal monto, Date fecha, String tipo) {
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Operacion() {
    }
    
}