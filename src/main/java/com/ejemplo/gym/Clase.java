package com.ejemplo.gym;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Clase {
     @Id @GeneratedValue
    private Long id;
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    private String horario;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    @OneToMany(mappedBy = "clase")
    private List<AsistenciaClase> asistencias;

    public List<AsistenciaClase> getAsistencias() {
        return asistencias;
    }

    public Long getId() {
        return id;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}
