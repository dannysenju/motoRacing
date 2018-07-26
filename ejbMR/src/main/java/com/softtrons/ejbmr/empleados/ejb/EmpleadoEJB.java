/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.ejbmr.empleados.ejb;

import com.softtrons.entitiesmr.jpa.entities.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author danny
 */
@Stateless
public class EmpleadoEJB {
    
    @PersistenceContext(unitName = "mrPU")
    private EntityManager em;
    
    public List<Empleado> findAll() {
        
        List<Empleado> empleados;
        empleados = em.createNamedQuery("Empleado.findAll").getResultList();
        
        
        return empleados;
    }

}
