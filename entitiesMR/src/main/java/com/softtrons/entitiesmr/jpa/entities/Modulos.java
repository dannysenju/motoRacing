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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Entity
@Table(name = "Modulos", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulos.findAll", query = "SELECT m FROM Modulos m")
    , @NamedQuery(name = "Modulos.findByIdModulos", query = "SELECT m FROM Modulos m WHERE m.idModulos = :idModulos")
    , @NamedQuery(name = "Modulos.findByCodigoModulo", query = "SELECT m FROM Modulos m WHERE m.codigoModulo = :codigoModulo")
    , @NamedQuery(name = "Modulos.findByNombreModulo", query = "SELECT m FROM Modulos m WHERE m.nombreModulo = :nombreModulo")})
public class Modulos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idModulos")
    private Integer idModulos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigoModulo")
    private String codigoModulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreModulo")
    private String nombreModulo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modulosidModulos")
    private List<PerModulos> perModulosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModulos")
    private List<Menu> menuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModulos")
    private List<Roles> rolesList;

    public Modulos() {
    }

    public Modulos(Integer idModulos) {
        this.idModulos = idModulos;
    }

    public Modulos(Integer idModulos, String codigoModulo, String nombreModulo) {
        this.idModulos = idModulos;
        this.codigoModulo = codigoModulo;
        this.nombreModulo = nombreModulo;
    }

    public Integer getIdModulos() {
        return idModulos;
    }

    public void setIdModulos(Integer idModulos) {
        this.idModulos = idModulos;
    }

    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    @XmlTransient
    public List<PerModulos> getPerModulosList() {
        return perModulosList;
    }

    public void setPerModulosList(List<PerModulos> perModulosList) {
        this.perModulosList = perModulosList;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @XmlTransient
    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModulos != null ? idModulos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulos)) {
            return false;
        }
        Modulos other = (Modulos) object;
        if ((this.idModulos == null && other.idModulos != null) || (this.idModulos != null && !this.idModulos.equals(other.idModulos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Modulos[ idModulos=" + idModulos + " ]";
    }
    
}
