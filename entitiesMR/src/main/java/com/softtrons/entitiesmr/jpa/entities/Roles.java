/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.entitiesmr.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danny
 */
@MappedSuperclass
@Table(name = "Roles", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRoles")
    private Integer idRoles;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigoRol")
    private String codigoRol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreRol")
    private String nombreRol;
    @JoinColumn(name = "idModulos", referencedColumnName = "idModulos")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Modulos idModulos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRoles", fetch = FetchType.EAGER)
    private List<EmpleadoRoles> empleadoRolesList;

    public Roles() {
    }

    public Roles(Integer idRoles) {
        this.idRoles = idRoles;
    }

    public Roles(Integer idRoles, String codigoRol, String nombreRol) {
        this.idRoles = idRoles;
        this.codigoRol = codigoRol;
        this.nombreRol = nombreRol;
    }

    public Integer getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Integer idRoles) {
        this.idRoles = idRoles;
    }

    public String getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Modulos getIdModulos() {
        return idModulos;
    }

    public void setIdModulos(Modulos idModulos) {
        this.idModulos = idModulos;
    }

    @XmlTransient
    public List<EmpleadoRoles> getEmpleadoRolesList() {
        return empleadoRolesList;
    }

    public void setEmpleadoRolesList(List<EmpleadoRoles> empleadoRolesList) {
        this.empleadoRolesList = empleadoRolesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRoles != null ? idRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.idRoles == null && other.idRoles != null) || (this.idRoles != null && !this.idRoles.equals(other.idRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Roles[ idRoles=" + idRoles + " ]";
    }
    
}
