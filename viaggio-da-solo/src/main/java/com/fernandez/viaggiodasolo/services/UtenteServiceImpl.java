package com.fernandez.viaggiodasolo.services;

import com.fernandez.viaggiodasolo.entities.Utente;
import com.fernandez.viaggiodasolo.repos.UtenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteServiceImpl implements UtenteService{

    @Autowired
    private UtenteDAO utenteDAO;

    @Override
    public Utente getUtenteById(Long id) {
        return utenteDAO.findById(id).orElseThrow(() -> new RuntimeException("Utente non trovato con ID: " + id));
    }

    @Override
    public Utente saveUtente(Utente utente) {
        return utenteDAO.save(utente);
    }

    @Override
    public void deleteUtente(Long id) {
        utenteDAO.deleteById(id);
    }
}
