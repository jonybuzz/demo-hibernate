package com.example.hibernate;

import com.example.hibernate.dominio.Alumno;
import com.example.hibernate.utils.BDUtils;
import javax.persistence.EntityManager;

public class Demo {

    public static void main(String[] args) {
        
        EntityManager em = BDUtils.getEntityManager();
        BDUtils.comenzarTransaccion(em);
        
        em.persist(new Alumno());
        
        BDUtils.commit(em);
    }
    
}
