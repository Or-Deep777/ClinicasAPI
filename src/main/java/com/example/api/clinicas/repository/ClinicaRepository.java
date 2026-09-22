package com.example.api.clinicas.repository;

import com.example.api.clinicas.model.ClinicaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<ClinicaModel,Long> {
}
