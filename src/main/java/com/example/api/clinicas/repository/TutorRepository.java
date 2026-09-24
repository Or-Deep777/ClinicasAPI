package com.example.api.clinicas.repository;

import com.example.api.clinicas.model.TutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<TutorModel, Long> {
}
