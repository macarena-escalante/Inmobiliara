package ar.com.ada.api.inmobiliaria.entities.caracteristica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;

/**
 * Caracteristica
 */
@Entity
@Table(name = "caracteristica")
public class CaracteristicaDeInmueble {
    @Id
    @Column(name = "caracteristica_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caracteristicaId;

    @ManyToMany(mappedBy = "caracteristicas")
    private List<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public int ambientes;
    public int baños;
    public int balcon;
    public int patio;
    public int cochera;
    public int terraza;
    
    public int getCaracteristicaId() {
        return caracteristicaId;
    }

    public void setCaracteristicaId(int caracteristicaId) {
        this.caracteristicaId = caracteristicaId;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getBalcon() {
        return balcon;
    }

    public void setBalcon(int balcon) {
        this.balcon = balcon;
    }

    public int getPatio() {
        return patio;
    }

    public void setPatio(int patio) {
        this.patio = patio;
    }

    public int getCochera() {
        return cochera;
    }

    public void setCochera(int cochera) {
        this.cochera = cochera;
    }

    public int getTerraza() {
        return terraza;
    }

    public void setTerraza(int terraza) {
        this.terraza = terraza;
    }

    
}