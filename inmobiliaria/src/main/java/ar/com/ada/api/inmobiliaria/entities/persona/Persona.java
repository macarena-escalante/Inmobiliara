package ar.com.ada.api.inmobiliaria.entities.persona;

import javax.persistence.*;

/**
 * Persona
 */
@Entity
@Table(name= "persona")
public class Persona {

    @Id
    @Column(name = "persona_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personaId;
    private String nombre;
    private int telefono;
    private String email;
    private String direccion;
    @Column(name= "inmueble_id")
    private int inmuebleId;

    public void firmar(){

    }

    
}