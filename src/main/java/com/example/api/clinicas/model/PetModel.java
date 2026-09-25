package com.example.api.clinicas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pets")
public class PetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String especie;

    private String raca;

    @ManyToOne
    @JoinColumn(name = "tutorModel_id", nullable = false)
    private TutorModel tutorModel;
}
