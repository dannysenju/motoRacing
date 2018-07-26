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
@Table(name = "per_Modulos", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class PerModulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPer_Modulos")
    private Integer idPerModulos;
    @JoinColumn(name = "Modulos_idModulos", referencedColumnName = "idModulos")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Modulos modulosidModulos;
    @JoinColumn(name = "Perfiles_idPerfiles", referencedColumnName = "idPerfiles")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Perfiles perfilesidPerfiles;

    public PerModulos() {
    }

    public PerModulos(Integer idPerModulos) {
        this.idPerModulos = idPerModulos;
    }

    public Integer getIdPerModulos() {
        return idPerModulos;
    }

    public void setIdPerModulos(Integer idPerModulos) {
        this.idPerModulos = idPerModulos;
    }

    public Modulos getModulosidModulos() {
        return modulosidModulos;
    }

    public void setModulosidModulos(Modulos modulosidModulos) {
        this.modulosidModulos = modulosidModulos;
    }

    public Perfiles getPerfilesidPerfiles() {
        return perfilesidPerfiles;
    }

    public void setPerfilesidPerfiles(Perfiles perfilesidPerfiles) {
        this.perfilesidPerfiles = perfilesidPerfiles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerModulos != null ? idPerModulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerModulos)) {
            return false;
        }
        PerModulos other = (PerModulos) object;
        if ((this.idPerModulos == null && other.idPerModulos != null) || (this.idPerModulos != null && !this.idPerModulos.equals(other.idPerModulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.PerModulos[ idPerModulos=" + idPerModulos + " ]";
    }
    
}
