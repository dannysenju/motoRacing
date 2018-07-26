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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Entity
@Table(name = "creditoCompra", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CreditoCompra.findAll", query = "SELECT c FROM CreditoCompra c")
    , @NamedQuery(name = "CreditoCompra.findByIdCreditoCompra", query = "SELECT c FROM CreditoCompra c WHERE c.idCreditoCompra = :idCreditoCompra")
    , @NamedQuery(name = "CreditoCompra.findByCreditoNuevo", query = "SELECT c FROM CreditoCompra c WHERE c.creditoNuevo = :creditoNuevo")
    , @NamedQuery(name = "CreditoCompra.findByFechaAbono", query = "SELECT c FROM CreditoCompra c WHERE c.fechaAbono = :fechaAbono")})
public class CreditoCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCreditoCompra")
    private Integer idCreditoCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creditoNuevo")
    private float creditoNuevo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAbono")
    @Temporal(TemporalType.DATE)
    private Date fechaAbono;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCreditoCompra")
    private DetalleCreditoCompra detalleCreditoCompra;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @OneToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @OneToOne(optional = false)
    private Persona idPersona;

    public CreditoCompra() {
    }

    public CreditoCompra(Integer idCreditoCompra) {
        this.idCreditoCompra = idCreditoCompra;
    }

    public CreditoCompra(Integer idCreditoCompra, float creditoNuevo, Date fechaAbono) {
        this.idCreditoCompra = idCreditoCompra;
        this.creditoNuevo = creditoNuevo;
        this.fechaAbono = fechaAbono;
    }

    public Integer getIdCreditoCompra() {
        return idCreditoCompra;
    }

    public void setIdCreditoCompra(Integer idCreditoCompra) {
        this.idCreditoCompra = idCreditoCompra;
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

    public DetalleCreditoCompra getDetalleCreditoCompra() {
        return detalleCreditoCompra;
    }

    public void setDetalleCreditoCompra(DetalleCreditoCompra detalleCreditoCompra) {
        this.detalleCreditoCompra = detalleCreditoCompra;
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
        hash += (idCreditoCompra != null ? idCreditoCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditoCompra)) {
            return false;
        }
        CreditoCompra other = (CreditoCompra) object;
        if ((this.idCreditoCompra == null && other.idCreditoCompra != null) || (this.idCreditoCompra != null && !this.idCreditoCompra.equals(other.idCreditoCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.CreditoCompra[ idCreditoCompra=" + idCreditoCompra + " ]";
    }
    
}
