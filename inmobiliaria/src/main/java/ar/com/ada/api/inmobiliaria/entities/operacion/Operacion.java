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
    private Inmueble inmueble;

    @Column(name= "usuario_id")
    private Usuario usuario;

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

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}