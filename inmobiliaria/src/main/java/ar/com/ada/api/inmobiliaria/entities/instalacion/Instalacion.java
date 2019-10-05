package ar.com.ada.api.inmobiliaria.entities.instalacion;

import javax.persistence.*;

/**
 * Instalacion
 */
@Entity
@Table(name= "instalacion")
public class Instalacion {

    @Id
    @Column(name = "instalacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instalacionId;
    private String descripcion;
    
}