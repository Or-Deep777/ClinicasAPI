package com.example.api.clinicas.service;

import com.example.api.clinicas.model.VeterinarioModel;
import com.example.api.clinicas.repository.VeterinarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    public VeterinarioService(VeterinarioRepository veterinarioRepository){
        this.veterinarioRepository = veterinarioRepository;
    }

    public List<VeterinarioModel> listarTodos(){
        return veterinarioRepository.findAll();
    }

    public VeterinarioModel salvar(VeterinarioModel veterinarioModel){
        return veterinarioRepository.save(veterinarioModel);
    }
}
