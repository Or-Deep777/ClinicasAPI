package com.example.api.clinicas.repository;

import com.example.api.clinicas.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetModel, Long> {
}
