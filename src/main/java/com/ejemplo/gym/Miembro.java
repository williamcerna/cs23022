package com.ejemplo.gym;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String correo;

    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Membresia> membresias;

    @OneToMany(mappedBy = "miembro", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AsistenciaClase> asistencias;

    
    public Miembro() {}

    
    public Miembro(String nombre, String correo, List<Membresia> membresias, List<AsistenciaClase> asistencias) {
        this.nombre = nombre;
        this.correo = correo;
        this.membresias = membresias;
        this.asistencias = asistencias;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public List<Membresia> getMembresias() {
        return membresias;
    }

    public List<AsistenciaClase> getAsistencias() {
        return asistencias;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setMembresias(List<Membresia> membresias) {
        this.membresias = membresias;
    }

    public void setAsistencias(List<AsistenciaClase> asistencias) {
        this.asistencias = asistencias;
    }
}
