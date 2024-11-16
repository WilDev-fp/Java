package com.fernandez.viaggiodasolo.services;

import com.fernandez.viaggiodasolo.entities.Utente;
import com.fernandez.viaggiodasolo.repos.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public List<Utente> getAllUtenti() {
        return utenteRepository.findAll();
    }
}
