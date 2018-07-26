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
@Table(name = "detalleVenta", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleVenta")
    private Integer idDetalleVenta;
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
    @Column(name = "valorVentaProducto")
    private float valorVentaProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "IVA")
    private String iva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidadesVendidas")
    private int unidadesVendidas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalDetalleVenta")
    private float totalDetalleVenta;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Producto idProducto;
    @JoinColumn(name = "idVenta", referencedColumnName = "idVenta")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Venta idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public DetalleVenta(Integer idDetalleVenta, String codigoProducto, String nombreProducto, float valorVentaProducto, String iva, int unidadesVendidas, float totalDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.valorVentaProducto = valorVentaProducto;
        this.iva = iva;
        this.unidadesVendidas = unidadesVendidas;
        this.totalDetalleVenta = totalDetalleVenta;
    }

    public Integer getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Integer idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
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

    public float getValorVentaProducto() {
        return valorVentaProducto;
    }

    public void setValorVentaProducto(float valorVentaProducto) {
        this.valorVentaProducto = valorVentaProducto;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public float getTotalDetalleVenta() {
        return totalDetalleVenta;
    }

    public void setTotalDetalleVenta(float totalDetalleVenta) {
        this.totalDetalleVenta = totalDetalleVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleVenta != null ? idDetalleVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.idDetalleVenta == null && other.idDetalleVenta != null) || (this.idDetalleVenta != null && !this.idDetalleVenta.equals(other.idDetalleVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.DetalleVenta[ idDetalleVenta=" + idDetalleVenta + " ]";
    }
    
}
