package com.ejemplo.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.gym.Entrenador;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
}
