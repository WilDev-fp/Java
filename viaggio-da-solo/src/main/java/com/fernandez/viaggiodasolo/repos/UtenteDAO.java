package com.fernandez.viaggiodasolo.repos;

import com.fernandez.viaggiodasolo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {

    Utente findByEmail(String email);
}
