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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "Empleado", catalog = "moto10racingHBT", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Empleado.findByIdentificacionEmpleado", query = "SELECT e FROM Empleado e WHERE e.identificacionEmpleado = :identificacionEmpleado")
    , @NamedQuery(name = "Empleado.findByNombresEmpleado", query = "SELECT e FROM Empleado e WHERE e.nombresEmpleado = :nombresEmpleado")
    , @NamedQuery(name = "Empleado.findByApellidosEmpleado", query = "SELECT e FROM Empleado e WHERE e.apellidosEmpleado = :apellidosEmpleado")
    , @NamedQuery(name = "Empleado.findByDireccionEmpleado", query = "SELECT e FROM Empleado e WHERE e.direccionEmpleado = :direccionEmpleado")
    , @NamedQuery(name = "Empleado.findByTelefonoEmpleado", query = "SELECT e FROM Empleado e WHERE e.telefonoEmpleado = :telefonoEmpleado")
    , @NamedQuery(name = "Empleado.findByCorreoEmpleado", query = "SELECT e FROM Empleado e WHERE e.correoEmpleado = :correoEmpleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "identificacionEmpleado")
    private int identificacionEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombresEmpleado")
    private String nombresEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "apellidosEmpleado")
    private String apellidosEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "direccionEmpleado")
    private String direccionEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "telefonoEmpleado")
    private String telefonoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correoEmpleado")
    private String correoEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<Usuario> usuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<Venta> ventaList;
    @JoinColumn(name = "idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad idCiudad;
    @JoinColumn(name = "idDepartamento", referencedColumnName = "idDepartamento")
    @ManyToOne(optional = false)
    private Departamento idDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<CreditoVenta> creditoVentaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpelado")
    private List<EmpleadoRoles> empleadoRolesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private CreditoCompra creditoCompra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<Compra> compraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpleadoUsuarios> empleadoUsuariosList;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(Integer idEmpleado, int identificacionEmpleado, String nombresEmpleado, String apellidosEmpleado, String direccionEmpleado, String telefonoEmpleado, String correoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.identificacionEmpleado = identificacionEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.correoEmpleado = correoEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdentificacionEmpleado() {
        return identificacionEmpleado;
    }

    public void setIdentificacionEmpleado(int identificacionEmpleado) {
        this.identificacionEmpleado = identificacionEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @XmlTransient
    public List<CreditoVenta> getCreditoVentaList() {
        return creditoVentaList;
    }

    public void setCreditoVentaList(List<CreditoVenta> creditoVentaList) {
        this.creditoVentaList = creditoVentaList;
    }

    @XmlTransient
    public List<EmpleadoRoles> getEmpleadoRolesList() {
        return empleadoRolesList;
    }

    public void setEmpleadoRolesList(List<EmpleadoRoles> empleadoRolesList) {
        this.empleadoRolesList = empleadoRolesList;
    }

    public CreditoCompra getCreditoCompra() {
        return creditoCompra;
    }

    public void setCreditoCompra(CreditoCompra creditoCompra) {
        this.creditoCompra = creditoCompra;
    }

    @XmlTransient
    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    @XmlTransient
    public List<EmpleadoUsuarios> getEmpleadoUsuariosList() {
        return empleadoUsuariosList;
    }

    public void setEmpleadoUsuariosList(List<EmpleadoUsuarios> empleadoUsuariosList) {
        this.empleadoUsuariosList = empleadoUsuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.softtrons.entitiesmr.jpa.entities.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
