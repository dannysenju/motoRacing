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
@Table(name = "UbicacionProducto", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class UbicacionProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUbicacionProducto")
    private Integer idUbicacionProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcionUbicacionPro")
    private String descripcionUbicacionPro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUbicacionProducto", fetch = FetchType.EAGER)
    private List<Producto> productoList;

    public UbicacionProducto() {
    }

    public UbicacionProducto(Integer idUbicacionProducto) {
        this.idUbicacionProducto = idUbicacionProducto;
    }

    public UbicacionProducto(Integer idUbicacionProducto, String descripcionUbicacionPro) {
        this.idUbicacionProducto = idUbicacionProducto;
        this.descripcionUbicacionPro = descripcionUbicacionPro;
    }

    public Integer getIdUbicacionProducto() {
        return idUbicacionProducto;
    }

    public void setIdUbicacionProducto(Integer idUbicacionProducto) {
        this.idUbicacionProducto = idUbicacionProducto;
    }

    public String getDescripcionUbicacionPro() {
        return descripcionUbicacionPro;
    }

    public void setDescripcionUbicacionPro(String descripcionUbicacionPro) {
        this.descripcionUbicacionPro = descripcionUbicacionPro;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUbicacionProducto != null ? idUbicacionProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UbicacionProducto)) {
            return false;
        }
        UbicacionProducto other = (UbicacionProducto) object;
        if ((this.idUbicacionProducto == null && other.idUbicacionProducto != null) || (this.idUbicacionProducto != null && !this.idUbicacionProducto.equals(other.idUbicacionProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.UbicacionProducto[ idUbicacionProducto=" + idUbicacionProducto + " ]";
    }
    
}
