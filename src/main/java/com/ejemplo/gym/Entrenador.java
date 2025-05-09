package com.ejemplo.gym;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Entrenador {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "entrenador")
    private List<Clase> clases;

    // Constructor vacío requerido por JPA
    public Entrenador() {}

    // Constructor opcional
    public Entrenador(String nombre, List<Clase> clases) {
        this.nombre = nombre;
        this.clases = clases;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Clase> getClases() {
        return clases;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }
}
