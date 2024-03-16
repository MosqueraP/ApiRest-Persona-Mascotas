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
        List<Persona> listaPersonas;
        listaPersonas = personaRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);

    }

    @Override
    public Persona findPersona(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void editPersona(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoApellido, int nuevaEdad) {

        // busco el objeto original
        Persona perso = this.findPersona(idOriginal);

        // modificando a nivel de lógica
        perso.setId(idNuevo);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        // ocupo el this por qué llamo el mismo método de finPersona desde esta clase
        this.savePersona(perso);

    }

}
