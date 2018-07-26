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
@Table(name = "empleado_Usuarios", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class EmpleadoUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado_Usuarios")
    private Integer idEmpleadoUsuarios;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Empleado idEmpleado;
    @JoinColumn(name = "idPerfiles", referencedColumnName = "idPerfiles")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Perfiles idPerfiles;

    public EmpleadoUsuarios() {
    }

    public EmpleadoUsuarios(Integer idEmpleadoUsuarios) {
        this.idEmpleadoUsuarios = idEmpleadoUsuarios;
    }

    public Integer getIdEmpleadoUsuarios() {
        return idEmpleadoUsuarios;
    }

    public void setIdEmpleadoUsuarios(Integer idEmpleadoUsuarios) {
        this.idEmpleadoUsuarios = idEmpleadoUsuarios;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Perfiles getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(Perfiles idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoUsuarios != null ? idEmpleadoUsuarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoUsuarios)) {
            return false;
        }
        EmpleadoUsuarios other = (EmpleadoUsuarios) object;
        if ((this.idEmpleadoUsuarios == null && other.idEmpleadoUsuarios != null) || (this.idEmpleadoUsuarios != null && !this.idEmpleadoUsuarios.equals(other.idEmpleadoUsuarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.EmpleadoUsuarios[ idEmpleadoUsuarios=" + idEmpleadoUsuarios + " ]";
    }
    
}
