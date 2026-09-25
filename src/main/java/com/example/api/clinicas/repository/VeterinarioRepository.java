package com.example.api.clinicas.repository;

import com.example.api.clinicas.model.VeterinarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarioRepository extends JpaRepository<VeterinarioModel,Long> {
}
