package com.github.jarbasBatista.citiesapi.states.repositories;


import com.github.jarbasBatista.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}