package com.proyectojava.service;

import com.proyectojava.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private IPersonaRepository personaRepo;
}
