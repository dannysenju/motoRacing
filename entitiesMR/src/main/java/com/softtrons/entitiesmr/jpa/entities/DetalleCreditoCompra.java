/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.entitiesmr.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danny
 */
@Entity
@Table(name = "detalleCreditoCompra", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCreditoCompra.findAll", query = "SELECT d FROM DetalleCreditoCompra d")
    , @NamedQuery(name = "DetalleCreditoCompra.findByIdDetalleCreditoCompra", query = "SELECT d FROM DetalleCreditoCompra d WHERE d.idDetalleCreditoCompra = :idDetalleCreditoCompra")
    , @NamedQuery(name = "DetalleCreditoCompra.findByCreditoCompraActual", query = "SELECT d FROM DetalleCreditoCompra d WHERE d.creditoCompraActual = :creditoCompraActual")
    , @NamedQuery(name = "DetalleCreditoCompra.findByAbonoCreditoCompra", query = "SELECT d FROM DetalleCreditoCompra d WHERE d.abonoCreditoCompra = :abonoCreditoCompra")})
public class DetalleCreditoCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleCreditoCompra")
    private Integer idDetalleCreditoCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creditoCompraActual")
    private float creditoCompraActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "abonoCreditoCompra")
    private float abonoCreditoCompra;
    @JoinColumn(name = "idCompra", referencedColumnName = "idCompra")
    @OneToOne(optional = false)
    private Compra idCompra;
    @JoinColumn(name = "idCreditoCompra", referencedColumnName = "idCreditoCompra")
    @OneToOne(optional = false)
    private CreditoCompra idCreditoCompra;

    public DetalleCreditoCompra() {
    }

    public DetalleCreditoCompra(Integer idDetalleCreditoCompra) {
        this.idDetalleCreditoCompra = idDetalleCreditoCompra;
    }

    public DetalleCreditoCompra(Integer idDetalleCreditoCompra, float creditoCompraActual, float abonoCreditoCompra) {
        this.idDetalleCreditoCompra = idDetalleCreditoCompra;
        this.creditoCompraActual = creditoCompraActual;
        this.abonoCreditoCompra = abonoCreditoCompra;
    }

    public Integer getIdDetalleCreditoCompra() {
        return idDetalleCreditoCompra;
    }

    public void setIdDetalleCreditoCompra(Integer idDetalleCreditoCompra) {
        this.idDetalleCreditoCompra = idDetalleCreditoCompra;
    }

    public float getCreditoCompraActual() {
        return creditoCompraActual;
    }

    public void setCreditoCompraActual(float creditoCompraActual) {
        this.creditoCompraActual = creditoCompraActual;
    }

    public float getAbonoCreditoCompra() {
        return abonoCreditoCompra;
    }

    public void setAbonoCreditoCompra(float abonoCreditoCompra) {
        this.abonoCreditoCompra = abonoCreditoCompra;
    }

    public Compra getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Compra idCompra) {
        this.idCompra = idCompra;
    }

    public CreditoCompra getIdCreditoCompra() {
        return idCreditoCompra;
    }

    public void setIdCreditoCompra(CreditoCompra idCreditoCompra) {
        this.idCreditoCompra = idCreditoCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCreditoCompra != null ? idDetalleCreditoCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCreditoCompra)) {
            return false;
        }
        DetalleCreditoCompra other = (DetalleCreditoCompra) object;
        if ((this.idDetalleCreditoCompra == null && other.idDetalleCreditoCompra != null) || (this.idDetalleCreditoCompra != null && !this.idDetalleCreditoCompra.equals(other.idDetalleCreditoCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.DetalleCreditoCompra[ idDetalleCreditoCompra=" + idDetalleCreditoCompra + " ]";
    }
    
}
