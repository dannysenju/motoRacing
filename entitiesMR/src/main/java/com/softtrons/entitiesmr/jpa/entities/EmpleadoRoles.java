/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.entitiesmr.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danny
 */
@MappedSuperclass
@Table(name = "empleado_Roles", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class EmpleadoRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado_Roles")
    private Integer idEmpleadoRoles;
    @JoinColumn(name = "idEmpelado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Empleado idEmpelado;
    @JoinColumn(name = "idRoles", referencedColumnName = "idRoles")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Roles idRoles;

    public EmpleadoRoles() {
    }

    public EmpleadoRoles(Integer idEmpleadoRoles) {
        this.idEmpleadoRoles = idEmpleadoRoles;
    }

    public Integer getIdEmpleadoRoles() {
        return idEmpleadoRoles;
    }

    public void setIdEmpleadoRoles(Integer idEmpleadoRoles) {
        this.idEmpleadoRoles = idEmpleadoRoles;
    }

    public Empleado getIdEmpelado() {
        return idEmpelado;
    }

    public void setIdEmpelado(Empleado idEmpelado) {
        this.idEmpelado = idEmpelado;
    }

    public Roles getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Roles idRoles) {
        this.idRoles = idRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoRoles != null ? idEmpleadoRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoRoles)) {
            return false;
        }
        EmpleadoRoles other = (EmpleadoRoles) object;
        if ((this.idEmpleadoRoles == null && other.idEmpleadoRoles != null) || (this.idEmpleadoRoles != null && !this.idEmpleadoRoles.equals(other.idEmpleadoRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.EmpleadoRoles[ idEmpleadoRoles=" + idEmpleadoRoles + " ]";
    }
    
}
