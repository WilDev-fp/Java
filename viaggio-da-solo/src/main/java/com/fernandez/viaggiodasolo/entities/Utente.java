package com.fernandez.viaggiodasolo.entities;

import com.fernandez.viaggiodasolo.enums.Genere;
import com.fernandez.viaggiodasolo.enums.Ruolo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true)
    private LocalDate dataDiNascita;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Genere genere;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Ruolo role;

    @Column(nullable = true)
    private String telefono;

    @Column(nullable = true)
    private String tokenResetPassword;

    @OneToMany(mappedBy = "creatoDa", cascade = CascadeType.ALL)
    private List<Viaggio> viaggi;

    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
    private List<Iscrizione> iscrizioni;

    public Utente(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = Ruolo.USER;
    }
}
