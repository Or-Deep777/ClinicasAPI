package com.example.api.clinicas.service;

import com.example.api.clinicas.model.ClinicaModel;
import com.example.api.clinicas.repository.ClinicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicaService {

    private final ClinicaRepository clinicaRepository;

    public ClinicaService(ClinicaRepository clinicaRepository){
        this.clinicaRepository = clinicaRepository;
    }

    public List<ClinicaModel> listarTodas(){
        return clinicaRepository.findAll();
    }

    public ClinicaModel salvar(ClinicaModel clinicaModel){
        return clinicaRepository.save(clinicaModel);
    }
}
