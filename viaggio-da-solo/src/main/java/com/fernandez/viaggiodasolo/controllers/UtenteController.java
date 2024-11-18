package com.fernandez.viaggiodasolo.controllers;

import com.fernandez.viaggiodasolo.entities.Utente;
import com.fernandez.viaggiodasolo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/{id}")
    public Utente getUtenteById(@PathVariable Long id) {
        return utenteService.getUtenteById(id);
    }

    @PostMapping("/create")
    public Utente createUtente(@RequestBody Utente utente) {
        return utenteService.saveUtente(utente);
    }

    @PutMapping("/{id}")
    public Utente updateUtente(@PathVariable Long id, @RequestBody Utente updatedUtente) {
        Utente existingUtente = utenteService.getUtenteById(id);
        existingUtente.setNome(updatedUtente.getNome());
        existingUtente.setCognome(updatedUtente.getCognome());
        existingUtente.setEmail(updatedUtente.getEmail());
        return utenteService.saveUtente(existingUtente);
    }

    @DeleteMapping("/{id}")
    public void deleteUtente(@PathVariable Long id) {
        utenteService.deleteUtente(id);
    }
}
