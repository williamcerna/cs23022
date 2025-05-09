
package com.ejemplo.gym;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Membresia {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate inicio;
    private LocalDate fin;

    @ManyToOne
    @JoinColumn(name = "miembro_id")
    private Miembro miembro;

    // Constructor vacío requerido por JPA
    public Membresia() {}

    // Getters
    public Long getId() {
        return id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    // Setters (recomendado para pruebas o controladores)
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }
}
    
