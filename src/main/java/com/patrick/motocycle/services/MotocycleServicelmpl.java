package com.patrick.motocycle.services;


import com.patrick.motocycle.model.MotocycleModel;
import com.patrick.motocycle.repositories.MotocycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotocycleServicelmpl implements  MotocycleService{
    @Autowired
    public MotocycleRepository motocycleRepository;
    @Override
    public List<MotocycleModel>buscarTodos(){
        return motocycleRepository.findAll();
    }
    @Override
    public Optional<MotocycleModel>buscarPorId(Long id){
        return motocycleRepository.findById(id);
    }
    @Override
    public MotocycleModel salvarMotocycle(MotocycleModel motocycle){
        return motocycleRepository.save(motocycle);
    }
    @Override
    public MotocycleModel atualizarMotocycle(MotocycleModel motocycle){
        Optional<MotocycleModel>motocycleEncontrado = motocycleRepository.findById(motocycle.getId());
        if (motocycleEncontrado.isPresent()){
            motocycleEncontrado.get().setId(motocycle.getId());
            motocycleEncontrado.get().setModelo(motocycle.getModelo());
            motocycleEncontrado.get().setCor(motocycle.getCor());
            motocycleEncontrado.get().setCombustivel(motocycle.getCombustivel());
            motocycleEncontrado.get().setCilindrada(motocycle.getCilindrada());
        }
        return motocycleEncontrado.orElse(null);
    }
    @Override
    public void excluir(Long id){
        motocycleRepository.deleteById(id);
    }



}
