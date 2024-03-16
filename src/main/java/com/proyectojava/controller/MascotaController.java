package com.proyectojava.controller;

import com.proyectojava.model.Mascota;
import com.proyectojava.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController{

    @Autowired // inyección de la interfaz service para solicitar la info
    private IMascotaService mascoServ;

    // enpoint para crear o dar de alta una mascota
    @PostMapping("/mascotas/crear")
    public String saveMascota (@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);

        return "La mascota fue creada correctamente";
    }
}
