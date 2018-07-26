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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "Producto", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByCodigoProducto", query = "SELECT p FROM Producto p WHERE p.codigoProducto = :codigoProducto")
    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Producto.findByStockProducto", query = "SELECT p FROM Producto p WHERE p.stockProducto = :stockProducto")
    , @NamedQuery(name = "Producto.findByValorCompraProducto", query = "SELECT p FROM Producto p WHERE p.valorCompraProducto = :valorCompraProducto")
    , @NamedQuery(name = "Producto.findByValorVentaProducto", query = "SELECT p FROM Producto p WHERE p.valorVentaProducto = :valorVentaProducto")
    , @NamedQuery(name = "Producto.findByStockMinimo", query = "SELECT p FROM Producto p WHERE p.stockMinimo = :stockMinimo")
    , @NamedQuery(name = "Producto.findByIva", query = "SELECT p FROM Producto p WHERE p.iva = :iva")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProducto;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcionProducto")
    private String descripcionProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stockProducto")
    private int stockProducto;
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
    @Column(name = "stockMinimo")
    private int stockMinimo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "IVA")
    private String iva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private List<DetalleCompra> detalleCompraList;
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    @JoinColumn(name = "idPresentacionProducto", referencedColumnName = "idPresentacionProducto")
    @ManyToOne(optional = false)
    private PresentacionProducto idPresentacionProducto;
    @JoinColumn(name = "idUbicacionProducto", referencedColumnName = "idUbicacionProducto")
    @ManyToOne(optional = false)
    private UbicacionProducto idUbicacionProducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private List<DetalleVenta> detalleVentaList;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String codigoProducto, String nombreProducto, String descripcionProducto, int stockProducto, float valorCompraProducto, float valorVentaProducto, int stockMinimo, String iva) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.stockProducto = stockProducto;
        this.valorCompraProducto = valorCompraProducto;
        this.valorVentaProducto = valorVentaProducto;
        this.stockMinimo = stockMinimo;
        this.iva = iva;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
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

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    @XmlTransient
    public List<DetalleCompra> getDetalleCompraList() {
        return detalleCompraList;
    }

    public void setDetalleCompraList(List<DetalleCompra> detalleCompraList) {
        this.detalleCompraList = detalleCompraList;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public PresentacionProducto getIdPresentacionProducto() {
        return idPresentacionProducto;
    }

    public void setIdPresentacionProducto(PresentacionProducto idPresentacionProducto) {
        this.idPresentacionProducto = idPresentacionProducto;
    }

    public UbicacionProducto getIdUbicacionProducto() {
        return idUbicacionProducto;
    }

    public void setIdUbicacionProducto(UbicacionProducto idUbicacionProducto) {
        this.idUbicacionProducto = idUbicacionProducto;
    }

    @XmlTransient
    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
