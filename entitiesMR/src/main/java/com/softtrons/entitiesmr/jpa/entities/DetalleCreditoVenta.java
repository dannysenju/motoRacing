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
@Table(name = "detalleCreditoVenta", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCreditoVenta.findAll", query = "SELECT d FROM DetalleCreditoVenta d")
    , @NamedQuery(name = "DetalleCreditoVenta.findByIdDetalleCreditoVenta", query = "SELECT d FROM DetalleCreditoVenta d WHERE d.idDetalleCreditoVenta = :idDetalleCreditoVenta")
    , @NamedQuery(name = "DetalleCreditoVenta.findByCreditoVentaActual", query = "SELECT d FROM DetalleCreditoVenta d WHERE d.creditoVentaActual = :creditoVentaActual")
    , @NamedQuery(name = "DetalleCreditoVenta.findByAbonoCreditoVenta", query = "SELECT d FROM DetalleCreditoVenta d WHERE d.abonoCreditoVenta = :abonoCreditoVenta")})
public class DetalleCreditoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleCreditoVenta")
    private Integer idDetalleCreditoVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creditoVentaActual")
    private float creditoVentaActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "abonoCreditoVenta")
    private float abonoCreditoVenta;
    @JoinColumn(name = "idCreditoVenta", referencedColumnName = "idCreditoVenta")
    @OneToOne(optional = false)
    private CreditoVenta idCreditoVenta;
    @JoinColumn(name = "idVenta", referencedColumnName = "idVenta")
    @OneToOne(optional = false)
    private Venta idVenta;

    public DetalleCreditoVenta() {
    }

    public DetalleCreditoVenta(Integer idDetalleCreditoVenta) {
        this.idDetalleCreditoVenta = idDetalleCreditoVenta;
    }

    public DetalleCreditoVenta(Integer idDetalleCreditoVenta, float creditoVentaActual, float abonoCreditoVenta) {
        this.idDetalleCreditoVenta = idDetalleCreditoVenta;
        this.creditoVentaActual = creditoVentaActual;
        this.abonoCreditoVenta = abonoCreditoVenta;
    }

    public Integer getIdDetalleCreditoVenta() {
        return idDetalleCreditoVenta;
    }

    public void setIdDetalleCreditoVenta(Integer idDetalleCreditoVenta) {
        this.idDetalleCreditoVenta = idDetalleCreditoVenta;
    }

    public float getCreditoVentaActual() {
        return creditoVentaActual;
    }

    public void setCreditoVentaActual(float creditoVentaActual) {
        this.creditoVentaActual = creditoVentaActual;
    }

    public float getAbonoCreditoVenta() {
        return abonoCreditoVenta;
    }

    public void setAbonoCreditoVenta(float abonoCreditoVenta) {
        this.abonoCreditoVenta = abonoCreditoVenta;
    }

    public CreditoVenta getIdCreditoVenta() {
        return idCreditoVenta;
    }

    public void setIdCreditoVenta(CreditoVenta idCreditoVenta) {
        this.idCreditoVenta = idCreditoVenta;
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
        hash += (idDetalleCreditoVenta != null ? idDetalleCreditoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCreditoVenta)) {
            return false;
        }
        DetalleCreditoVenta other = (DetalleCreditoVenta) object;
        if ((this.idDetalleCreditoVenta == null && other.idDetalleCreditoVenta != null) || (this.idDetalleCreditoVenta != null && !this.idDetalleCreditoVenta.equals(other.idDetalleCreditoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.DetalleCreditoVenta[ idDetalleCreditoVenta=" + idDetalleCreditoVenta + " ]";
    }
    
}
