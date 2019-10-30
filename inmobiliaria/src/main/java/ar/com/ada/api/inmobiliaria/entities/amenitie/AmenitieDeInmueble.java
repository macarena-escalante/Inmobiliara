package ar.com.ada.api.inmobiliaria.entities.amenitie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;

/**
 * Amenitie
 */
@Entity
@Table(name= "amenitie")
public class AmenitieDeInmueble {

    @Id
    @Column(name = "amenitie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amenitieId;
    private String ascensor;
    private String pileta;
    private String gimnasio;


    @ManyToMany(mappedBy = "amenities")
    private List<Inmueble> inmuebles = new ArrayList<Inmueble>();

    public int getAmenitieId() {
        return amenitieId;
    }

    public void setAmenitieId(int amenitieId) {
        this.amenitieId = amenitieId;
    }

    public String getAscensor() {
        return ascensor;
    }

    public void setAscensor(String ascensor) {
        this.ascensor = ascensor;
    }

    public String getPileta() {
        return pileta;
    }

    public void setPileta(String pileta) {
        this.pileta = pileta;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public List<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    
}