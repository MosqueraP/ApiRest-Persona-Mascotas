package com.proyectojava.controller;

import com.proyectojava.model.Persona;
import com.proyectojava.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoServ; // inyección service

    // traer personas
    @GetMapping("/personas/traer")
    public List<Persona> getPerson(){
        return persoServ.getPersonas(); // métodos dentro del service
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);  // métodos savePersona dentro del service

        return "Persona creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);

        return "La persona fué eliminada correctamente";

    }

    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevaId,
                               @RequestParam(required = false, name = "nombre") String nuevoNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad) {

        // envío id original (para buscar)
        // envío nuevos datos para modificar
        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);

        // busco la persona editada para mostrarla en la response
        Persona perso;
        perso = persoServ.findPersona(nuevaId);

        // retorna la nueva persona
        return perso;
    }


}
