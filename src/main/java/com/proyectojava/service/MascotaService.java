package com.proyectojava.service;

import com.proyectojava.model.Mascota;
import com.proyectojava.repository.IMacotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMacotaRepository repoMasco; // inyección del repository


    @Override
    public List<Mascota> getMascotas() {
        // traer todas las personas de la bd
        List<Mascota> listaMasco;
        listaMasco = repoMasco.findAll();
        return listaMasco;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);

    }

    @Override
    public void deleteMascota(Long id_Mascota) {
        repoMasco.deleteById(id_Mascota);

    }

    @Override
    public Mascota findMascota(Long id_Mascota) {
        // aca si no encuentra la mascota, devuelve null por eso el orElse
        return repoMasco.findById(id_Mascota).orElse(null);
    }

    @Override
    public void editPersona(Long idOriginal, Long id_mascotaNueva, String nuevoNombre,
                            String nuevaEspecie, String nuevaRaza, String nuevoColor) {

        // ocupo el this por qué llamo el mismo método de finPersona desde esta clase
        Mascota masco = this.findMascota(idOriginal);

        // modificación a nivel lógico
        masco.setId_Mascota(id_mascotaNueva);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);

        // ocupo el this por qué llamo el mismo método de finPersona desde esta clase
        this.saveMascota(masco);
    }
}
