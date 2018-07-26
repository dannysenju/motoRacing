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
@Table(name = "Perfiles", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class Perfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPerfiles")
    private Integer idPerfiles;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigoPerfil")
    private String codigoPerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombrePefil")
    private String nombrePefil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilesidPerfiles", fetch = FetchType.EAGER)
    private List<PerModulos> perModulosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfiles", fetch = FetchType.EAGER)
    private List<EmpleadoUsuarios> empleadoUsuariosList;

    public Perfiles() {
    }

    public Perfiles(Integer idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public Perfiles(Integer idPerfiles, String codigoPerfil, String nombrePefil) {
        this.idPerfiles = idPerfiles;
        this.codigoPerfil = codigoPerfil;
        this.nombrePefil = nombrePefil;
    }

    public Integer getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(Integer idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public String getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(String codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public String getNombrePefil() {
        return nombrePefil;
    }

    public void setNombrePefil(String nombrePefil) {
        this.nombrePefil = nombrePefil;
    }

    @XmlTransient
    public List<PerModulos> getPerModulosList() {
        return perModulosList;
    }

    public void setPerModulosList(List<PerModulos> perModulosList) {
        this.perModulosList = perModulosList;
    }

    @XmlTransient
    public List<EmpleadoUsuarios> getEmpleadoUsuariosList() {
        return empleadoUsuariosList;
    }

    public void setEmpleadoUsuariosList(List<EmpleadoUsuarios> empleadoUsuariosList) {
        this.empleadoUsuariosList = empleadoUsuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfiles != null ? idPerfiles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfiles)) {
            return false;
        }
        Perfiles other = (Perfiles) object;
        if ((this.idPerfiles == null && other.idPerfiles != null) || (this.idPerfiles != null && !this.idPerfiles.equals(other.idPerfiles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Perfiles[ idPerfiles=" + idPerfiles + " ]";
    }
    
}
