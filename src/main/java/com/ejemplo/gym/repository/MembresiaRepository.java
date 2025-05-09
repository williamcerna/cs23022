package com.ejemplo.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.gym.Membresia;

public interface MembresiaRepository extends JpaRepository<Membresia, Long> {
}
