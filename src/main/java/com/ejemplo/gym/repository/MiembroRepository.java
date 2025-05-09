package com.ejemplo.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.gym.Miembro;

public interface MiembroRepository extends JpaRepository<Miembro, Long> {
}
