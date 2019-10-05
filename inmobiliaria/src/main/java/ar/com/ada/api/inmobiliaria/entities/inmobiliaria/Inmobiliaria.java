package ar.com.ada.api.inmobiliaria.entities.inmobiliaria;

import java.util.*;
import javax.persistence.*;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.persona.Locador;
import ar.com.ada.api.inmobiliaria.entities.persona.Locatario;

/**
 * Inmobiliaria
 */
@Entity
@Table(name= "inmobiliaria")
public class Inmobiliaria {
    @Id
    @Column(name = "inmobiliaria_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int inmobiliariaId;
    private String nombre;
    private String direccion;
    private String cuil;

    private List<Inmueble> inmuebles = new ArrayList<Inmueble>();
    private List<Locador> locadores = new ArrayList<Locador>();
    private List<Locatario> locatarios = new ArrayList<Locatario>();
}