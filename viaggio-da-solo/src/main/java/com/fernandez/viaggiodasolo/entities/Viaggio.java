package com.fernandez.viaggiodasolo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "viaggio")
public class Viaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titolo;

    @Column(nullable = false, length = 500)
    private String descrizione;

    @Column(name = "data_inizio", nullable = false)
    private LocalDate dataInizio;

    @Column(name = "data_fine", nullable = false)
    private LocalDate dataFine;

    @Column(nullable = false)
    private BigDecimal costo;

    @Column(name = "max_partecipanti", nullable = false)
    private Integer maxPartecipanti;

    @ManyToOne
    @JoinColumn(name = "creato_da", nullable = false)
    private Utente creatoDa;

    @OneToMany(mappedBy = "viaggio", cascade = CascadeType.ALL)
    private List<Iscrizione> iscrizioni;
}
