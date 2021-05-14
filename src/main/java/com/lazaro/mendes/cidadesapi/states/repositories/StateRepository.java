package com.lazaro.mendes.cidadesapi.states.repositories;

import com.lazaro.mendes.cidadesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
