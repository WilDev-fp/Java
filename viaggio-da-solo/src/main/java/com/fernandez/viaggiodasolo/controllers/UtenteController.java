package com.fernandez.viaggiodasolo.controllers;

import com.fernandez.viaggiodasolo.entities.Utente;
import com.fernandez.viaggiodasolo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping
    public List<Utente> getUtenti() {
        return utenteService.getAllUtenti();
    }
}
