package com.patrick.motocycle.repositories;
import com.patrick.motocycle.model.MotocycleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotocycleRepository extends JpaRepository <MotocycleModel,Long> {


}
