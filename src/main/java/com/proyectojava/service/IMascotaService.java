package com.proyectojava.service;

import com.proyectojava.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMascotaService{

    // método para traer todas las mascotas

    // método traer todas las máscotas (LECTURA)
    public List<Mascota> getMascotas();

    // método guardar una máscotas (ALTA)
    public void saveMascota (Mascota masco);

    // método traer todas las máscotas (BAJA)
    public void deleteMascota (Long id_Mascota);

    // método para encontrar una mascota (LECTURA)
    public Mascota findMascota (Long id); // recibe los datos y los pasa a services

    // método edición/modificación máscotas (ACTUALIZAR)
    public void editPersona (Long idOriginal, Long id_Mascota,
                             String nuevoNombre,
                             String nuevoEspecie,
                             String nuevaRaza,
                             String nuevoColor);
}
