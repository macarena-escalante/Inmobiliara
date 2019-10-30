package ar.com.ada.api.inmobiliaria.entities.instalacion;

import javax.persistence.*;

/**
 * Instalacion
 */
@Entity
@Table(name= "instalacion")
public class InstalacionDeInmueble {

    @Id
    @Column(name = "instalacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instalacionId;
    
    private String luz;
    @Column(name= "agua_corriente")
    private String aguaCorriente;
    private String gas;

    public int getInstalacionId() {
        return instalacionId;
    }

    public void setInstalacionId(int instalacionId) {
        this.instalacionId = instalacionId;
    }

    public String getLuz() {
        return luz;
    }

    public void setLuz(String luz) {
        this.luz = luz;
    }

    public String getAguaCorriente() {
        return aguaCorriente;
    }

    public void setAguaCorriente(String aguaCorriente) {
        this.aguaCorriente = aguaCorriente;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

   
}