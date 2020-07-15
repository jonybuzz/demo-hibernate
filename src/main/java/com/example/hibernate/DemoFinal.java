package com.example.hibernate;

import com.example.hibernate.dominio.Curso;
import com.example.hibernate.dominio.Alumno;
import com.example.hibernate.dominio.Profesor;
import com.example.hibernate.utils.BDUtils;
import java.time.LocalDateTime;
import static java.util.Arrays.asList;
import javax.persistence.EntityManager;

public class DemoFinal {

    public static void main(String[] args) {
        
        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);
        
        Alumno marcos = new Alumno();
        
        Curso dds = new Curso();
        dds.setHorario(LocalDateTime.now());
        em.persist(dds); //antes de asociar entidades deben estar persistidas
        
        marcos.setCursos(asList(dds));
        
        em.persist(marcos);
        
        marcos.setNombre("Marcos"); //Entidad administrada -> detecta cambios
        marcos.setPromedio(6.75);
        
        
        Profesor julian = new Profesor();
        julian.setNombre("Julian");
        julian.setSalario(1000.55);
        
        em.persist(julian);
        
        BDUtils.commit(em);
    }
    
}
