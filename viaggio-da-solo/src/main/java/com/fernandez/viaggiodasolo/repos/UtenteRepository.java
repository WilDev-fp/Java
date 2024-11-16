package com.fernandez.viaggiodasolo.repos;

import com.fernandez.viaggiodasolo.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
