package ar.com.ada.api.inmobiliaria.entities.caracteristica;

import javax.persistence.*;

/**
 * Caracteristica
 */
@Entity
@Table(name = "caracteristica")

public class Caracteristica {
    @Id
    @Column(name = "cuenta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int caracteristicaId;
    private String descripcion;
}