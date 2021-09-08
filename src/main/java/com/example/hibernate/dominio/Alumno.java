package com.example.hibernate.dominio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Alumno extends Persona {

    @OneToOne
    private Direccion direccion;

    private Double promedio;

    @OneToMany(mappedBy = "alumno")
//  Si la relación fuera unidireccional, hay que indicarle la
//    columna dentro de tabla examen
//    @JoinColumn(name = "alumno_id")
    private List<Examen> examenes;

    @ManyToMany
    @JoinTable(name = "persona_x_curso") //Opcional
    private List<Curso> cursos;


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public List<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
