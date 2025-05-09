package com.ejemplo.gym;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AsistenciaClase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "miembro_id", nullable = false)
    private Miembro miembro;

    @ManyToOne(optional = false)
    @JoinColumn(name = "clase_id", nullable = false)
    private Clase clase;

    @Column(nullable = false)
    private LocalDate fecha;

    
    public AsistenciaClase() {}

    public AsistenciaClase(Miembro miembro, Clase clase, LocalDate fecha) {
        this.miembro = miembro;
        this.clase = clase;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
