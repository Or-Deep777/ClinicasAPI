package com.example.api.clinicas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutores")
public class TutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    private String email;

    private String endereco;
}
