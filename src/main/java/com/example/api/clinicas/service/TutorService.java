package com.example.api.clinicas.service;

import com.example.api.clinicas.model.TutorModel;
import com.example.api.clinicas.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository){
        this.tutorRepository = tutorRepository;
    }

    public List<TutorModel> listarTodos(){
        return tutorRepository.findAll();
    }

    public TutorModel salvar(TutorModel tutor){
        return tutorRepository.save(tutor);
    }
}
