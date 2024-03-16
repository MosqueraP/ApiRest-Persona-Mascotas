package com.proyectojava.repository;

import com.proyectojava.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMacotaRepository extends JpaRepository<Mascota, Long> {
}
