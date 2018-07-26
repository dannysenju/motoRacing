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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danny
 */
@MappedSuperclass
@Table(name = "Menu", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMenu")
    private Integer idMenu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreMenu")
    private String nombreMenu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "linkMenu")
    private String linkMenu;
    @JoinColumn(name = "idModulos", referencedColumnName = "idModulos")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Modulos idModulos;

    public Menu() {
    }

    public Menu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public Menu(Integer idMenu, String nombreMenu, String linkMenu) {
        this.idMenu = idMenu;
        this.nombreMenu = nombreMenu;
        this.linkMenu = linkMenu;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getLinkMenu() {
        return linkMenu;
    }

    public void setLinkMenu(String linkMenu) {
        this.linkMenu = linkMenu;
    }

    public Modulos getIdModulos() {
        return idModulos;
    }

    public void setIdModulos(Modulos idModulos) {
        this.idModulos = idModulos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Menu[ idMenu=" + idMenu + " ]";
    }
    
}
