package com.proyectojava.service;

import com.proyectojava.model.Persona;

import java.util.List;

public interface IPersonaService{
    // métodos abstractos

    // método traer todas las personas (LECTURA)
    public List<Persona> getPersonas();

    // método guardar una persona (ALTA)
    public void savePersona(Persona persona);

    // método elminar una persona (BAJA)
    public void deletePersona(Long id);

    // método buscar un solo objeto (LECTURA )
    public Persona findPersona(Long id);

    // método modificar una persona ()
    public void editPersona (Long idOriginal, Long idNuevo,
                             String nuevoNombre,
                             String nuevoApellido,
                             int nuevaEdad);


    public void editPersona(Persona per); // llama al método en servicio
}
