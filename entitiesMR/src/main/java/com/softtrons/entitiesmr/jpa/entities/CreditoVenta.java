/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softtrons.entitiesmr.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danny
 */
@MappedSuperclass
@Table(name = "creditoVenta", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
public class CreditoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCreditoVenta")
    private Integer idCreditoVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creditoNuevo")
    private float creditoNuevo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAbono")
    @Temporal(TemporalType.DATE)
    private Date fechaAbono;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCreditoVenta", fetch = FetchType.EAGER)
    private DetalleCreditoVenta detalleCreditoVenta;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Empleado idEmpleado;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Persona idPersona;

    public CreditoVenta() {
    }

    public CreditoVenta(Integer idCreditoVenta) {
        this.idCreditoVenta = idCreditoVenta;
    }

    public CreditoVenta(Integer idCreditoVenta, float creditoNuevo, Date fechaAbono) {
        this.idCreditoVenta = idCreditoVenta;
        this.creditoNuevo = creditoNuevo;
        this.fechaAbono = fechaAbono;
    }

    public Integer getIdCreditoVenta() {
        return idCreditoVenta;
    }

    public void setIdCreditoVenta(Integer idCreditoVenta) {
        this.idCreditoVenta = idCreditoVenta;
    }

    public float getCreditoNuevo() {
        return creditoNuevo;
    }

    public void setCreditoNuevo(float creditoNuevo) {
        this.creditoNuevo = creditoNuevo;
    }

    public Date getFechaAbono() {
        return fechaAbono;
    }

    public void setFechaAbono(Date fechaAbono) {
        this.fechaAbono = fechaAbono;
    }

    public DetalleCreditoVenta getDetalleCreditoVenta() {
        return detalleCreditoVenta;
    }

    public void setDetalleCreditoVenta(DetalleCreditoVenta detalleCreditoVenta) {
        this.detalleCreditoVenta = detalleCreditoVenta;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCreditoVenta != null ? idCreditoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditoVenta)) {
            return false;
        }
        CreditoVenta other = (CreditoVenta) object;
        if ((this.idCreditoVenta == null && other.idCreditoVenta != null) || (this.idCreditoVenta != null && !this.idCreditoVenta.equals(other.idCreditoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.CreditoVenta[ idCreditoVenta=" + idCreditoVenta + " ]";
    }
    
}
