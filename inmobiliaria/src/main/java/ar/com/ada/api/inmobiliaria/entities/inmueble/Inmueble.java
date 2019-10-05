package ar.com.ada.api.inmobiliaria.entities.inmueble;

import java.util.*;

import javax.persistence.*;

import ar.com.ada.api.inmobiliaria.entities.caracteristica.Caracteristica;
import ar.com.ada.api.inmobiliaria.entities.instalacion.Instalacion;

/**
 * Inmueble
 */
@Entity
@Table(name= "inmueble")
public class Inmueble {

    @Id
    @Column(name = "inmueble_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inmuebleId;
    private double precio;
    private String estado;
    private double superficie;
    private int antiguedad;
    private int direccion;
    @Column(name= "locador_id")
    private int locadorId;     // cómo reconce estos id si en bd va a ser persona_id??
    @Column(name= "locatario_id")
    private int locatarioId;

    private List<Caracteristica> caracteristicas = new ArrayList<Caracteristica>();
    private List<Instalacion> instalaciones = new ArrayList<Instalacion>();
    
    //ver en la hoja: destino = alquiler/venta ??
}