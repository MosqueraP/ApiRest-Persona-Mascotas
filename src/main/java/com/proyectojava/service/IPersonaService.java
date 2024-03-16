package com.proyectojava.service;

import com.proyectojava.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaService extends JpaRepository<Persona, Long> {
}
