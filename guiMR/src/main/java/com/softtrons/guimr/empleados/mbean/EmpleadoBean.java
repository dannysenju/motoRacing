/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.guimr.empleados.mbean;

import com.softtrons.ejbmr.empleados.ejb.EmpleadoEJB;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author danny
 */
@Named("empleadoBean")
@SessionScoped
public class EmpleadoBean implements Serializable{
    
    @Inject
    EmpleadoEJB empleadoEJB;
    
    public void saludar(){
        
        System.out.println(empleadoEJB.findAll().size());
        
    }
    
}
