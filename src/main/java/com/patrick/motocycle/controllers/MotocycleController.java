package com.patrick.motocycle.controllers;
import com.patrick.motocycle.model.MotocycleModel;
import com.patrick.motocycle.services.MotocycleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motocycle")
public class MotocycleController {
    @Autowired
    private MotocycleService motocycleService;

    @GetMapping
    public List<MotocycleModel>buscarTodos(){
        return motocycleService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Optional<MotocycleModel>buscarPorId(@PathVariable Long id){
        return motocycleService.buscarPorId(id);
    }
    @PostMapping
    public MotocycleModel cadastrarMotocycle(@RequestBody MotocycleModel motocycle){
        return motocycleService.salvarMotocycle(motocycle);
    }
    @PutMapping("/{id}")
    public MotocycleModel atualizarMotocycle(@RequestBody MotocycleModel motocycle){
        return motocycleService.atualizarMotocycle(motocycle);
    }
    @DeleteMapping("/{id}")
    public void deletarMotocycle(@PathVariable Long id){
        motocycleService.excluir(id);
    }
}
