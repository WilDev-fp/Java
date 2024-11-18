package com.fernandez.viaggiodasolo.services;

import com.fernandez.viaggiodasolo.entities.Utente;

public interface UtenteService {

    Utente getUtenteById(Long id);
    Utente saveUtente(Utente utente);
    void deleteUtente(Long id);
}
