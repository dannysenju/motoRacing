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
@Table(name = "PresentacionProducto", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class PresentacionProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPresentacionProducto")
    private Integer idPresentacionProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "descripcionPresentacionPro")
    private String descripcionPresentacionPro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPresentacionProducto", fetch = FetchType.EAGER)
    private List<Producto> productoList;

    public PresentacionProducto() {
    }

    public PresentacionProducto(Integer idPresentacionProducto) {
        this.idPresentacionProducto = idPresentacionProducto;
    }

    public PresentacionProducto(Integer idPresentacionProducto, String descripcionPresentacionPro) {
        this.idPresentacionProducto = idPresentacionProducto;
        this.descripcionPresentacionPro = descripcionPresentacionPro;
    }

    public Integer getIdPresentacionProducto() {
        return idPresentacionProducto;
    }

    public void setIdPresentacionProducto(Integer idPresentacionProducto) {
        this.idPresentacionProducto = idPresentacionProducto;
    }

    public String getDescripcionPresentacionPro() {
        return descripcionPresentacionPro;
    }

    public void setDescripcionPresentacionPro(String descripcionPresentacionPro) {
        this.descripcionPresentacionPro = descripcionPresentacionPro;
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
        hash += (idPresentacionProducto != null ? idPresentacionProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresentacionProducto)) {
            return false;
        }
        PresentacionProducto other = (PresentacionProducto) object;
        if ((this.idPresentacionProducto == null && other.idPresentacionProducto != null) || (this.idPresentacionProducto != null && !this.idPresentacionProducto.equals(other.idPresentacionProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.PresentacionProducto[ idPresentacionProducto=" + idPresentacionProducto + " ]";
    }
    
}
