package ar.com.ada.api.inmobiliaria.entities.amenitie;

import javax.persistence.*;

/**
 * Amenitie
 */
@Entity
@Table(name= "amenitie")
public class Amenitie {

    @Id
    @Column(name = "amenitie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amenitieId;
    private String descripcion;
}