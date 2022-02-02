package com.patrick.motocycle.services;

import com.patrick.motocycle.model.MotocycleModel;

import java.util.List;
import java.util.Optional;

public interface MotocycleService {
    List<MotocycleModel>buscarTodos();
    Optional<MotocycleModel> buscarPorId(Long id);
    MotocycleModel salvarMotocycle(MotocycleModel motocycle);
    MotocycleModel atualizarMotocycle(MotocycleModel motocycle);
    void excluir(Long id);

}
