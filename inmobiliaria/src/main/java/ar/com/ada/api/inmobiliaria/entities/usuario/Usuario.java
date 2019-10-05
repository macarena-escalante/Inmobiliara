package ar.com.ada.api.inmobiliaria.entities.usuario;

import javax.persistence.*;

/**
 * Usuario
 */
@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioId;
    private String email;
    private String password;
    @Column(name= "persona_id")
    private int personaId;

    public void señar(){

    }

    public void alquilar(){
        
    }
}