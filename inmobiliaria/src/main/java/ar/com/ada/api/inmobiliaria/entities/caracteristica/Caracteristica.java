package ar.com.ada.api.inmobiliaria.entities.caracteristica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;

/**
 * Caracteristica
 */
@Entity
@Table(name = "caracteristica")
public class Caracteristica {
    @Id
    @Column(name = "caracteristica_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caracteristicaId;
/*
    @ManyToOne
    @JoinColumn(name = "inmueble_id", referencedColumnName = "inmueble_id")
    private Inmueble inmueble;
    */
    private String descripcion;

    public int getCaracteristicaId() {
        return caracteristicaId;
    }

    public void setCaracteristicaId(int caracteristicaId) {
        this.caracteristicaId = caracteristicaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}