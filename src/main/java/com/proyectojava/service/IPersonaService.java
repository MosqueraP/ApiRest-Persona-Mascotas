package com.proyectojava.service;

import com.proyectojava.model.Persona;

import java.util.List;

public interface IPersonaService{
    // métodos abstractos

    // método traer todas las personas (LECTURA)
    public List<Persona> getPersonas();

    // método guardar una persona (ALTA)
    public void savePersona(Persona persona);

    // método guardar una persona (BAJA)
    public void deletePersona(Long id);

    // método buscar un solo objeto (LECTURA )
    public Persona findPersona(Long id);

    // método eliminar una persona ()

}
