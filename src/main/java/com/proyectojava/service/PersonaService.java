package com.proyectojava.service;

import com.proyectojava.model.Persona;
import com.proyectojava.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersonaRepository personaRepo;

    @Override
    public List<Persona> getPersonas() {
        return null;
    }

    @Override
    public void savePersona(Persona persona) {

    }

    @Override
    public void deletePersona(Long id) {

    }

    @Override
    public Persona findPersona(Long id) {
        return null;
    }
}
