package com.proyectojava.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String nombre;
    public String apellido;
    public int edad;
    //@OneToOne // relación uno a uno con la tabla de mascota
    //@JoinColumn(name = "una_mascota_id_mascota", referencedColumnName = "id_Mascota")
    //private Mascota unaMascota;

    @OneToMany  // una persona puede tener muchas personas
    private List<Mascota> listaMascotas; // Lista de mascotas


}
