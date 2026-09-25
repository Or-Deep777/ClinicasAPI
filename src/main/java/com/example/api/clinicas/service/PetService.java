package com.example.api.clinicas.service;

import com.example.api.clinicas.model.PetModel;
import com.example.api.clinicas.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public List<PetModel> listarTodos(){
        return petRepository.findAll();
    }

    public PetModel salvar(PetModel petModel){
        return petRepository.save(petModel);
    }
}
