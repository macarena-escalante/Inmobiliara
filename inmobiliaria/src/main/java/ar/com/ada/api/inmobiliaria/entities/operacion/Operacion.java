package ar.com.ada.api.inmobiliaria.entities.operacion;

import java.util.Date;

import javax.persistence.*;

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
    private Date fecha;
    private String tipo;
    @Column(name= "inmueble_id")
    private int inmuebleId;
    @Column(name= "usuario_id")
    private int usuarioId;
    
}