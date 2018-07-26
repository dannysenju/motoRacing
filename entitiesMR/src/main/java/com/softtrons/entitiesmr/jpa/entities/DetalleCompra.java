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
@Table(name = "detalleCompra", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleCompra")
    private Integer idDetalleCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "codigoProducto")
    private String codigoProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorCompraProducto")
    private float valorCompraProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorVentaProducto")
    private float valorVentaProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidadesCompradas")
    private int unidadesCompradas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalDetalleCompra")
    private float totalDetalleCompra;
    @JoinColumn(name = "idCompra", referencedColumnName = "idCompra")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Compra idCompra;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto idProducto;

    public DetalleCompra() {
    }

    public DetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public DetalleCompra(Integer idDetalleCompra, String codigoProducto, String nombreProducto, float valorCompraProducto, float valorVentaProducto, int unidadesCompradas, float totalDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.valorCompraProducto = valorCompraProducto;
        this.valorVentaProducto = valorVentaProducto;
        this.unidadesCompradas = unidadesCompradas;
        this.totalDetalleCompra = totalDetalleCompra;
    }

    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getValorCompraProducto() {
        return valorCompraProducto;
    }

    public void setValorCompraProducto(float valorCompraProducto) {
        this.valorCompraProducto = valorCompraProducto;
    }

    public float getValorVentaProducto() {
        return valorVentaProducto;
    }

    public void setValorVentaProducto(float valorVentaProducto) {
        this.valorVentaProducto = valorVentaProducto;
    }

    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }

    public float getTotalDetalleCompra() {
        return totalDetalleCompra;
    }

    public void setTotalDetalleCompra(float totalDetalleCompra) {
        this.totalDetalleCompra = totalDetalleCompra;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCompra != null ? idDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.idDetalleCompra == null && other.idDetalleCompra != null) || (this.idDetalleCompra != null && !this.idDetalleCompra.equals(other.idDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.DetalleCompra[ idDetalleCompra=" + idDetalleCompra + " ]";
    }
    
}
