package com.example.hibernate.dominio;

import javax.persistence.Entity;

@Entity
public class Profesor extends Persona {

    private Double salario;
    
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
