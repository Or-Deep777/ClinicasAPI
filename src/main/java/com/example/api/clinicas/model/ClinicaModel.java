package com.example.api.clinicas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clinicas")
public class ClinicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    private String endereco;
}
