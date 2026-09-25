package com.example.api.clinicas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "veterinarios")
public class VeterinarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private String crmv;

    private String telefone;
}
